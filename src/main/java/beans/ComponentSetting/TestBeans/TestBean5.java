package beans.ComponentSetting.TestBeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Lazy
public class TestBean5 {

    public TestBean5() {
        System.out.println("TestBean5 의 생성자.");
    }

    @PostConstruct
    public void tb5Init(){
        System.out.println("TestBean5 의 init 메서드");
    }

    @PreDestroy
    public void tb5Dest(){
        System.out.println("TestBean5 의 destroy 메서드");
    }
}
