
class Per {
	
	int age;
	String name;
	
	// 생성자의 문법적 특징
	// 메소드와 유사하나 리턴형이 없음
	// 생성자의 이름은 클래스 명과 동일해야함
	
	// ! 생성자의 가장 큰 목적은 멤버변수 초기화 !
	// 매개변수가 없는 생성자를 디폴트 생성자라고 함
	// 디폴트 생성자는 생략할 수 있음
	
	// 생성자 오버로딩 가능
	public Per() {
		this("김길동", 25);
	}
	public Per(int a, String n) {
		this(n, a);
	}
	public Per(String n, int a) {
		age = a;
		name = n;
	}
	// this()를 통해 생성자 오버로딩할 때 중복되는 코드를 제거!!!
	// this() 현재 클래스의 생성자 호출
	// this(), super() 둘다 생성자의 첫번째 줄에서만 사용 가능!!!
	
}

class Stu extends Per{
	int id;
	public Stu(int a, String n, int i){
		super(n, a);	// 아래의 중복되는 코드를 제거!!!!
		id = i;
//		age = a;
//		name = n;
	}
}


public class ConstructorEx {
	
	public static void main(String[] args){
		Per p = new Per(); // 생성자 호출
		// 클래스가 객체화 될 때 생성자가 단 한번 호출됨!!
		
	}
	
}
