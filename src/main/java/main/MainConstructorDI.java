package main;

import beans.TestConstructorDI.DataBean;
import beans.TestConstructorDI.TestConstructorDI;
import beans.TestConstructorDI.TestConstructorDI2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConstructorDI {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        TestConstructorDI t12 = new TestConstructorDI();
        t12.printData();

        System.out.println("---------------------------------------");
        TestConstructorDI t13 = new TestConstructorDI(50);
        t13.printData();

        System.out.println("---------------------------------------");
        TestConstructorDI t14 = new TestConstructorDI("문자");
        t14.printData();

        // 이 방법을 이용할 경우, 데이터의 순서는 TestConstructorDI 에서 정의한 데이터의 순서와 반드시 일치해야 한다.
        System.out.println("---------------------------------------");
        TestConstructorDI t15 = new TestConstructorDI(1972, 11.21, "김두한");
        t15.printData();

        // injection 이용하여 출력.
        System.out.println("---------------------------------------");
        TestConstructorDI obj1 = ctx.getBean("obj1", TestConstructorDI.class);
        obj1.printData();

        System.out.println("---------------------------------------");
        TestConstructorDI obj2 = ctx.getBean("obj2",TestConstructorDI.class);
        obj2.printData();

        System.out.println("---------------------------------------");
        TestConstructorDI obj3 = ctx.getBean("obj3",TestConstructorDI.class);
        obj3.printData();

        System.out.println("---------------------------------------");
        TestConstructorDI obj4 = ctx.getBean("obj4",TestConstructorDI.class);
        obj4.printData();

        System.out.println("---------------------------------------");
        TestConstructorDI obj5 = ctx.getBean("obj5",TestConstructorDI.class);
        obj5.printData();

        System.out.println("---------------------------------------");
        TestConstructorDI obj6 = ctx.getBean("obj6",TestConstructorDI.class);
        obj6.printData();

        System.out.println("---------------------------------------");
        TestConstructorDI obj7 = ctx.getBean("obj7",TestConstructorDI.class);
        obj7.printData();

        // java 이용하여 객체를 주입.
        System.out.println("---------------------------------------");
        DataBean d1 = new DataBean();
        DataBean d2 = new DataBean();
        TestConstructorDI2 tst = new TestConstructorDI2(d1,d2);
        tst.printData();

        // bean 에서 객체를 주입.
        System.out.println("---------------------------------------");
        TestConstructorDI2 obj8 = ctx.getBean("obj8",TestConstructorDI2.class);
        obj8.printData();

        // 이미 만들어져 있는 bean 을 주입.
        System.out.println("---------------------------------------");
        TestConstructorDI2 obj9 = ctx.getBean("obj9",TestConstructorDI2.class);
        obj9.printData();

        ctx.close();
    }
}
