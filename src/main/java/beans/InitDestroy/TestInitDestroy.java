package beans.InitDestroy;

public class TestInitDestroy {

    public TestInitDestroy(){
        System.out.println("TestInitDestroy 의 생성자.");
    }

    public void init(){
        System.out.println("TestInitDestroy 의 init 메서드");
    }

    public void destroy(){
        System.out.println("TestInitDestroy 의 destroy 메서드");
    }
}
