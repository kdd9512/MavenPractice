package main;

import beans.AnnotationBean.AnnotationBean;
import beans.AnnotationBean.AnnotationBean2;
import beans.AnnotationBean.AnnotationBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotationBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        AnnotationBean t22 = ctx1.getBean("t22", AnnotationBean.class);
        System.out.printf("t22.data1 : %d\n",t22.getData1());
        System.out.printf("t22.data2 : %s\n",t22.getData2());
        System.out.printf("t22.data3 : %s\n",t22.getData3());
        System.out.printf("t22.data4 : %s\n",t22.getData4());
        System.out.printf("t22.data5 : %s\n",t22.getData5());
        System.out.printf("t22.data6 : %s\n",t22.getData6());

        System.out.println("-----------------------------------------------");
        AnnotationBean2 t23 = ctx1.getBean("t23",AnnotationBean2.class);
        System.out.printf("t23.data1 : %d\n",t23.getData1());
        System.out.printf("t23.data2 : %s\n",t23.getData2());
        System.out.printf("t23.data3 : %s\n",t23.getData3());
        System.out.printf("t23.data4 : %s\n",t23.getData4());

        ctx1.close();

        System.out.println("================= Annotation =================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(AnnotationBeanConfig.class);

        AnnotationBean ja1 = ctx2.getBean("javaAnnotate1", AnnotationBean.class);
        System.out.printf("ja1.data1 : %d\n",ja1.getData1());
        System.out.printf("ja1.data2 : %s\n",ja1.getData2());
        System.out.printf("ja1.data3 : %s\n",ja1.getData3());
        System.out.printf("ja1.data4 : %s\n",ja1.getData4());
        System.out.printf("ja1.data5 obj19 : %s\n",ja1.getData5());
        System.out.printf("ja1.data6 obj20 : %s\n",ja1.getData6());

        System.out.println("-----------------------------------------------");
        AnnotationBean2 ja2 = ctx2.getBean("javaAnnotate2",AnnotationBean2.class);
        System.out.printf("ja2.data1 : %d\n",ja2.getData1());
        System.out.printf("ja2.data2 : %s\n",ja2.getData2());
        System.out.printf("ja2.data3 : %s\n",ja2.getData3());
        System.out.printf("ja2.data4 : %s\n",ja2.getData4());

        ctx2.close();
    }
}
