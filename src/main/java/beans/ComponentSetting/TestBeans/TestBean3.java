package beans.ComponentSetting.TestBeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// getBean 을 호출할때만 생성자를 생성한다.
// singleton
@Component("t31")
@Lazy
public class TestBean3 {

    public TestBean3() {
        System.out.println("TestBean3 의 생성자.");
    }
}
