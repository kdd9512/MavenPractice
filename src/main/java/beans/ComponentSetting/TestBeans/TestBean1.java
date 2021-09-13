package beans.ComponentSetting.TestBeans;

import org.springframework.stereotype.Component;

// 타입을 통해 등록 된 빈 객체를 가져올 수 있다.
// IoC 컨테이너 객체를 생성할 때 자동으로 객체가 생성된다.
// singleton
@Component
public class TestBean1 {

    public TestBean1(){
        System.out.println("TestBean1 의 생성자");
    }
}
