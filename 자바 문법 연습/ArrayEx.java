
public class ArrayEx {

	public static void main(String[] args) {
		// �ڹٿ��� ���Ǵ� �迭 ���� 3����
		
		// [1]
		int[] x = {10, 20, 30};
		
		// [2]
		int[] y = new int[3];
		y[0] = 10;
		y[1] = 20;
		y[2] = 30;
		
		// [3]
		int[] z = new int[]{10, 20, 30};
		
		
		// 2���� �迭�� �����Ҵ�
		int[][] k = new int[2][];
		k[0] = new int[3];
		k[1] = new int[]{10, 20}; //new int[2]
	}

}
