package beans.SpringAOP.AOPBeans;

public class TestBeanAOP {

    public int TestBeanAOP(){
        System.out.println("TestBeanAOP 호출됨.");

//        오류를 발생시키면 AdvisorClass 의 afterReturn 은 호출되지 않는다.

//        int aa = 10/0;

        return 1972;
    }
}
