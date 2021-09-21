package beans.MyBatis.Mapper;

import beans.MyBatis.MbBeans.JDBCBeanMB;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MapperInterface {

//    @Results({
//            @Result(column = "intData", property = "intData"),
//            @Result(column = "strData", property = "strData")
//    })
    @Select("select intData, strData from jdbcTest")
    List<JDBCBeanMB> selectData();

    @Insert("insert into jdbcTest (intData, strData) values (#{intData}, #{strData})")
    // insert 에 반환값이 존재할 리 없으므로(값을 입력하는 용도지 받아오는 용도가 아니다) void 처리.
    void insertData(JDBCBeanMB beanMB);

    @Update("update jdbcTest set intData = #{intData} where strData = #{strData}")
    // update 에 반환값이 존재할 리 없으므로(값을 입력하는 용도지 받아오는 용도가 아니다) void 처리.
    void updateData(JDBCBeanMB beanMB);

    @Delete("delete from jdbcTest where strData = #{strData}")
    // update 에 반환값이 존재할 리 없으므로(값을 입력하는 용도지 받아오는 용도가 아니다) void 처리.
    void deleteData(String strData);
}
