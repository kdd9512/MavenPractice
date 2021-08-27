package main;

import beans.TestIoCContainer.Test;
import beans.TestIoCContainer.TestB;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MainIoCContainer {
    public static void main(String[] args) {
        // BeanFactory 방식.
//        t1();
//        t2();

        // ApplicationContext 방식
//        t3();
        t4();
    }

    // BeanFactory - 패키지 내부 ** 구 방식
    public static void t1(){
        ClassPathResource res = new ClassPathResource("beans.xml");
        XmlBeanFactory fac = new XmlBeanFactory(res);

        Test t1 = fac.getBean("t1", Test.class);
        System.out.printf("t1 : %s\n", t1);

        Test t2 = fac.getBean("t1", Test.class);
        System.out.printf("t2 : %s\n", t2);
    }

    //BeanFactory - 패키지 외부 ** 구 방식
    public static void t2(){
        // FileSystemResource 의 경우, 파일의 실제경로를 다 입력해야 한다.
        // ClassPath~로 시작하는 경우가 아니라면 실제 경로를 입력해야 함.
        FileSystemResource res = new FileSystemResource("src/main/resources/beans.xml");
        XmlBeanFactory fac = new XmlBeanFactory(res);

        Test t1 = fac.getBean("t2",Test.class);
        System.out.printf("t1 : %s\n", t1);
        Test t2 = fac.getBean("t2",Test.class);
        System.out.printf("t2 : %s\n", t2);
    }

    //ApplicationContext - 패키지 내부 ** 현재 주 사용 방식
    public static void t3(){
        // 이 방식은 beans 내부의 객체들을 전부 생성한다.
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Test t1 = ctx.getBean("t2", Test.class);
        System.out.printf("t1 : %s\n", t1);

        Test t2 = ctx.getBean("t2", Test.class);
        System.out.printf("t2 : %s\n", t2);

        ctx.close();
    }

    //ApplicationContext - 패키지 외부 ** 현재 주 사용 방식
    public static void t4(){
        // ClassPath~로 시작하는 경우가 아니라면 실제 경로를 입력해야 함.
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

        TestB t1 = ctx.getBean("t1", TestB.class);
        System.out.printf("t1 : %s\n", t1);

        Test t2 = ctx.getBean("t2",Test.class);
        System.out.printf("t2 : %s\n", t2);

        ctx.close();
    }

}
