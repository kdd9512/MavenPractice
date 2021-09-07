package beans.AnnotationBean;

import beans.AnnotationBean.AnnotationBeanData.AnnotationBeanData3;
import beans.AnnotationBean.AnnotationBeanData.AnnotationBeanData4;
import org.springframework.beans.factory.annotation.Value;

public class AnnotationBean2 {
    private int data1;
    private String data2;
    private AnnotationBeanData3 data3;
    private AnnotationBeanData4 data4;

    // 자동주입 관련 주석을 전혀 달지 않았음에도 타입을 알아서 찾아내어 자동주입이 되는데,
    // 이는 beans.xml 에 입력했던 <context:annotation-config/> 때문이다.

    public AnnotationBean2(@Value("1972") int data1, @Value("11월 21일. 김두한은 쓰러졌다") String data2,
                           AnnotationBeanData3 data3, AnnotationBeanData4 data4) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }

    public AnnotationBean2() {

    }

    public int getData1() {
        return data1;
    }

    public String getData2() {
        return data2;
    }

    public AnnotationBeanData3 getData3() {
        return data3;
    }

    public AnnotationBeanData4 getData4() {
        return data4;
    }
}
