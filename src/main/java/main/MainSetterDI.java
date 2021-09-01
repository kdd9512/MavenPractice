package main;

import beans.TestSetterDI.TestSetterDI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetterDI {
    public static void main(String[] args) {
        TestSetterDI obj10 = new TestSetterDI();
        obj10.setData1(50);
        System.out.printf("obj10.data1 : %d\n",obj10.getData1());

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        TestSetterDI t12 = ctx.getBean("t12",TestSetterDI.class);
        System.out.printf("t12.data1 : %d\n", t12.getData1());
        System.out.printf("t12.data2 : %f\n", t12.getData2());
        System.out.printf("t12.data3 : %s\n", t12.isData3());
        System.out.printf("t12.data4 : %s\n", t12.getData4());
        System.out.printf("t12.data5 : %s\n", t12.getData5());
        System.out.printf("t12.data6 : %s\n", t12.getData6());

        ctx.close();
    }
}
