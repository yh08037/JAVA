class MyMethod {
	// 메소드의 문법 구조
	// 접근제한자 리턴형 메소드이름(파라미터)
	// 접근제한자 : public - protected - default - private
	// 리턴형 : void(리턴값없음) - 기본자료형 - 객체형
	// 파라미터 : 기본자료형 - 객체형
	public void add(int x, int y){
		int result = x + y;
		System.out.println( result );
	}
	public void add(double x, double y){
		double result = x + y;
		System.out.println( result );
	}
	// 메소드 오버로딩 : 한 클래스 안에 같은 이름을 가진 메소드를 여러개 만들 수 있게 지원해줌 
}

public class MethodEx {

	public static void main(String[] args) {
		// Method 사용
		MyMethod m = new MyMethod(); // (1)메소드를 포함한 클래스 객체화
		m.add(3,  3);
		m.add(0.3, 3);
	}

}
