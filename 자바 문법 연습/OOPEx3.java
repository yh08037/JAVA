
// extends : Ŭ������ ��ӿ� ���Ǵ� Ű����
// Ŭ������ 3���� ������� 
// (1) ������� 
// (2) �޼ҵ� method
// (3) ������ constructor
// �����ڴ� ��ӵ��� �ʴ´�!!

// �ڹ��� 3�� ���� ���
// (1) extends Object
// (2) default Constructor
// (3) super() : ���� Ŭ������ �����ڸ� ȣ�� -> ��� �������� ù��° ���ο� �����Ǿ�����

/*
class OP3 extends Object{ 	// extend Object ���� ����
	
}
*/

class A{
	A() {
		System.out.println("������ A ȣ��");
	}
}
class B extends A{
	B() {
//		super();	// �����ڴ� ��� �� ���� ->super()�ν� �ߺ��Ǵ� �ڵ� ���� ����! 
		System.out.println("������ B ȣ��");
	}
}


public class OOPEx3 {

	public static void main(String[] args) {
		
		A a = new B();	// ����	<- new B()�ϸ�  ��ü B �ȿ� ��ü A �� ����� �� 
//		B b = new A();	// �Ұ���
		
		// new B(); -> A�� ���� ��������� B�� �������
		// ���� ��� A ȣ�� -> B ȣ��
		// �̴� super()�� �����Ǿ��ִ� ����̴�

	}

}
