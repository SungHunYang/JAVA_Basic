
public class day1_2 {

	public static void main(String[] args) {
		
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
	//  �ڹ�   ��ƿ     ���ɳʻ�� sc�� �̸�-> new �ϰ� �հ� �Ȱ��� ���� (System.in){���Է�}
		// ���ɳʴ� �ѹ��� �ϸ� ������ �����ִ�.
		// ���⼭ out�� �����´ٴ� �����̰� in�� �����°� ���ٴ� �����̴�.
		System.out.print("�����Է�: ");
		int num1=sc.nextInt();
		// 6���ٿ��� ���� sc�� ����Ѱ� sc�� ������ �̸��̴�.
		// �̰��� ������ sc���ɳʷκ��� .������ nextint ��Ʈ�� �̷���
		System.out.println("�Ǽ��Է�:");
		double num2=sc.nextDouble();
		//String nextLine(), char c=sc.nextLine().charAt(0)
		System.out.println("�Էµ�������"+num1+"�Դϴ�");
		System.out.println("�Էµ�������"+num2+"�Դϴ�");
	}
}
