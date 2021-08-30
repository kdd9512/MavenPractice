package beans.TestConstructorDI;

public class TestConstructorDI {

    private int data1;
    private double data2;
    private String data3;

    public TestConstructorDI(){
        System.out.println("TestConstructorDI 의 기본 생성자.");
        this.data1 = 0;
        this.data2 = 0.0;
        this.data3 = null;
    }

    public TestConstructorDI(int data1){
        System.out.println("TestConstructorDI 의 생성자: int 변수 1개");
        this.data1 = data1;
        this.data2 = 0.0;
        this.data3 = null;
    }

    public TestConstructorDI(double data2){
        System.out.println("TestConstructorDI 의 생성자: double 변수 1개");
        this.data1 = 0;
        this.data2 = data2;
        this.data3 = null;
    }

    public TestConstructorDI(String data3){
        System.out.println("TestConstructorDI 의 생성자: String 변수 1개");
        this.data1 = 0;
        this.data2 = 0.0;
        this.data3 = data3;
    }

    public TestConstructorDI(int data1, double data2, String data3){
        System.out.println("TestConstructorDI 의 생성자: 변수 3개(int, double, String)");
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void printData(){
        System.out.printf("data1 : %d\n",data1);
        System.out.printf("data2 : %f\n",data2);
        System.out.printf("data3 : %s\n",data3);
    }
}
