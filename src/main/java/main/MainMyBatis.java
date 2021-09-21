package main;

import beans.MyBatis.BeanConfigMB;
import beans.MyBatis.Mapper.MapperInterface;
import beans.MyBatis.MbBeans.JDBCBeanMB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

// ** MyBatis 는 반드시 JRE System Library 1.8 이상의 JAVA 에서 설치되어야 한다.(이하 버전에서는 컴파일 에러가 발생함.)
// 확인 후 MyBatis 와 MyBatis Spring 을 설치해야 한다.(Maven Repository 에서 검색)
// 둘의 버전은 딱히 일치하지 않아도 상관없음.
public class MainMyBatis {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigMB.class);

        MapperInterface mapper = ctx.getBean("getMapper",MapperInterface.class);

        // insert
//        JDBCBeanMB bean2 = new JDBCBeanMB();
//        bean2.setIntData(1972);
//        bean2.setStrData("으사양반");
//        mapper.insertData(bean2);
//
//        JDBCBeanMB bean3 = new JDBCBeanMB();
//        bean3.setIntData(1972);
//        bean3.setStrData("상하이조");
//        mapper.insertData(bean3);

        // update
//        JDBCBeanMB bean4 = new JDBCBeanMB();
//        bean4.setStrData("상하이조");
//        bean4.setIntData(9999);
//        mapper.updateData(bean4);

        // delete
//        mapper.deleteData("상하이조");

        // select
        List<JDBCBeanMB> list1 = mapper.selectData();
        for (JDBCBeanMB bean1 : list1) {
            System.out.printf("intData : %d\n",bean1.getIntData());
            System.out.printf("strData : %s\n",bean1.getStrData());
            System.out.println("=========================================");
        }

        ctx.close();
    }
}
