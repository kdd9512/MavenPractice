package beans.InitDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class BeanConfigClass2 {

    // @Bean(initMethod = "해당 메서드이름", destroyMethod = "해당 메서드이름")
    // 위의 괄호와 안의 내용을 추가하는 것으로 bean 에 붙혔던 init-method/destroy-method 와 같은 효과를 낸다.
    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public TestInitDestroy TestInDe(){
        return new TestInitDestroy();
    }

}
