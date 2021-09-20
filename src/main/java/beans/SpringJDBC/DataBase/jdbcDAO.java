package beans.SpringJDBC.DataBase;

import beans.SpringJDBC.JDBCBeans.JDBCBean;
import jdk.nashorn.internal.scripts.JD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class jdbcDAO {

    // BeanConfigJDBC 에 있는 jdbc 관리 객체를 자동주입.
    @Autowired
    private JdbcTemplate db;

    // mapper 를 주입받음.
    @Autowired
    private MapperClass mapper;

    // 저장
    public void insertData(JDBCBean bean){
        // 쿼리문 작성.
        String sql = "insert into jdbcTest (intData, strData) values (?,?)";
        // 쿼리문을 DB에 갱신.
        db.update(sql, bean.getIntData(), bean.getStrData());
    }

    // 가져오기.
    public List<JDBCBean> selectData(){
        // 쿼리문
        String sql = "select intData, strData from jdbcTest";
        // db.query(적용할 쿼리문, 적용할 매퍼)
        List<JDBCBean> list = db.query(sql, mapper);
        return list;
    }

    // 수정
    public void updateData(JDBCBean bean){
        String sql = "update jdbcTest set strData = ? where intData = ?";
        // update(적용할 쿼리, 바꿀값, 참조값)
        db.update(sql,bean.getStrData(), bean.getIntData());
    }

    // 삭제
    public void deleteData(int intData) {
        String sql = "delete from jdbcTest where intData = ?";
        db.update(sql,intData);
    }
}
