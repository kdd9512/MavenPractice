package main;

import beans.InitDestroy.BeanConfigClass2;
import beans.InitDestroy.TestInitDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInitDestroy {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        TestInitDestroy t17 = ctx1.getBean("t17",TestInitDestroy.class);
        System.out.printf("t17 : %s\n",t17);

        ctx1.close();

        System.out.println("================= Annotation =================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass2.class);

        TestInitDestroy tb = ctx2.getBean("TestInDe",TestInitDestroy.class);
        System.out.printf("tb : %s\n",tb);

        ctx2.close();
    }
}
