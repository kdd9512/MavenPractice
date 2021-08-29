package beans.TestBeanPostProcessor.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {
    // bean
    // beanName 에는 beans.xml 에서 정의한 bean 의 id 값이 들어온다.


    // init 메서드 호출 전에
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        // beanName 을 이용하여 값에 따라 다른 결과를 return 하게끔 코드 작성.
        // break;로 해당 조건 만족하면 종료하게끔.
        switch (beanName) {
            case "t10":
                System.out.println("BEFORE");
                break;
            case "t11":
                System.out.println("前");
                break;
            default:
                System.out.println("before");
                break;
        }
        return bean;
    }

    // init 메서드 호출 후에.
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after");
        return bean;
    }
}
