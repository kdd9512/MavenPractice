package main;

import beans.ComponentAutowired.BeanConfigCA;
import beans.ComponentAutowired.TestBeansAutowired.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainComponentAutowired {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigCA.class);

        TestBeanCA1 t31 = ctx.getBean(TestBeanCA1.class);
        System.out.printf("TestBeanCA1.data1 : %s\n",t31.getData1());
        System.out.printf("TestBeanCA1.data2 : %s\n",t31.getData2());
        System.out.printf("TestBeanCA1.data3 : %s\n",t31.getData3());
        System.out.printf("TestBeanCA1.data4 : %s\n",t31.getData4());

        System.out.println("==================================================");
        TestBeanCA2 t32 = ctx.getBean(TestBeanCA2.class);
        System.out.printf("TestBeanCA2.getDataT1 : %d\n",t32.getDataT1());
        System.out.printf("TestBeanCA2.getDataT2 : %s\n",t32.getDataT2());
        System.out.printf("TestBeanCA2.getDataT3 : %s\n",t32.getDataT3());
        System.out.printf("TestBeanCA2.getDataT4 : %s\n",t32.getDataT4());

        System.out.println("==================================================");
        TestBeanCA3 t33 = ctx.getBean("dBeanCA5", TestBeanCA3.class);
        System.out.printf("TestBeanCA3.getDataT1 : %d\n",t33.getDataD1());
        System.out.printf("TestBeanCA3.getDataT2 : %s\n",t33.getDataD2());
        System.out.printf("TestBeanCA3.getDataT3 : %s\n",t33.getDataD3());
        System.out.printf("TestBeanCA3.getDataT4 : %s\n",t33.getDataD4());


        ctx.close();
    }
}
