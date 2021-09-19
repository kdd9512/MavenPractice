package beans.SpringJDBC.SpringDAO;

import beans.SpringJDBC.JDBCBeans.JDBCBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class jdbcDAO {

    // BeanConfigJDBC 에 있는 jdbc 관리 객체를 자동주입.
    @Autowired
    private JdbcTemplate db;

    // 저장
    public void insertData(JDBCBean bean){
        // 쿼리문 작성.
        String sql = "insert into jdbcTest (intData, strData) values (?,?)";
        // 쿼리문을 DB에 갱신.
        db.update(sql, bean.getIntData(), bean.getStrData());
    }
}
