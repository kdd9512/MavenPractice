package beans.TestLifeCycle;

public class TestLifeCycle3 {

    public TestLifeCycle3(){
        System.out.println("TestLifeCycle3 의 생성자.");
    }

    public void default_Init(){
        System.out.println("TestLifeCycle3 의 init 메서드");
    }

    public void default_Destroy(){
        System.out.println("TestLifeCycle3 의 destroy 메서드");
    }

    public void bean3_Init(){
        System.out.println("TestLifeCycle3 의 bean3_init 메서드");
    }

    public void bean3_Destroy(){
        System.out.println("TestLifeCycle3 의 bean3_destroy 메서드");
    }

}
