import java.util.Scanner;

public class day3_4 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int a=10;
		int b=20;
		int res=0;
		
		System.out.print("���ϴ� ��ȣ�� ��������");
		char c=sc.nextLine().charAt(0);
		
		switch(c) {
		
		case'+':
			res=a+b;
			break;
		case'*':
			res=a*b;
			break;
		case'/':
			res=a/b;
			break;
		}
		System.out.println("�����"+res+"�Դϴ�");
	}

}
