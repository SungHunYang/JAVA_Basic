import java.util.Scanner;

public class day3_8 {

	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);
		
		
		System.out.print("���ϴ� ���ڸ� ��������");
		char c=sc.nextLine().charAt(0);
		
		switch(c) {
		
		case'R':
		case'r':// or�� ���� ȿ���� �ҹ��ڱ��� �Ҽ��ִ� �鿩����Ȱ� ������ ����
			System.out.println("����!");
			break;
		case'G':
		case'g':
			System.out.println("����!");
			break;
		case'Y':
		case'y':
			System.out.println("����!");
			break;
		default:
			System.out.println("���� �߸� �����̾��");
		}
		

	}

}
