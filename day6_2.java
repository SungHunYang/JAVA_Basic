
public class day6_2 {

	// ����ڰ� �����ϴ� �Լ�
	// ��� 
	// input : �Է°�, ����, �μ� , �Ű�����
	// output : �����, ���ϰ�, ��ȯ��, return
	static void f1() {
//	  �Լ��� ��ȣ�� ���´� /�Լ��� ��ȣ ���ʿ� '�Լ���'�� �ۼ��Ѵ� / �߰�ȣ �ȿ� '���'�� ������
//  input�� ��ȣ�ȿ� ���°� / void�� ������� ���ٴ� ���̴� ��,�Լ��� ���� �شٴ°� �ƴϴ�
		System.out.println("f1() ����!");
	} // ���Ǹ� �صл��� , ������ main �Լ����� ȣ������� ����� �����ϴ�.
	  // �ڵ��� ���뼺 ����
	// �Լ��� �־ �ִ� ��Ÿ�ϰ� �־ ���� ��Ÿ���� �ִ�.
	// �־ ���� ��Ÿ��(������) -> static��� ->��ä(���)�� �����ϰ� ������ ����� �����ض�
	
	static void f2(int a) {
		a++;
		System.out.println("f2() ���� "+a);
		
	}
	static void swap(int x, int y) {
		int tmp=x;
		x=y;
		y=tmp;
	}
	
	
	public static void main(String[] args) {
		
	//String[] -> ���ڿ�Ÿ���� �迭 , args(�迭��)
	// System.out.println(args[0]); -> run configuration ���� �����Ҷ� ���ο� �ǳ��ָ� ����.(�ܺο��� �����´ٰ� �����ϸ�ȴ�)
		
		// [�Լ�]
		
		System.out.println("���α׷�����...");
		f1(); f1(); f1(); //f1�� ȣ�� �ѰŴ�. �Լ��� main()���� ȣ���� ��ŭ �����
		f2(100);
		
		int a=10;
		int b=20;
		System.out.println("a="+a+", b="+b);
		f2(a);
		f2(b);
		System.out.println("a="+a+", b="+b); // f2�� a��  main a�� �ٸ���
		int x=10;
		int y=20;
		swap(x,y);
		System.out.println(x);
		System.out.println(y);

		
	}

}
