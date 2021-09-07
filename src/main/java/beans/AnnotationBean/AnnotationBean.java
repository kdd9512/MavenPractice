package beans.AnnotationBean;

import beans.AnnotationBean.AnnotationBeanData.AnnotationBeanData;
import beans.AnnotationBean.AnnotationBeanData.AnnotationBeanData2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class AnnotationBean {
    private int data1;
    private AnnotationBeanData data2;

    /* 자동 주입을 변수에 설정하기.
    * 자동으로 setter 메서드가 추가되어 setter 메서드를 통해 주입받게 된다.*/

    // 타입(여기서는 AnnotationBeanData)을 이용한 주입.
    @Autowired
    private AnnotationBeanData data3;

    /* 기본적으로 식별자가 없이 같은 클래스를 갖는 bean 은 한 개 이상 존재 할 수 없다.
    * 이 경우 @Qualifier("메서드명") annotation 을 추가하여
    * 같은 클래스를 갖는 서로 다른 메서드임을 식별하게끔 해야 정상 동작한다.*/

    @Autowired
    @Qualifier("obj19")
    private AnnotationBeanData2 data4;

    @Autowired
    @Qualifier("obj20")
    private AnnotationBeanData2 data5;

    /*
      현재 obj21이라는 이름을 갖는 메서드는 존재하지 않는다.
      없는 메서드를 찾아서 데이터를 주입하라는 명령이므로 당연히 오류가 발생한다.
      규모가 큰 프로젝트의 경우 이 이름을 하나하나 찾아서 등록하는것은 매우 번거롭기
      때문에, 이하와 같이 "@Autowired" annotation 옆에 (required = false) 를 추가하여
      "있으면 넣고 없으면 말고" 식으로 설정하는 것이 가능하다.*/

    @Autowired(required = false)
    @Qualifier("obj21")
    private AnnotationBeanData2 data6;


    public AnnotationBean() {
    }

    // 생성자를 이용한 직접주입.
    public AnnotationBean(int data1) {
        this.data1 = data1;
    }

    public AnnotationBean(int data1, AnnotationBeanData data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public int getData1() {
        return data1;
    }

    // 필수 주입 property.
    // 5.1이상부터는 생성자를 이용한 직접주입을 할 것을 권장하므로 @Required 는 사용되지 않는다.
    @Required
    public void setData1(int data1) {
        this.data1 = data1;
    }


    public AnnotationBeanData getData2() {
        return data2;
    }

    // 자동주입 (타입)
    @Autowired
    public void setData2(AnnotationBeanData data2) {
        this.data2 = data2;
    }

    public AnnotationBeanData getData3() {
        return data3;
    }

    public AnnotationBeanData2 getData4() {
        return data4;
    }

    public AnnotationBeanData2 getData5() {
        return data5;
    }

    public AnnotationBeanData2 getData6() {
        return data6;
    }

}
