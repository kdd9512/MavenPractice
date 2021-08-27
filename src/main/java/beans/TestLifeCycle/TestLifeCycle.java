package beans.TestLifeCycle;

public class TestLifeCycle {
    public TestLifeCycle(){
        System.out.println("TestLifeCycle 의 생성자.");
    }

    public void default_Init(){
        System.out.println("TestLifeCycle 의 init 메서드");
    }

    public void default_Destroy(){
        System.out.println("TestLifeCycle 의 destroy 메서드");
    }

}
