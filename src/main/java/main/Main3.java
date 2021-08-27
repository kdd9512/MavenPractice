package main;

import beans.TestC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        // id가 t3인 bean 객체의 주소값을 받아온다.
        TestC t3 = ctx.getBean("t3", TestC.class);
        System.out.printf("t3 : %s\n",t3);

        // id가 t4인 bean 객체의 주소값을 받아온다.
        TestC t4 = ctx.getBean("t4", TestC.class);
        System.out.printf("t4 : %s\n",t4);

        // 같은 주소로 다시 주소값을 받아온다고 하더라도, singleton 이기 때문에 객체가 또 생성되지 않으며, 객체의 주소값만 받아온다.
        TestC t5 = ctx.getBean("t4", TestC.class);
        System.out.printf("t5 : %s\n",t5);

        ctx.close();
    }
}
