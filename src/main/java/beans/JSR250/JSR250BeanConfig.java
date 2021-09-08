package beans.JSR250;

import beans.JSR250.JSRData.*;
import beans.JSR250.TestJSR.*;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import javax.annotation.Resource;

@Configuration
public class JSR250BeanConfig {


    // 기존방식. Bean 에 직접 init/destroy 메서드를 지정하는 방법.
    @Bean(initMethod = "jsrInit", destroyMethod = "jsrDest")
    @Lazy
    public TestJSR250a jsr1(){
        return new TestJSR250a();
    }

    // 새로운 방식.
    // "@PostConstruct" 와 "@PreDestroy" annotation 을
    // init/destroy 메서드에 붙히는 방법.
    // 파일 TestJSR250b.java 참고.
    @Bean
    @Lazy
    public TestJSR250b jsr2(){
        return new TestJSR250b();
    }

    @Bean
    public JSRData1 jsrData1() {
        return new JSRData1();
    }

    @Bean
    public JSRData2 jsrData2() {
        return new JSRData2();
    }

    // @Bean 에 직접 자동주입 조건을 붙혀 자동주입(여기서는 메서드명으로 하였음).
    @Bean(autowire = Autowire.BY_NAME)
    public TestJSR250c jsr3(){
        return new TestJSR250c();
    }

    @Bean
    public TestJSR250d jsr4(){
        return new TestJSR250d();
    }

    @Bean
    public TestJSR250e jsr5(){
        return new TestJSR250e();
    }

    @Bean
    public TestJSR250f jsr6(){
        return new TestJSR250f();
    }

}
