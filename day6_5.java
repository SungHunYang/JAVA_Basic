
public class day6_5 {

	static int add(int x,int y) {
		System.out.println("Ȯ��1");
		return x+y;
	}
	static int add(int x,int y, int z) {
		System.out.println("Ȯ��2");
		return x+y+z;
	}
	static double add(double x,double y) {
		System.out.println("Ȯ��3");
		return x+y;
	}
	// ����� ���� ������ �Լ����� �̸��� �����ϰ� �����Ҽ��ִ�.
	// ��, ������ �Ű����� ���� or Ÿ�� /��ȯ���� Ÿ���� �޶���Ѵ�.
	//[�����ε�]�ڡڡ� �̸� �ܿ���
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		int num1=add(a,b);
		int num2=add(a,b,c);
		System.out.println(num1+" "+num2);
		
		
		double x=1.2;
		double y=2.3;
		double num3=add(x,y);
		System.out.println(num3);

	}

}
