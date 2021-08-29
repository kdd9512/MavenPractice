package beans.TestBeanPostProcessor;

public class TestBpp {
    public TestBpp() {
        System.out.println("TestBpp 의 생성자.");
    }

    public void bean_Init() {
        System.out.println("TestBpp 의 bean_Init 메서드");
    }

    public void bean_Destroy() {
        System.out.println("TestBpp 의 bean_Destroy 메서드");
    }
}
