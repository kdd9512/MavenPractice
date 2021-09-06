package beans.JavaDI;

import beans.JavaDI.VOJavaDI.TestJavaDI;
import beans.JavaDI.VOJavaDI.TestJavaDI2;
import beans.JavaDI.VOJavaDI.TestJavaDI3;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass3 {

    // 값을 직접 입력해서 주입하는 방법.
    @Bean
    public TestJavaDI javaDI(){
        return new TestJavaDI(1972, "문영철", new DataJavaDI());
    }

    // setter 를 이용하여 값을 주입하는 방법.
    @Bean
    public TestJavaDI javaDI2() {
        TestJavaDI t1 = new TestJavaDI();
        t1.setData1(1972);
        t1.setData2("염동진");
        t1.setData3(new DataJavaDI());

        return t1;
    }

    @Bean
    // byName 방식으로 주입.
    // 메소드의 이름을 TestJavaDI2(사실상 VO 클래스) 내부에서
    // 해당하는 private 값의 이름과 일치시켜야 함.
    // 해당하는 데이터값을 다 만들어줘야 함.
    public DataJavaDI2 data1(){
        return new DataJavaDI2();
    }

    @Bean
    public DataJavaDI2 data2(){
        return new DataJavaDI2();
    }

    // 구식방법(이후 이 방법은 도태되어 사라질수도 있음).
    // spring 5.1 이후부터는 권장되지 않는 방법이다.
    // 현재는 직접 주입하는 방식을 권장하고 있음.
    @Bean(autowire = Autowire.BY_NAME)
    public TestJavaDI2 javaDI3(){
        return new TestJavaDI2();
    }

    public DataJavaDI3 data3(){
        return new DataJavaDI3();
    }

    @Bean
    public DataJavaDI3 data4(){
        return new DataJavaDI3();
    }

    // byName 방식으로 주입.
    // spring 5.1 이후부터는 권장되지 않는 방법이다.
    @Bean(autowire = Autowire.BY_TYPE)
    public TestJavaDI3 javaDI4(){
        return new TestJavaDI3();
    }

}
