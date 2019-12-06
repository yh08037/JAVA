# static 키워드 : 정적 변수, 정적 메소드를 만든다

## 정적 변수(static varible)

한 클래스의 모든 객체들에 의하여 공유되는 변수

클래스 변수(class varible) 라고도 함

객체의 필드들은 인스턴스 변수(instance varible)이라고 함

상수는 정적 변수로 선언( static final )하여 메모리 절약



## 정적 메소드 (static method)

객체가 생성되지 않은 상태에서 호출되는 메소드

클래스 이름을 통하여 호출됨 ( Math.sqrt() / main() 등 )

this 키워드 사용 불가 <- 참조할 인스턴스가 없기 때문

정적 메소드 내에서 인스턴스 변수, 메소드 사용 불가
