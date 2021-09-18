package beans.AOPJava.Advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdvisorAOPJ {

    @Before("execution(* AOPJ1())")
    public void before(){
        System.out.println("AdvisorAOPJ.before 메서드 호출");
    }

    @After("execution(* AOPJ1())")
    public void after(){
        System.out.println("AdvisorAOPJ.after 메서드 호출");

    }

    @Around("execution(* AOPJ1())")
    public Object aroundAOPJ(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("AdvisorAOPJ.aroundAOPJ 메서드 호출 1");
        Object result = pjp.proceed();
        System.out.println("AdvisorAOPJ.aroundAOPJ 메서드 호출 2");
        return result;
    }

    @AfterReturning("execution(* AOPJ1())")
    public void afterReturnAOPJ(){
        System.out.println("afterReturnAOPJ 호출. 정상작동되었음.");
    }

    @AfterThrowing("execution(* AOPJ1())")
    public void afterThrowAOPJ(){
        System.out.println("afterThrowAOPJ 호출. 오류 발생...");
    }


}
