
public class day6_3 {

	static int f3() {
		// void �ڸ��� output�� �������� �ְ� ������ Ÿ�Կ� �´� ���������� �����ָ� �ȴ�.
		System.out.println("f3() ȣ��!");
		return 100; // output�� �ִ°Ŵ� 
		// return �ڱ� �ڽ��� ȣ���� ��ġ�� ���� '���' ��ȯ�ϴ� Ű����
	}
	
	static int f4(int x, int y) {
		System.out.println("f4() ȣ��");
		int z=x+y;
		return z;	
	}
	
	
	public static void main(String[] args) {
		
	 System.out.println("���α׷� ����...");
	 f3(); // �� �̰� = 100; �̰Ŷ� ����.
	 int a=f3(); // f3�� ȭ�鿡 �߰� ������ ������ 100�� a�� ����
	 int b=1;
	 b=f3();// 17�� ���ΰ� ��������
	 System.out.println("a:"+a+" b:"+b);
	 
	 int c=f4(a,b);
	 System.out.println("c:"+c);
			 
	 
	}

}
