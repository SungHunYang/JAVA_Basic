import java.util.Scanner;

public class day2_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���ڸ��� ������ �Է����ּ���");
		int num=sc.nextInt();
		int a=num/10;// 10���ڸ� ���ϱ�
		int b=num%10;// 1�� �ڸ� ���ϱ�
		
		System.out.println(num+"�����ڸ��� "+a+"�̰�, �����ڸ��� "+b+"�̴�");
		
	}

}
