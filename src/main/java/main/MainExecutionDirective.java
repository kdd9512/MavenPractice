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
        // 즉 AdvisorClass 내의 메서드가 같이 동작을 안함.
        System.out.println("============== 관심사로 등록되지 않은 메서드 ===============");
        t34.BeanExc(1972);

        ctx.close();
    }
}
