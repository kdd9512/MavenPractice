package beans.JSR250.TestJSR;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestJSR250b {

    public TestJSR250b(){
        System.out.println("TestJSR250b 의 생성자.");
    }

    // init 메서드 지정을 위한 "@PostConstruct"
    @PostConstruct
    public void jsrInit2(){
        System.out.println("TestJSR250b 의 init 메서드");
    }

    // destroy 메서드 지정을 위한 "@PreDestroy"
    @PreDestroy
    public void jsrDest2(){
        System.out.println("TestJSR250b 의 destroy 메서드");
    }
}
