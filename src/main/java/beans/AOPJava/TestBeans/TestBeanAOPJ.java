package beans.AOPJava.TestBeans;

import org.springframework.stereotype.Component;

@Component
public class TestBeanAOPJ {

    // 예외상황이 발생한 경우, Exception 에 담아 전달한다.
    public void AOPJ1() throws Exception{
        System.out.println("TestBeanAOPJ 의 AOPJ1 메서드 호출");

//        int a1 = 100 / 0;
    }
}
