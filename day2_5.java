import java.util.Scanner;

public class day2_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�������� �Է����ּ���:");
		int r=sc.nextInt();
		final double PI=3.14;
		double s=r*r*PI;
		System.out.println("���� ���̴� "+(int)s+"�Դϴ�^^ ");
		// ����ȯ(casting) 
		//int i=(int)3.14; -> ����� ����ȯ
	}

}
