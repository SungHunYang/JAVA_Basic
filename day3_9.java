import java.util.Scanner;

public class day3_9 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int num;
		do {
			System.out.println("===�н��� �޴�===");
			System.out.println("1.������");
			System.out.println("2.����");
			System.out.println("3.�");
			num=sc.nextInt();
			} while(num<1 || 3<num);

		switch(num) {

		case 1:
			System.out.print("������");
			break;	
		case 2:
			System.out.print("����");
			break;
		case 3:
			System.out.print("�");
			break;
		}
		System.out.println(" ���Խ��ϴ�");


	}

}
