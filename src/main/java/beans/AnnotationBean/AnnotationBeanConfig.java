package beans.AnnotationBean;

import beans.AnnotationBean.AnnotationBeanData.AnnotationBeanData;
import beans.AnnotationBean.AnnotationBeanData.AnnotationBeanData2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* 1. beans.xml 최상단
* xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 바로 아랫 줄에
* 다음과 같은 문구를 추가한다.
* xmlns:context="http://www.springframework.org/schema/context"
*
* 2. xsi:schemaLocation 에 다음 문구를 추가로 입력한다.
* http://www.springframework.org/schema/context
* http://www.springframework.org/schema/context/spring-context.xsd
*
* 3. beans 태그 내부에서 다음 태그를 추가한다.
* <context:annotation-config/>
*
* 이 문구들을 추가하여 bean 클래스에 설정되어 있는 annotation 을 이용한다.
* */

@Configuration
public class AnnotationBeanConfig {

    @Bean
    public AnnotationBean javaAnnotate1(){
        return new AnnotationBean();
    }

    @Bean
    public AnnotationBeanData javaA(){
        return new AnnotationBeanData();
    }

    @Bean
    public AnnotationBeanData2 obj19() {
        return new AnnotationBeanData2();
    }

    @Bean
    public AnnotationBeanData2 obj20() {
        return new AnnotationBeanData2();
    }

    @Bean
    public AnnotationBean2 javaAnnotate2(){
        return new AnnotationBean2();
    }

}
