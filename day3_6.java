import java.util.Scanner;

public class day3_6 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int a=sc.nextInt();
		
		switch(a%2) {
		case 0:
			System.out.println("a="+a+"¦���Դϴ�.");
		    break;
		case 1: 
			System.out.println("a="+a+"Ȧ���Դϴ�.");
		}

	}

}
