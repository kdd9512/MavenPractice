package main;

import beans.TestBeanPostProcessor.TestBpp;
import beans.TestBeanPostProcessor.TestBpp2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanPostProcessor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        TestBpp t10 = ctx.getBean("t10", TestBpp.class);
        System.out.printf("t10 : %s\n", t10);

        System.out.println("----------------------------------------");
        TestBpp2 t11 = ctx.getBean("t11", TestBpp2.class);
        System.out.printf("t11 : %s\n", t11);

        System.out.println("----------------------------------------");


        ctx.close();
    }
}
