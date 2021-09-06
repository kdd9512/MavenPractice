package main;

import beans.JavaDI.BeanConfigClass3;
import beans.JavaDI.VOJavaDI.TestJavaDI;
import beans.JavaDI.VOJavaDI.TestJavaDI2;
import beans.JavaDI.VOJavaDI.TestJavaDI3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainJavaDataInjection {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath*:beans.xml");

//        TestJavaDI t18 = ctx1.getBean("t18",TestJavaDI.class);
//        System.out.printf("t18 : %d\n",t18.getData1());
//        System.out.printf("t18 : %s\n",t18.getData2());
//        System.out.printf("t18 : %s\n",t18.getData3());


        // xml 파일 이용하는 방법

        TestJavaDI t18 = ctx1.getBean("t18",TestJavaDI.class);
        t18.printData();

        System.out.println("-----------------------------------------------");
        TestJavaDI t19 = ctx1.getBean("t19",TestJavaDI.class);
        t19.printData();

        System.out.println("-----------------------------------------------");
        // default-autowire 설정이 없다면 null 이 나올 것. (beans.xml 최상단에 해당 부분은 주석처리 되어 있음.)
        TestJavaDI2 t20 = ctx1.getBean("t20",TestJavaDI2.class);
        System.out.printf("t20.data1 : %s\n", t20.getData1());
        System.out.printf("t20.data2 : %s\n", t20.getData2());

        System.out.println("-----------------------------------------------");
        TestJavaDI3 t21 = ctx1.getBean("t21",TestJavaDI3.class);
        System.out.printf("t21.data1 : %s\n", t21.getData1());
        System.out.printf("t21.data2 : %s\n", t21.getData2());

        ctx1.close();

        System.out.println("================= Annotation =================");

        // annotation 을 첨부한 java 파일 이용하여 bean 을 호출하는 방법.
        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass3.class);

//        TestJavaDI jdi = ctx1.getBean("javaDI",TestJavaDI.class);
//        System.out.printf("jdi : %d\n",jdi.getData1());
//        System.out.printf("jdi : %s\n",jdi.getData2());
//        System.out.printf("jdi : %s\n",jdi.getData3());

        TestJavaDI jdi = ctx2.getBean("javaDI", TestJavaDI.class);
        jdi.printData();

        // java 파일로 setter 를 이용하여 값을 주입하는 방법.
        System.out.println("-----------------------------------------------");
        TestJavaDI jdi2 = ctx2.getBean("javaDI2", TestJavaDI.class);
        jdi2.printData();

        // java 파일을 이용, byName 조건으로 autowire
        System.out.println("-----------------------------------------------");
        TestJavaDI2 jdi3 = ctx2.getBean("javaDI3", TestJavaDI2.class);
        System.out.printf("javaDI3.data1 : %s\n",jdi3.getData1());
        System.out.printf("javaDI3.data2 : %s\n",jdi3.getData2());

        // java 파일을 이용, byType 조건으로 autowire
        System.out.println("-----------------------------------------------");
        TestJavaDI3 jdi4 = ctx2.getBean("javaDI4",TestJavaDI3.class);
        System.out.printf("javaDI4.data1 : %s\n",jdi4.getData1());
        System.out.printf("javaDI4.data2 : %s\n",jdi4.getData2());

        ctx2.close();
    }
}
