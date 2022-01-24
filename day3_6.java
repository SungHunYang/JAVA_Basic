import java.util.Scanner;

public class day3_6 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a=sc.nextInt();
		
		switch(a%2) {
		case 0:
			System.out.println("a="+a+"짝수입니다.");
		    break;
		case 1: 
			System.out.println("a="+a+"홀수입니다.");
		}

	}

}
