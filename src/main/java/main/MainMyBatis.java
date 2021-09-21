package main;

import beans.MyBatis.BeanConfigMB;
import beans.MyBatis.Mapper.MapperInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// ** MyBatis 는 반드시 JRE System Library 1.8 이상의 JAVA 에서 설치되어야 한다.(이하 버전에서는 컴파일 에러가 발생함.)
// 확인 후 MyBatis 와 MyBatis Spring 을 설치해야 한다.(Maven Repository 에서 검색)
// 둘의 버전은 딱히 일치하지 않아도 상관없음.
public class MainMyBatis {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigMB.class);

        MapperInterface mapper = ctx.getBean("getMapper",MapperInterface.class);

        ctx.close();
    }
}
