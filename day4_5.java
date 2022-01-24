import java.util.Scanner;

public class day4_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수를 입력: ");
		int a=sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("정수를 입력: ");
		int b=sc.nextInt();
		
		int i=0; // i가 이전 for문 에서 선언 되었기 때문에 새로 만들어 주어야함
		
		int min= a>b ? b:a;
		int max= a>b ? a:b;
		
		for(i=min; i<=max; i++) {
			System.out.print(i+" ");
		}
	}

}
