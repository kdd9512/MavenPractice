package main;

import beans.TestSpringIntro.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringIntro {
    public static void main(String[] args) {
        // beans.xml 로딩하기. 실제 파일의 위치는 src/main/resources/beans.xml.
        // ** 경로를 입력할 때, 실제 파일의 경로는 그냥 beans.xml 이다.
        // 얼핏 src/main/resources/beans.xml 로 보일 수 있으나, default 경로는 이미 입력되어 있는 취급을 하므로 적을 필요가 없다.
        // 즉, 위와 같이 적으면 src/main/resources/src/main/resources/beans.xml 로 적은것과 마찬가지.
        // 파일경로를 적기가 상당히 번거로우므로, classpath*:beans.xml 로 beans 파일을 자동추적하게 할 수 있다.

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        HelloWorld hello1 = (HelloWorld)ctx.getBean("helloE");
        callMethod(hello1);

        HelloWorld hello2 = ctx.getBean("helloK", HelloWorld.class);
        callMethod(hello2);

        ctx.close();
    }

    public static void callMethod(HelloWorld hello) {
        hello.sayHello();
    }
}
