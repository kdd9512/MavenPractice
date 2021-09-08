package main;

import beans.JSR250.JSR250BeanConfig;
import beans.JSR250.TestJSR.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJSR250 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JSR250BeanConfig.class);

        // init 메서드와 destroy 메서드.
        // @Bean 에 init/destroy 메서드 직접 지정.
        TestJSR250a jsr1 = ctx.getBean("jsr1", TestJSR250a.class);

        // TestJSR250b 클래스파일 내부의 init/destroy 메서드에 각각
        // @PostConstruct 와 @PreDestroy 를 붙혀 init/destroy 메서드를 지정하는는 방식.
       TestJSR250b jsr2 = ctx.getBean("jsr2", TestJSR250b.class);


        // @Bean 에 직접 자동주입 조건을 붙혀 자동주입.
        System.out.println("----------------------------------------------");
        TestJSR250c jsr3 = ctx.getBean("jsr3", TestJSR250c.class);
        System.out.printf("jsr3.jsrData1 : %s\n",jsr3.getJsrData1());
        System.out.printf("jsr3.jsrData2 : %s\n",jsr3.getJsrData2());

        // @Autowired + @Qualifier 를 이용하여 메서드명으로 자동주입.
        System.out.println("----------------------------------------------");
        TestJSR250d jsr4 = ctx.getBean("jsr4",TestJSR250d.class);
        System.out.printf("jsr4.jsrData1 : %s\n",jsr4.getJsrData1());
        System.out.printf("jsr4.jsrData2 : %s\n",jsr4.getJsrData2());

        // @Resource 를 이용하여 변수명과 같은 bean 을 자동주입.
        System.out.println("----------------------------------------------");
        TestJSR250e jsr5 = ctx.getBean("jsr5",TestJSR250e.class);
        System.out.printf("jsr5.jsrData1 : %s\n",jsr5.getJsrData1());
        System.out.printf("jsr5.jsrData2 : %s\n",jsr5.getJsrData2());

        // @Resource 변수의 이름과 주입하고자 하는 bean 의 이름이 다른 경우.
        // @Resource(name = "지정할이름") 으로 이름을 바꿔서 변수명을 맞춰준다.
        System.out.println("----------------------------------------------");
        TestJSR250f jsr6 = ctx.getBean("jsr6",TestJSR250f.class);
        System.out.printf("jsr6.jData1(name = jsrData1) : %s\n",jsr6.getjData1());
        System.out.printf("jsr6.jData1(name = jsrData2) : %s\n",jsr6.getjData2());

        ctx.close();
    }
}
