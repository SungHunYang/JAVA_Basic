import java.util.Scanner;

public class day3_10 {

	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("����� ������ �Է����ּ���.");
		int point=sc.nextInt();

		char grade;
		if(0>point || point>100) {
			System.out.println("�߸����Է��Դϴ�.");
		}// ��ȿ�� �˻� �߸��� �Է°��� ���� �浵
		else {
		if(80<=point && point <= 100)
		{grade='A';
		}
		else if(50<=point && point <= 79)
		{grade='B';
		}
		else
		{grade='F';
		}
		System.out.println("����� ������"+grade+"�Դϴ�");
	}}
}
