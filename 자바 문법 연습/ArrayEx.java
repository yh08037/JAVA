
public class ArrayEx {

	public static void main(String[] args) {
		// 자바에서 사용되는 배열 문법 3가지
		
		// [1]
		int[] x = {10, 20, 30};
		
		// [2]
		int[] y = new int[3];
		y[0] = 10;
		y[1] = 20;
		y[2] = 30;
		
		// [3]
		int[] z = new int[]{10, 20, 30};
		
		
		// 2차원 배열의 동적할당
		int[][] k = new int[2][];
		k[0] = new int[3];
		k[1] = new int[]{10, 20}; //new int[2]
	}

}
