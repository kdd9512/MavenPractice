package beans.SpringJDBC;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"beans.SpringJDBC.JDBCBeans","beans.SpringJDBC.SpringDAO"})
public class BeanConfigJDBC {

    // DataSource
    // 데이터 소스(접속정보를 가지고 있는 객체 - DBCP)
    @Bean
    public BasicDataSource src(){
        BasicDataSource src = new BasicDataSource();
        src.setDriverClassName("org.mariadb.jdbc.Driver");
        // /테이블명 까지 입력해줄것.
        src.setUrl("jdbc:mariadb://forstudy.ctttfytjez7s.ap-northeast-2.rds.amazonaws.com:3306/forstudy");
        src.setUsername("master");
        src.setPassword("hwhw9512");

        return src;
    }

    // db에 접속해서 쿼리를 전달하는 Bean 을 등록.
    @Bean
    public JdbcTemplate dbConfig(BasicDataSource src){
        JdbcTemplate db = new JdbcTemplate(src);

        return db;
    }
}
