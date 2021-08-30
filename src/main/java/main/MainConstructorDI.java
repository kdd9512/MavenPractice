package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConstructorDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");


        ctx.close();
    }
}
