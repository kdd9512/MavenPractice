package main;

import beans.BeanConfigClass.BeanConfigClass;
import beans.BeanConfigClass.TestBeanConfigClass;
import beans.BeanConfigClass.TestBeanConfigClass2;
import beans.BeanConfigClass.TestBeanConfigClass3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 두 방법간의 우열은 없다. 그냥 방법이 갈라진 것일 뿐.
public class MainBeanConfiguration {
    public static void main(String[] args) {

        // xml 파일을 이용하는 기존방식.
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        TestBeanConfigClass t14 = ctx1.getBean("t14",TestBeanConfigClass.class);
        System.out.printf("t14 (using xml) : %s\n",t14);

        System.out.println("-----------------------------------");
        TestBeanConfigClass2 t15 = ctx1.getBean("t15", TestBeanConfigClass2.class);
        System.out.printf("t15 (using xml) : %s\n",t15);

        System.out.println("-----------------------------------");
        TestBeanConfigClass2 t16 = ctx1.getBean("t16", TestBeanConfigClass2.class);
        System.out.printf("t16 (using xml) : %s\n",t16);

        System.out.println("-----------------------------------");
        TestBeanConfigClass2 t17 = ctx1.getBean("t16", TestBeanConfigClass2.class);
        System.out.printf("t16 (using xml) : %s\n",t17);

        // id가 없어도 bean 내의 class 값이 유일하다면, 굳이 이름이나 .class 같은거 안써도 불러올 수 있다.
        System.out.println("-----------------------------------");
        TestBeanConfigClass3 t18 = new TestBeanConfigClass3();
        System.out.printf("t18 (using xml) : %s\n",t18);


        ctx1.close();


        System.out.println("================= Annotation =================");

        // @Configuration annotation 이 붙은 java 파일을 이용하는 방식.
        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBeanConfigClass tb = ctx2.getBean("TestBean",TestBeanConfigClass.class);
        System.out.printf("t14 (using @Configuration annotation) tb : %s\n",tb);

        TestBeanConfigClass tb1 = ctx2.getBean("j1",TestBeanConfigClass.class);
        System.out.printf("t14 (using @Configuration annotation) tb1 : %s\n",tb1);

        System.out.println("-----------------------------------");
        TestBeanConfigClass2 tb2 = ctx2.getBean("j2",TestBeanConfigClass2.class);
        System.out.printf("t15 (using @Configuration annotation) tb2 : %s\n",tb2);

        System.out.println("-----------------------------------");
        TestBeanConfigClass2 tb3 = ctx2.getBean("j3",TestBeanConfigClass2.class);
        System.out.printf("t15 (using @Configuration annotation) tb3 : %s\n",tb3);

        // @Scope("prototype") annotation 이용하여 bean 의 scope 값을 prototype 으로 설정.
        System.out.println("-----------------------------------");
        TestBeanConfigClass2 tb4 = ctx2.getBean("j3",TestBeanConfigClass2.class);
        System.out.printf("t15 (using @Configuration annotation) tb4 : %s\n",tb4);

        // @Primary 를 추가하여 같은 class 를 갖는 bean 의 우선순위를 지정.
        System.out.println("-----------------------------------");
        TestBeanConfigClass3 tb5 = ctx2.getBean("j4",TestBeanConfigClass3.class);
        System.out.printf("t15 (using @Configuration annotation) tb5 : %s\n",tb5);


        ctx2.close();
    }
}
