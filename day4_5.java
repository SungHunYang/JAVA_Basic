import java.util.Scanner;

public class day4_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		int a=sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("������ �Է�: ");
		int b=sc.nextInt();
		
		int i=0; // i�� ���� for�� ���� ���� �Ǿ��� ������ ���� ����� �־����
		
		int min= a>b ? b:a;
		int max= a>b ? a:b;
		
		for(i=min; i<=max; i++) {
			System.out.print(i+" ");
		}
	}

}
