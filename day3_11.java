import java.util.Scanner;

public class day3_11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("����� ��������� �˷��帳�ϴ�.");
		System.out.print("����� ���̸� �˷��ּ���.");
		int age=sc.nextInt();
		int fee=0;
		if(age<=0 || 200<=age) {
			System.out.println("���̸� �߸� �Է��ϼ̾��");
		}
		else {
		if(age<=8 || age>=65)
		{fee=0;}
		else if(8< age && age <=20)
		{fee=800;}
		else
		{fee=1200;}
		System.out.println("����� �����"+fee+"�� �Դϴ�.");}
		
		
		
		
	}

}
