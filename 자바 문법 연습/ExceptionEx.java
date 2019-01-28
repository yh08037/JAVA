
class MyException extends Exception {
	
}


public class ExceptionEx {

	public static void main(String[] args) throws Exception {
		
		int x = 10;
		int y = 0;
		int result = 0;
		
		int[] z = {10, 20, 30};
		
		try {
			result = x/y;
			System.out.println(z[3]);
			System.out.println("---A---");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println("산술 연산 예외 발생");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("범위 초과 예외 발생");
		} catch (Exception e) {
			System.out.println("나버미 모든 예외");
		}
		finally {
			//예외 발생여부와 상관없이 실행
			
		}
		
		//나만의 예외 발생
		//if (예외 발생 조건 확인) {
			Exception me = new MyException();
			throw me;
//			try {
//				throw me;
//			} catch (MyException e) {
//				
//			}
		//}
			
		//throw throws 차이 면접에서 많이 물어본다!!
		
		System.out.println("---B---");
		System.out.println(result);
	}

}


