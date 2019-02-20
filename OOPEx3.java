
// extends : 클래스의 상속에 사용되는 키워드
// 클래스의 3가지 구성요소 
// (1) 멤버변수 
// (2) 메소드 method
// (3) 생성자 constructor
// 생성자는 상속되지 않는다!! -> super() 로써 상위 클래스의 생성자에 접근

// 자바의 3대 생략 요소
// (1) extends Object
// (2) default Constructor
// (3) super() : 상위 클래스의 생성자를 호출 -> 모든 생성자의 첫번째 라인에 생략되어있음

/*
class OP3 extends Object{ 	// extend Object 생략 가능
	
}
*/

class A{
	A() {
		System.out.println("생성자 A 호출");
	}
}
class B extends A{
	B() {
//		super();	// 생성자는 상속 못 받음 ->super()로써 중복되는 코드 제거 가능! 
		System.out.println("생성자 B 호출");
	}
}


public class OOPEx3 {

	public static void main(String[] args) {
		
		A a = new B();	// 가능	<- new B()하면  객체 B 안에 객체 A 가 만들어 짐 
//		B b = new A();	// 불가능
		
		// new B(); -> A가 먼저 만들어지고 B가 만들어짐
		// 실행 결과 A 호출 -> B 호출
		// 이는 super()가 생략되어있는 결과이다

		// 자바의 최상위 클래스는 Object 클래스이다
		// 따라서 Object o = new ??(); 는 어떤 것도 모두 가능하다
	}

}
