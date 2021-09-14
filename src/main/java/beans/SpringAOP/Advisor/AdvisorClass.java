package beans.SpringAOP.Advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {

    public void before() {
        System.out.println("before 메서드 호출됨.");
    }

    public void after() {
        System.out.println("after 메서드 호출됨.");
    }

    //    public int around(ProceedingJoinPoint pjp) throws Throwable{
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around 메서드 호출됨 1.");

        // 형변환
//        int i1 = (Integer) pjp.proceed();\

        // 원래 메서드를 호출한다.
        Object obj = pjp.proceed();

        System.out.println("around 메서드 호출됨 2.");

//        return i1;
        return obj;
    }

    public void afterReturn(){
        System.out.println("afterReturn 메서드 호출됨.");
    }

    // 에러에 대한 정보가 Throwable "th" 매개변수에 자동주입된다.
    public void afterThrowing(Throwable th){
        System.out.println("afterThrowing 메서드 호출됨.");
        System.out.println(th);
    }

}
