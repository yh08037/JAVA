class MyMethod {
	// �޼ҵ��� ���� ����
	// ���������� ������ �޼ҵ��̸�(�Ķ����)
	// ���������� : public - protected - default - private
	// ������ : void(���ϰ�����) - �⺻�ڷ��� - ��ü��
	// �Ķ���� : �⺻�ڷ��� - ��ü��
	public void add(int x, int y){
		int result = x + y;
		System.out.println( result );
	}
	public void add(double x, double y){
		double result = x + y;
		System.out.println( result );
	}
	// �޼ҵ� �����ε� : �� Ŭ���� �ȿ� ���� �̸��� ���� �޼ҵ带 ������ ���� �� �ְ� �������� 
}

public class MethodEx {

	public static void main(String[] args) {
		// Method ���
		MyMethod m = new MyMethod(); // (1)�޼ҵ带 ������ Ŭ���� ��üȭ
		m.add(3,  3);
		m.add(0.3, 3);
	}

}
