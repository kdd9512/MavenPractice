package main;

import beans.TestEmptyObj.TestC;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmptyObj {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        // id가 t3인 bean 객체의 주소값을 받아온다.
        TestC t3 = ctx.getBean("t3", TestC.class);
        System.out.printf("t3 : %s\n",t3);

        // id가 t4인 bean 객체의 주소값을 받아온다.
        TestC t4 = ctx.getBean("t4", TestC.class);
        System.out.printf("t4 : %s\n",t4);

        // 같은 주소로 다시 주소값을 받아온다고 하더라도, singleton 이기 때문에 객체가 또 생성되지 않으며, 객체의 주소값만 받아온다.
        // 즉, 결과값에 "TestC 의 생성자(= TestC)" 가 출력되지 "않음".
        TestC t5 = ctx.getBean("t4", TestC.class);
        System.out.printf("t5 : %s\n",t5);

        // id가 t5인 bean 객체의 주소값을 받아온다.
        TestC t6 = ctx.getBean("t5", TestC.class);
        System.out.printf("t6 : %s\n",t6);

        // scope 를 prototype 으로 설정했으므로, 같은 bean을 호출해도 다른 class 값을 출력한다. 매 번 새로운 객체를 생성하기 때문.
        TestC t7 = ctx.getBean("t5", TestC.class);
        System.out.printf("t7 : %s\n",t7);

        ctx.close();
    }
}
