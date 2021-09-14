# Spring AOP 용어

* Joint Point : 모듈이 삽입되어 동작하게 되는 특정위치(메서드 호출 등). 관심사를 의미.
* Point Cut : 다양한 Joint Point(관심사) 중, 어떤 것을 사용할 것인지 선택.
* Advice : Joint Point 에 삽입되어 동작할 수 있는 코드.
* Weaving : Advice 를 핵심 로직 코드에 적용.
* Aspect : Point Cut + Advice



# Spring AOP Advice 종류

* before : 관심사로 설정 된 메서드 호출 전에 동작하는 Advice
* after-returning : 예외없이 호출 된 메서드의 동작이 완료되면동작하는 Advice
* after-throwing : 예외가 발생했을 때에 동작하는 Advice
* after : 예외 발생 유/무 에 관계 없이 호출된 메서드의 동작이 완료되면 동작하는 Advice 
* around : 메서드 호출 전과 후에 동작하는 Advice