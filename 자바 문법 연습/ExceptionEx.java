
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
			System.out.println("��� ���� ���� �߻�");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("���� �ʰ� ���� �߻�");
		} catch (Exception e) {
			System.out.println("������ ��� ����");
		}
		finally {
			//���� �߻����ο� ������� ����
			
		}
		
		//������ ���� �߻�
		//if (���� �߻� ���� Ȯ��) {
			Exception me = new MyException();
			throw me;
//			try {
//				throw me;
//			} catch (MyException e) {
//				
//			}
		//}
			
		//throw throws ���� �������� ���� �����!!
		
		System.out.println("---B---");
		System.out.println(result);
	}

}


