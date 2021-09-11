package beans.Component.TestBeans;

import org.springframework.stereotype.Component;

@Component("bean4")
// @Component("beans5")
// 같은 class 를 공유하나 다른 id를 갖는 bean 을 생성하는 것은 불가능하다.
// 만약 필요하다면, xml 파일 내에서 직접 bean 을 생성해야 한다.
public class TestForComponent4 {
}
