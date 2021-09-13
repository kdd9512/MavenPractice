package beans.ComponentSetting.TestBeans;

import org.springframework.stereotype.Component;

// IoC 컨테이너ㅏ 만들어질 때 자동으로 객체 생성.
// 객체의 주소값을 가져올 때, 이름을 통해 가져올 수 있다.
// singleton
@Component("t28")
public class TestBean2 {

    public TestBean2(){
        System.out.println("TestBean2 의 생성자");
    }
}
