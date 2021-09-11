package main;

import beans.Component.*;
import beans.Component.TestBeans.TestForComponent3;
import beans.Component.TestBeans.TestForComponent4;
import beans.Component.TestBeans2.TestForComponent5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainComponent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        TestForComponent test = ctx1.getBean(TestForComponent.class);
        System.out.printf("TestForComponent : %s\n",test);

        System.out.println("----------------------------------------------");
        TestForComponent2 t24 = ctx1.getBean("t24", TestForComponent2.class);
        System.out.printf("TestForComponent2 : %s\n",t24);

        TestForComponent2 t25 = ctx1.getBean("t25", TestForComponent2.class);
        System.out.printf("TestForComponent2 : %s\n",t25);

        System.out.println("----------------------@Component------------------------");

        TestForComponent3 c1 = ctx1.getBean(TestForComponent3.class);
        System.out.printf("TestForComponent3 : %s\n",c1);

        TestForComponent4 c2 = ctx1.getBean("bean4",TestForComponent4.class);
        System.out.printf("TestForComponent3 : %s\n",c2);

        // 같은 class 를 공유하나 다른 id를 갖는 bean 은 @Component 를 이용하는 것이 아니라
        // beans.xml 파일 내에서 직접 생성해야 한다.
        TestForComponent4 c3 = ctx1.getBean("bean4",TestForComponent4.class);
        System.out.printf("TestForComponent4.c3 : %s\n",c3);

        TestForComponent4 c4 = ctx1.getBean("bean4",TestForComponent4.class);
        System.out.printf("TestForComponent4.c4 : %s\n",c4);

        TestForComponent5 c5 = ctx1.getBean(TestForComponent5.class);
        System.out.printf("TestForComponent5.c4 : %s\n",c5);

        ctx1.close();

        System.out.println("==============================================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanComponentConfig.class);

        // 유일한 class 를 사용하는 Bean 이라면?
        // 이하와 같이 getBean 내부에 클래스명.class 만 입력해도 가져올 수 있다.
        TestForComponent jc1 = ctx2.getBean(TestForComponent.class);
        System.out.printf("javaComp1 : %s\n",jc1);

        TestForComponent2 jc2 = ctx2.getBean("javaComp2", TestForComponent2.class);
        System.out.printf("javaComp2 : %s\n",jc2);

        TestForComponent2 jc3 = ctx2.getBean("javaComp3", TestForComponent2.class);
        System.out.printf("javaComp3 : %s\n",jc3);

        System.out.println("----------------------@Component------------------------");
        TestForComponent3 jc4 = ctx2.getBean(TestForComponent3.class);
        System.out.printf("javaComp3 : %s\n",jc4);

        // 이름을 지정한 @Component 를 불러오기.
        TestForComponent4 jc5 = ctx2.getBean("bean4",TestForComponent4.class);
        System.out.printf("TestForComponent4.bean4 : %s\n",jc5);

        TestForComponent5 jc6 = ctx2.getBean(TestForComponent5.class);
        System.out.printf("TestForComponent5.bean4 : %s\n",jc6);

        ctx2.close();

    }
}
