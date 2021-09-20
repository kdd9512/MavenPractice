package beans.SpringJDBC.DataBase;

import beans.SpringJDBC.JDBCBeans.JDBCBean;
// springframework 의 RowMapper 를 import 해야한다. 같은 이름의 클래스가 하나 더 있음.
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MapperClass implements RowMapper<JDBCBean> {

    @Override
    public JDBCBean mapRow(ResultSet rs, int rowNum) throws SQLException {

        JDBCBean bean = new JDBCBean();
        bean.setIntData(rs.getInt("intData"));
        bean.setStrData(rs.getString("strData"));

        return bean;
    }
}
