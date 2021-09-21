package beans.MyBatis.MbBeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class JDBCBeanMB {

    // ** 반드시 변수의 이름은 DB 내의 컬럼과 일치해야 한다.
    private int intData;
    private String strData;

    public JDBCBeanMB() {
    }

    public JDBCBeanMB(int intData, String strData) {
        this.intData = intData;
        this.strData = strData;
    }

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getStrData() {
        return strData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }
}
