package beans.BeanConfigClass;

import org.springframework.context.annotation.*;

// @Configuration annotation 이 붙은 java 파일은 빈 등록을 위한 java 파일임을 알려주는 것.
// 이 파일이 beans.xml 의 역할을 수행한다.
@Configuration
public class BeanConfigClass {
    /*
    * @Bean : bean 객체를 정의할 때 사용.
    * 메서드의 이름이 곧 bean 의 이름이 된다.
    * @Bean(name = 지정할 이름) : bean 의 이름을 새롭게 정의한다.
    * @Lazy : lazy-init 속성 지정.
    * @Scope : bean 의 scope 속성 지정(singleton, prototype).
    * @Primary : primary 속성 지정.
    */

    // @Bean : bean 객체를 정의할 때 사용. 메서드의 이름(여기서는 TestBean)이 곧 bean 의 이름이 된다.
    @Bean
    public TestBeanConfigClass TestBean(){
        TestBeanConfigClass t13 = new TestBeanConfigClass();
        return t13;
    }

    // @Bean(name = 지정할 이름) : bean 의 이름을 새롭게 정의한다.
    // @Bean(name = "j1") annotation 으로 이름이 변경되었으므로, 이 bean 을 호출하려면
    // TestBean1으로 getBean 을 하는 것이 아니라 j1 으로 호출해야 한다.
    @Bean(name = "j1")
    public TestBeanConfigClass TestBean1(){
        TestBeanConfigClass t14 = new TestBeanConfigClass();
        return t14;
    }

    // @Lazy : lazy-init 속성 지정.
    // 이 annotation 이 붙은 메서드에 lazy-init="true" 와 같은 효과를 부여.
    @Lazy
    @Bean(name = "j2")
    public TestBeanConfigClass2 TestLazyBean(){
        TestBeanConfigClass2 t15 = new TestBeanConfigClass2();
        return t15;
    }

    // @Scope("지정할 타입") : bean 의 scope 속성 지정(singleton, prototype).
    @Scope("prototype")
    @Bean(name = "j3")
    public TestBeanConfigClass2 TestBeanScope(){
        TestBeanConfigClass2 t15 = new TestBeanConfigClass2();
        return t15;
    }

    // @Primary : primary 속성 지정.
    // 같은 class 를 갖는 bean 이 복수 존재할 경우,
    // 그 중 우선순위를 설정하기 위해 이 annotation 을 추가하여 우선적으로 호출되게끔 설정한다.
    @Primary
    @Bean(name = "j4")
    public TestBeanConfigClass3 TestPrimaryBean1(){
        TestBeanConfigClass3 tbc3 = new TestBeanConfigClass3();
        return tbc3;
    }

    @Bean(name = "j4")
    public TestBeanConfigClass3 TestPrimaryBean2(){
        TestBeanConfigClass3 tbc3 = new TestBeanConfigClass3();
        return tbc3;
    }
}
