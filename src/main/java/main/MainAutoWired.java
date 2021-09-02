package main;

import beans.TestAutoWired.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutoWired {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        // byName
        TestAutoWired obj10 = ctx.getBean("obj10",TestAutoWired.class);
        System.out.printf("obj10.data1 : %s\n", obj10.getData1());
        System.out.printf("obj10.data2 : %s\n", obj10.getData2());

        System.out.println("-------------------------");
        TestAutoWired obj11 = ctx.getBean("obj11",TestAutoWired.class);
        System.out.printf("obj11.data1 : %s\n", obj11.getData1());
        System.out.printf("obj11.data2 : %s\n", obj11.getData2());


        // byType
        System.out.println("-------------------------");
        TestAutoWired2 obj12 = ctx.getBean("obj12",TestAutoWired2.class);
        System.out.printf("obj12.data3 : %s\n", obj12.getData3());
        System.out.printf("obj12.data4 : %s\n", obj12.getData4());


        //constructor
        System.out.println("-------------------------");
        TestAutoWired3 obj13 = ctx.getBean("obj13",TestAutoWired3.class);
        System.out.printf("obj13.data3 : %d\n", obj13.getData5());
        System.out.printf("obj13.data4 : %s\n", obj13.getData6());
        System.out.printf("obj13.data4 : %s\n", obj13.getData7());
        System.out.printf("obj13.data4 : %s\n", obj13.getData8());


        // constructor autowired
        System.out.println("-------------------------");
        TestAutoWired3 obj14 = ctx.getBean("obj14",TestAutoWired3.class);
        System.out.printf("obj14.data3 : %d\n", obj14.getData5());
        System.out.printf("obj14.data4 : %s\n", obj14.getData6());
        System.out.printf("obj14.data4 : %s\n", obj14.getData7());
        System.out.printf("obj14.data4 : %s\n", obj14.getData8());

        System.out.println("-------------------------");
        TestAutoWired3 obj15 = ctx.getBean("obj15",TestAutoWired3.class);
        System.out.printf("obj15.data3 : %d\n", obj15.getData5());
        System.out.printf("obj15.data4 : %s\n", obj15.getData6());
        System.out.printf("obj15.data4 : %s\n", obj15.getData7());
        System.out.printf("obj15.data4 : %s\n", obj15.getData8());

        System.out.println("-------------------------");
        TestAutoWired3 obj16 = ctx.getBean("obj16",TestAutoWired3.class);
        System.out.printf("obj16.data3 : %d\n", obj16.getData5());
        System.out.printf("obj16.data4 : %s\n", obj16.getData6());
        System.out.printf("obj16.data4 : %s\n", obj16.getData7());
        System.out.printf("obj16.data4 : %s\n", obj16.getData8());


        // using default autowire (default-autowire="byName")
        System.out.println("-------------------------");
        TestAutoWired obj17 = ctx.getBean("obj17",TestAutoWired.class);
        System.out.printf("obj17.data1 : %s\n",obj17.getData1());
        System.out.printf("obj17.data2 : %s\n",obj17.getData2());


        // autowire="no"
        System.out.println("-------------------------");
        TestAutoWired obj18 = ctx.getBean("obj18",TestAutoWired.class);
        System.out.printf("obj18.data1 : %s\n",obj18.getData1());
        System.out.printf("obj18.data2 : %s\n",obj18.getData2());

        ctx.close();
    }
}
