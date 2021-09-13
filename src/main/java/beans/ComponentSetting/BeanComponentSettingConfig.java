package beans.ComponentSetting;

import beans.ComponentSetting.TestBeans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans.ComponentSetting.TestBeans")
public class BeanComponentSettingConfig {

    // 같은 클래스 타입의 Bean 을 복수 생성할 때에 사용한다.

    @Bean
    public TestBean2 t29(){
        return new TestBean2();
    }

    @Bean
    public TestBean2 t30(){
        return new TestBean2();
    }

}
