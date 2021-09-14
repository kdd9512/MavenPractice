package main;

import beans.SpringAOP.AOPBeans.TestBeanAOP;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAOPXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        TestBeanAOP t33 = ctx.getBean("t33", TestBeanAOP.class);
        int i1 = t33.TestBeanAOP();
        System.out.printf("TestBeanAOP.return : %d\n",i1);

        ctx.close();
    }
}
