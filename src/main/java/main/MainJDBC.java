package main;

import beans.SpringJDBC.BeanConfigJDBC;
import beans.SpringJDBC.JDBCBeans.JDBCBean;
import beans.SpringJDBC.SpringDAO.jdbcDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJDBC {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigJDBC.class);

        // jdbcDAO 가져오기
        jdbcDAO dao = ctx.getBean(jdbcDAO.class);

        // 쿼리문에 들어갈 값 입력(하드코딩...비추)
        JDBCBean bean1 = new JDBCBean();
        bean1.setIntData(1972);
        bean1.setStrData("심영");
        dao.insertData(bean1);

        JDBCBean bean2 = new JDBCBean();
        bean2.setIntData(1972);
        bean2.setStrData("김두한");
        dao.insertData(bean2);

        // 성공하면 이게 나올 것.
        System.out.println("입력완료");

        ctx.close();
    }
}
