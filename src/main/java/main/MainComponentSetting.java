package main;

import beans.ComponentSetting.BeanComponentSettingConfig;
import beans.ComponentSetting.TestBeans.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainComponentSetting {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanComponentSettingConfig.class);

        TestBean1 t26 = ctx.getBean(TestBean1.class);
        System.out.printf("t26 : %s\n", t26);

        TestBean1 t27 = ctx.getBean(TestBean1.class);
        System.out.printf("t27 : %s\n", t27);

        TestBean2 t28 = ctx.getBean("t28",TestBean2.class);
        System.out.printf("t28 : %s\n", t28);

        TestBean2 t29 = ctx.getBean("t29",TestBean2.class);
        System.out.printf("t29 : %s\n", t29);

        TestBean2 t30 = ctx.getBean("t30",TestBean2.class);
        System.out.printf("t30 : %s\n", t30);

        System.out.println("================@Lazy=================");
        // @Lazy annotation 이용, getBean 호출할 때 마다 새 객체를 생성된다.
        TestBean3 t31 = ctx.getBean("t31", TestBean3.class);
        System.out.printf("t31 : %s\n", t31);

        System.out.println("================@Scope(prototype)=================");
        // @Scope("prototype") 설정으로 getBean 을 호출할 때 마다 새 객체를 생성.
        TestBean4 t32 = ctx.getBean(TestBean4.class);
        System.out.printf("t32 : %s\n", t32);

        TestBean4 t33 = ctx.getBean(TestBean4.class);
        System.out.printf("t33 : %s\n", t33);

        // @PostConstruct / @PreDestroy annotation 이용하여 init/ destroy 메서드 생성.
        System.out.println("================@PostConstruct / @PreDestroy=================");
        TestBean5 t34 = ctx.getBean(TestBean5.class);
        System.out.printf("t34 : %s\n", t34);

        ctx.close();
    }
}
