import java.util.Scanner;

public class day4_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// ��ø�ݺ��� == ���� for��
		
		//������	
		for(int i=2; i<=9; i++) {
			for(int a=1; a<=9; a++) {
				System.out.println(i+"X"+a+"="+i*a);
			}
			System.out.println("---------");
		}
		
		
		System.out.println("���� �Ͻ�?");
		int c=sc.nextInt();
		for(int i=1; i<=c; i++) {
			for(int a=1; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//����5) �Ųٷ� �� ���
		//����1) ���� 1�� �Է� �ؼ� �Ųٷ� ����� = ���� 5�� ����
	}

}
