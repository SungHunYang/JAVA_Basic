import java.util.Scanner;

public class day4_9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num=sc.nextInt();
		int a=0;
	while(a<=num) {
		a++; // continue�� ����Ҷ��� �����ϴ� �κ��� continue �տ� �־�� �����Ѵ�.
		if(num%a!=0) {
			continue;
		}
		System.out.print(a+" ");
		
		// ����� �ƴ϶�� ��������ʰڴ�! continue ����

	}
	}
}

