import java.util.Scanner;

public class day3_4 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int a=10;
		int b=20;
		int res=0;
		
		System.out.print("원하는 부호를 넣으세요");
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
		System.out.println("결과는"+res+"입니다");
	}

}
