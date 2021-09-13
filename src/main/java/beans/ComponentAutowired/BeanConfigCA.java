package beans.ComponentAutowired;

import beans.ComponentAutowired.DataBeanAutowired.*;
import beans.ComponentAutowired.TestBeansAutowired.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans.ComponentAutowired")
public class BeanConfigCA {

    // 같은 class 의 메서드. 메서드명만 다르게.
    @Bean
    public DataBeanCA3 dBeanCA3() {
        return new DataBeanCA3();
    }

    @Bean
    public DataBeanCA3 dBeanCA4() {
        return new DataBeanCA3();
    }

    // 값을 직접 입력해준다.
    @Bean
    public TestBeanCA3 dBeanCA5() {
        TestBeanCA3 tb2 = new TestBeanCA3(
                1972,
                "돼지 신정식",
                new DataBeanCA4(),
                new DataBeanCA5()
        );
        return tb2;
    }
}
