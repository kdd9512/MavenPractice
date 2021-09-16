package beans.ExecutionDirective.ExecutionBeans;

public class TestBeanExe {

    public void BeanExc (){
        System.out.println("BeanExc 메서드 호출됨");
    }

    public void BeanExc (int a1){
        System.out.printf("BeanExc(int a1) : %d\n",a1);
    }

    public void BeanExc (String s1) {
        System.out.printf("BeanExc(java.lang.String s1) : %s\n",s1);
    }

    public void BeanExc (int a1, int a2) {
        System.out.printf("BeanExc(int a1, int a2) : %d, %d\n",a1,a2);
    }

    public void BeanExc (int a1, String s1) {
        System.out.printf("BeanExc(int a1, String s1) : %d, %s\n",a1,s1);
    }

    public void BeanExc2 (){
        System.out.println("BeanExc2 메서드 호출됨");
    }
}
