package beans.ComponentAutowired.TestBeansAutowired;

import beans.ComponentAutowired.DataBeanAutowired.DataBeanCA4;
import beans.ComponentAutowired.DataBeanAutowired.DataBeanCA5;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans.ComponentAutowired")
public class TestBeanCA3 {

    // 값을 받을 변수 생성.
    private int dataD1;
    private String dataD2;
    private DataBeanCA4 dataD3;
    private DataBeanCA5 dataD4;

    // @Value("값") 자료형 변수명
    public TestBeanCA3(
            @Value("0") int dataD1,
            @Value("null") String dataD2,
            DataBeanCA4 dataD3,
            DataBeanCA5 dataD4) {
        this.dataD1 = dataD1;
        this.dataD2 = dataD2;
        this.dataD3 = dataD3;
        this.dataD4 = dataD4;
    }

    public int getDataD1() {
        return dataD1;
    }

    public String getDataD2() {
        return dataD2;
    }

    public DataBeanCA4 getDataD3() {
        return dataD3;
    }

    public DataBeanCA5 getDataD4() {
        return dataD4;
    }
}
