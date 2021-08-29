package beans.TestBeanPostProcessor;

public class TestBpp2 {

    public TestBpp2() {
        System.out.println("TestBpp2 의 생성자.");
    }

    public void bean_Init2() {
        System.out.println("TestBpp2 의 bean_Init 메서드");
    }

    public void bean_Destroy2() {
        System.out.println("TestBpp2 의 bean_Destroy 메서드");
    }
}
