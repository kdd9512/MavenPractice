package beans.TestAutoWired;

public class TestAutoWired {
    private AutoWiredDataBean data1;
    private AutoWiredDataBean data2;

    public TestAutoWired() {

    }

    public AutoWiredDataBean getData1() {
        return data1;
    }

    public void setData1(AutoWiredDataBean data1) {
        this.data1 = data1;
    }

    public AutoWiredDataBean getData2() {
        return data2;
    }

    public void setData2(AutoWiredDataBean data2) {
        this.data2 = data2;
    }
}
