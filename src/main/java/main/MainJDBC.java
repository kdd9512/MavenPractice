package main;

import beans.SpringJDBC.BeanConfigJDBC;
import beans.SpringJDBC.JDBCBeans.JDBCBean;
import beans.SpringJDBC.DataBase.jdbcDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainJDBC {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigJDBC.class);

        // jdbcDAO 가져오기
        jdbcDAO dao = ctx.getBean(jdbcDAO.class);

        // 값 입력(하드코딩...비추)
//        JDBCBean bean1 = new JDBCBean();
//        bean1.setIntData(1972);
//        bean1.setStrData("심영");
//        dao.insertData(bean1);

//        JDBCBean bean2 = new JDBCBean();
//        bean2.setIntData(1972);
//        bean2.setStrData("김두한");
//        dao.insertData(bean2);

//        System.out.println("입력완료");

        // 값 불러오기
//        List<JDBCBean> list = dao.selectData();
//
//        for (JDBCBean bean3 : list) {
//            System.out.printf("intData : %d\n",bean3.getIntData());
//            System.out.printf("strData : %s\n",bean3.getStrData());
//            System.out.println("====================================");
//        }

        // 값 수정하기.

//        JDBCBean bean4 = new JDBCBean();
//        bean4.setIntData(1972);
//        bean4.setStrData("으사양반");
//        dao.updateData(bean4);

        // 값 지우기.
//        dao.deleteData(1972);
//
//        ctx.close();
    }
}
