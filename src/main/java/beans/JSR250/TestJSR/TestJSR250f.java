package beans.JSR250.TestJSR;

import beans.JSR250.JSRData.*;

import javax.annotation.Resource;

public class TestJSR250f {

    // @Resource annotation 을 이용하려는데, 변수명과 bean 의 이름이 다른 경우.
    // @Resource(name = "지정할이름")

    @Resource(name = "jsrData1")
    private JSRData1 jData1;
    @Resource(name = "jsrData2")
    private JSRData2 jData2;

    public JSRData1 getjData1() {
        return jData1;
    }

    public JSRData2 getjData2() {
        return jData2;
    }
}
