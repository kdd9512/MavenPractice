package beans.TestLifeCycle;

public class TestLifeCycle2 {
    public TestLifeCycle2 (){
        System.out.println("TestLifeCycle2 의 생성자.");
    }

    public void default_Init(){
        System.out.println("TestLifeCycle2 의 init 메서드");
    }

    public void default_Destroy(){
        System.out.println("TestLifeCycle2 의 destroy 메서드");
    }
}
