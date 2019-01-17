public class ForEx {

	public static void main(String[] args) {

		// 반복문은 궁극적으로 중복되는 코드를 제거하기 위해서 사용한다.
		// for(초기화; 조건식; 증감식)
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				int result = i * j;
//				System.out.println(i + "*" + j + "=" + result);
//			}
//			System.out.println();
//		}
		
		int result = 0;
		for (int i=1; i<=10; i++){
			result += i;
		}
		System.out.println(result);

	}

}
