package main;

import beans.TestCollectionDI.CollectionDataBeans;
import beans.TestCollectionDI.TestCollectionDI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MainCollectionDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:beans.xml");

        TestCollectionDI t13 = ctx.getBean("t13",TestCollectionDI.class);

        // List
        List<String> list1 = t13.getList1();
        List<Integer> list2 = t13.getList2();
        List<CollectionDataBeans> list3 = t13.getList3();

        for (String str : list1) {
            System.out.printf("t13 String List : %s\n", str);
        }

        System.out.println("------------------------------");
        for (Integer dec : list2) {
            System.out.printf("t13 Integer List : %d\n", dec);
        }

        System.out.println("------------------------------");
        for (CollectionDataBeans obj : list3) {
            System.out.printf("t13 Object List : %s\n", obj);
        }

        System.out.println("------------------------------");
        CollectionDataBeans cdb = ctx.getBean("data_bean",CollectionDataBeans.class);
        System.out.printf("DATA_BEAN : %s\n",cdb);

        // Set

        Set<String> set1 = t13.getSet1();
        Set<Integer> set2 = t13.getSet2();
        Set<CollectionDataBeans> set3 = t13.getSet3();

        System.out.println("------------------------------");
        for (String str : set1) {
            System.out.printf("t13 String Set : %s\n", str);
        }

        System.out.println("------------------------------");

        for (Integer dec2 : set2) {
            System.out.printf("t13 Integer Set : %d\n", dec2);
        }

        System.out.println("------------------------------");
        for (CollectionDataBeans cdb2 : set3) {
            System.out.printf("t13 Object Set : %s\n", cdb2);
        }

        // Map
        Map<String,Object> map1 = t13.getMap1();

        String a1 = (String)map1.get("a1");
        Integer a2 = (Integer) map1.get("a2");
        CollectionDataBeans a3 = (CollectionDataBeans) map1.get("a3");
        CollectionDataBeans a4 = (CollectionDataBeans)map1.get("a4");
        List<String> a5 = (List<String>)map1.get("a5");

        System.out.printf("a1 : %s\n",a1);
        System.out.printf("a2 : %d\n",a2);
        System.out.printf("a3 : %s\n",a3);
        System.out.printf("a4 : %s\n",a4);
        for (String str : a5) {
            System.out.printf("a5 : %s\n", str);
        }

        //property
        System.out.println("------------------------------");

        Properties prop1 = t13.getProp1();

        String p1 = prop1.getProperty("p1");
        String p2 = prop1.getProperty("p2");
        String p3 = prop1.getProperty("p3");

        System.out.printf("p1 : %s\n",p1);
        System.out.printf("p2 : %s\n",p2);
        System.out.printf("p3 : %s\n",p3);


        ctx.close();
    }
}
