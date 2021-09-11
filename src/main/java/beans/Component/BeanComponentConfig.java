package beans.Component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 지정된 패키지의 Bean 클래스들의 annotation 을 분석하여 Bean 을 등록하게끔 지정.
// 보통 경로복사 후 붙혀넣기식으로 주소를 입력할 것인데, 이때, 각 경로를 / 가 아니라 . 으로 나눔을 주의.
// 검색할 경로가 한 개 이상인 경우 이하와 같이 @ComponentScan 을 추가하고 해당 경로를 입력하면 된다.
@ComponentScan(basePackages = "beans.Component.TestBeans")
@ComponentScan(basePackages = "beans.Component.TestBeans2")
public class BeanComponentConfig {

    @Bean
    public TestForComponent javaComp1(){
        return new TestForComponent();
    }

    @Bean
    public TestForComponent2 javaComp2(){
        return new TestForComponent2();
    }

    @Bean
    public TestForComponent2 javaComp3(){
        return new TestForComponent2();
    }


}
