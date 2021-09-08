package beans.JSR250.TestJSR;

import beans.JSR250.JSRData.*;

import javax.annotation.Resource;

public class TestJSR250e {

    // 변수의 이름과 동일한 bean 이 주입된다.
    @Resource
    private JSRData1 jsrData1;
    @Resource
    private JSRData2 jsrData2;

    public JSRData1 getJsrData1() {
        return jsrData1;
    }

    public JSRData2 getJsrData2() {
        return jsrData2;
    }
}
