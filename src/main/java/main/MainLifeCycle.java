package main;

import beans.TestLifeCycle.TestLifeCycle;
import beans.TestLifeCycle.TestLifeCycle2;
import beans.TestLifeCycle.TestLifeCycle3;
import beans.TestLifeCycle.TestLifeCycle4;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        System.out.println("------------------");
        TestLifeCycle t6 = ctx.getBean("t6", TestLifeCycle.class);
        System.out.printf("t6 : %s\n",t6);

        System.out.println("------------------");
        TestLifeCycle2 t7 = ctx.getBean("t7",TestLifeCycle2.class);
        System.out.printf("t7 : %s\n",t7);

        System.out.println("------------------");
        TestLifeCycle3 t8 = ctx.getBean("t8",TestLifeCycle3.class);
        System.out.printf("t8 : %s\n",t8);

        System.out.println("------------------");
        TestLifeCycle4 t9 = ctx.getBean("t9",TestLifeCycle4.class);
        System.out.printf("t9 : %s\n",t9);
        System.out.println("------------------");


        ctx.close();
    }
}
