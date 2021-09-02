package beans.TestAutoWired;

public class TestAutoWired3 {
    private int data5;
    private String data6;
    private AutoWiredDataBean2 data7;
    private AutoWiredDataBean2 data8;


    public TestAutoWired3(AutoWiredDataBean2 data7, AutoWiredDataBean2 data8) {
        this.data7 = data7;
        this.data8 = data8;
    }

    public TestAutoWired3(int data5, String data6, AutoWiredDataBean2 data7, AutoWiredDataBean2 data8) {
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;
    }

    public TestAutoWired3(int data5, String data6) {
        this.data5 = data5;
        this.data6 = data6;
    }

    public int getData5() {
        return data5;
    }

    public void setData5(int data5) {
        this.data5 = data5;
    }

    public String getData6() {
        return data6;
    }

    public void setData6(String data6) {
        this.data6 = data6;
    }

    public AutoWiredDataBean2 getData7() {
        return data7;
    }

    public void setData7(AutoWiredDataBean2 data7) {
        this.data7 = data7;
    }

    public AutoWiredDataBean2 getData8() {
        return data8;
    }

    public void setData8(AutoWiredDataBean2 data8) {
        this.data8 = data8;
    }
}
