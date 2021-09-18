package main;

import beans.AOPJava.BeanConfigAOPJ;
import beans.AOPJava.TestBeans.TestBeanAOPJ;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAOPJ {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        TestBeanAOPJ t37 = ctx1.getBean(TestBeanAOPJ.class);
        try {
            t37.AOPJ1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ctx1.close();

        System.out.println("=================Annotation=================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigAOPJ.class);

        TestBeanAOPJ j1 = ctx2.getBean(TestBeanAOPJ.class);
        try {
            j1.AOPJ1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ctx2.close();
    }
}
