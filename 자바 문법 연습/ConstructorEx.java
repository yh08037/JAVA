
class Per {
	
	int age;
	String name;
	
	// �������� ������ Ư¡
	// �޼ҵ�� �����ϳ� �������� ����
	// �������� �̸��� Ŭ���� ��� �����ؾ���
	
	// ! �������� ���� ū ������ ������� �ʱ�ȭ !
	// �Ű������� ���� �����ڸ� ����Ʈ �����ڶ�� ��
	// ����Ʈ �����ڴ� ������ �� ����
	
	// ������ �����ε� ����
	public Per() {
		this("��浿", 25);
	}
	public Per(int a, String n) {
		this(n, a);
	}
	public Per(String n, int a) {
		age = a;
		name = n;
	}
	// this()�� ���� ������ �����ε��� �� �ߺ��Ǵ� �ڵ带 ����!!!
	// this() ���� Ŭ������ ������ ȣ��
	// this(), super() �Ѵ� �������� ù��° �ٿ����� ��� ����!!!
	
}

class Stu extends Per{
	int id;
	public Stu(int a, String n, int i){
		super(n, a);	// �Ʒ��� �ߺ��Ǵ� �ڵ带 ����!!!!
		id = i;
//		age = a;
//		name = n;
	}
}


public class ConstructorEx {
	
	public static void main(String[] args){
		Per p = new Per(); // ������ ȣ��
		// Ŭ������ ��üȭ �� �� �����ڰ� �� �ѹ� ȣ���!!
		
	}
	
}
