package main;

import beans.TestC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        // id가 t3인 bean 객체의 주소값을 받아온다.
        TestC t3 = ctx.getBean("t3", TestC.class);
        System.out.printf("t3 : %s\n",t3);

        ctx.close();
    }
}
