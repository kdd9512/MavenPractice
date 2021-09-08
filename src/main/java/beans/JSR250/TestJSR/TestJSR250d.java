package beans.JSR250.TestJSR;

import beans.JSR250.JSRData.JSRData1;
import beans.JSR250.JSRData.JSRData2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestJSR250d {

    //  @Autowired + @Qualifier 를 이용하여 메서드명으로 자동주입.

    @Autowired
    @Qualifier("jsrData1")
    private JSRData1 jsrData1;

    @Autowired
    @Qualifier("jsrData2")
    private JSRData2 jsrData2;

    public JSRData1 getJsrData1() {
        return jsrData1;
    }

    public JSRData2 getJsrData2() {
        return jsrData2;
    }
}
