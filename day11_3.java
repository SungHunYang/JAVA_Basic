
//[�������̽�]
// ���������� �������̽��� ������ ������ �߰����ִ� ������ �Ѵ�.
// ���� TV�� �θ�Ŭ�����̰� �ڵ���TV,�׺�TV�� �ڽ� Ŭ���� �̸� 
// TV���� ����� �θ𿡰� ��� �ް�, �������̽� Phone���� ������ ����� �ڵ���TV,�׺�TV�� �� �޴´�.

interface A{
	int a=100;
	public static final int b=0; 
	// �������̽����� �� ������ ��� "public static final"�� [�ڵ�]���� �پ��ִ�.
	// public -> ������ ���ٰ���
	// static -> ��ü�� �����ϰ�
	// final -> ���ȭ , �ʱ�ȭ�� �ݵ�� �ؾ���!
	// ����Ʈ�� ������
	void f1();
	// �������̽� ���� �޼����, "public abstract" [�ڵ�]���� ����
	// public
	// abstract -> ���� �Ұ���. �������̵�(������) ����
	public abstract void f2();  // �߻� �޼���
}
class B implements A{
	
	public void f1() { // �׻� "�θ��� �������� <= �ڽ��� ��������"
		
	}
    public void f2() {
		
	}
	
}

public class day11_3 {

	public static void main(String[] args) {
		

	}

}
