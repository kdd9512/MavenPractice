package main;

import beans.ExecutionDirective.ExecutionBeans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainExecutionDirective {
    public static void main(String[] args) {
        // IoC Container 생성.
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        // Bean 호출
        TestBeanExe t34 = ctx.getBean("t34", TestBeanExe.class);
        // Class 내부 메서드 호출
        t34.BeanExc();

        // 관심사로 등록되어있지 않으면 weaving(Advice 를 핵심 로직에 적용) 되지 않는다.
        // 즉 AdvisorClass 내의 메서드(beforeEx 메서드)가 같이 동작을 안함.
        System.out.println("============== 관심사로 등록되지 않은 메서드 ===============");

        // TestBeanExe.BeanExc 중, int 를 매개변수로 갖는 메서드 호출
        t34.BeanExc(1972);

        System.out.println("-------------------------------------------");

        // TestBeanExe.BeanExc 중, String 을 매개변수로 갖는 메서드 호출
        t34.BeanExc("심영");

        System.out.println("-------------------------------------------");

        // TestBeanExe.BeanExc 중, 2개의 int 타입 매개변수를 갖는 메서드 호출.
        t34.BeanExc(1972, 1121);

        System.out.println("-------------------------------------------");
        // TestBeanExe.BeanExc 중, int 타입, String 타입의 매개변수를 각각 1개씩 갖는 메서드 호출.
        t34.BeanExc(1972, "김두한");

        System.out.println("-------------------------------------------");
        // TestBeanExe.BeanExc2 호출
        t34.BeanExc2();

        ctx.close();
    }
}
