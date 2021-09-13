package beans.ComponentAutowired.TestBeansAutowired;

import beans.ComponentAutowired.DataBeanAutowired.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBeanCA2 {

    private int dataT1;
    private String dataT2;
    private DataBeanCA4 dataT3;
    private DataBeanCA5 dataT4;

//    public TestBeanCA2(DataBeanCA4 dataT3, DataBeanCA5 dataT4) {

    // @Value("값") 자료형 변수명
    public TestBeanCA2(@Value("1972") int dataT1,
                       @Value("형사양반") String dataT2,
                       DataBeanCA4 dataT3,
                       DataBeanCA5 dataT4) {
        this.dataT1 = dataT1;
        this.dataT2 = dataT2;
        this.dataT3 = dataT3;
        this.dataT4 = dataT4;
    }

    public int getDataT1() {
        return dataT1;
    }

    public String getDataT2() {
        return dataT2;
    }

    public DataBeanCA4 getDataT3() {
        return dataT3;
    }

    public DataBeanCA5 getDataT4() {
        return dataT4;
    }
}
