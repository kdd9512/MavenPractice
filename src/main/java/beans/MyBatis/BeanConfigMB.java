package beans.MyBatis;

import beans.MyBatis.Mapper.MapperInterface;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans.MyBatis.MbBeans")
public class BeanConfigMB {

    // data source. DB 접속정보
    @Bean
    public BasicDataSource dataSource(){
        BasicDataSource src = new BasicDataSource();
        src.setDriverClassName("org.mariadb.jdbc.Driver");

        src.setUrl("jdbc:mariadb://forstudy.ctttfytjez7s.ap-northeast-2.rds.amazonaws.com:3306/forstudy");
        src.setUsername("master");
        src.setPassword("hwhw9512");

        return src;
    }

    // SQLSessionFactory : jdbc 를 처리하는 객체.
    @Bean
    public SqlSessionFactory factory(BasicDataSource src) throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(src);
        SqlSessionFactory factory = factoryBean.getObject();
        return factory;
    }

    // Mapper
    @Bean
    public MapperFactoryBean<MapperInterface> getMapper(SqlSessionFactory factory) throws Exception{
        // Mapper 가 복수일 경우 이 Mapper Bean 부분을 Mapper 개수만큼 작성해 주면 된다.
        MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
        factoryBean.setSqlSessionFactory(factory);
        return factoryBean;
    }

}
