package beans.ComponentAutowired.TestBeansAutowired;

import beans.ComponentAutowired.DataBeanAutowired.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TestBeanCA1 {

    @Autowired
    private DataBeanCA1 data1;

    // dBeanCA2 라는 이름을 가진 Bean 을 자동주입한다.
    // 하지만, 같은 package 내에서 같은 이름의 클래스를 2개 이상 만들수 없고,
    // @Component 에는 단 한 가지 이름만 가능하기에 사실상 의미는 없음.
    // 이 방법보다는 BeanConfig 파일 내에 @Bean 설정해서 주입하는게 더 낫다.
    // 해당 방식은 data4 에 적용되어있으므로 참고(BeanConfigCA 파일 내부 참고.).
    @Autowired
    @Qualifier("dBeanCA2")
    private DataBeanCA2 data2;

    // @Resource annotation 이용하여 데이터를 호출
    @Resource(name = "dBeanCA3")
    private DataBeanCA3 data3;

    @Resource(name = "dBeanCA4")
    private DataBeanCA3 data4;


    public DataBeanCA1 getData1() {
        return data1;
    }

    public DataBeanCA2 getData2() {
        return data2;
    }

    public DataBeanCA3 getData3() {
        return data3;
    }

    public DataBeanCA3 getData4() {
        return data4;
    }
}
