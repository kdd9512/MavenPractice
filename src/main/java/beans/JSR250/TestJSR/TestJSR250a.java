package beans.JSR250.TestJSR;

public class TestJSR250a {

    public TestJSR250a(){
        System.out.println("TestJSR250a 의 생성자");
    }

    public void jsrInit(){
        System.out.println("TestJSR250a 의 init 메서드");
    }

    public void jsrDest(){
        System.out.println("TestJSR250a 의 destroy 메서드");
    }
}
