package main;

import beans.ComponentSetting.BeanComponentSettingConfig;
import beans.ComponentSetting.TestBeans.TestBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainComponentSetting {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanComponentSettingConfig.class);

        TestBean1 t26 = ctx.getBean(TestBean1.class);
        System.out.printf("t26 : %s\n", t26);

        ctx.close();
    }
}
