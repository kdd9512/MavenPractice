package beans.JavaDI.TestJavaDI;

import beans.JavaDI.DataJavaDI;

public class TestJavaDI {
    private int data1;
    private String data2;
    private DataJavaDI data3;

    public TestJavaDI() {

    }

    public TestJavaDI(int data1, String data2, DataJavaDI data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public DataJavaDI getData3() {
        return data3;
    }

    public void setData3(DataJavaDI data3) {
        this.data3 = data3;
    }

    public void printData() {
        System.out.printf("t18 : %d\n",data1);
        System.out.printf("t18 : %s\n",data2);
        System.out.printf("t18 : %s\n",data3);
    }
}
