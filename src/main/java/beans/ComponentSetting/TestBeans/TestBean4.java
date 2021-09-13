package beans.ComponentSetting.TestBeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// getBean 메서드를 호출할 때 마다 새 객체를 생성하여 반환한다.
@Scope("prototype")
public class TestBean4 {

    public TestBean4(){
        System.out.println("TestBean4 의 생성자.");
    }
}
