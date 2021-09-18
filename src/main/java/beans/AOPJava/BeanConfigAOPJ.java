package beans.AOPJava;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"beans.AOPJava.TestBeans","beans.AOPJava.Advisor"})
// @EnableAspectJAutoProxy : advisor 클래스에 설정되어 있는 Annotation 을 분석, AOP 세팅을 수행함.
@EnableAspectJAutoProxy
public class BeanConfigAOPJ {



}
