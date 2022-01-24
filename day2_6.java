import java.util.Scanner;

public class day2_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("두자리수 정수를 입력해주세요");
		int num=sc.nextInt();
		int a=num/10;// 10의자리 구하기
		int b=num%10;// 1의 자리 구하기
		
		System.out.println(num+"십의자리는 "+a+"이고, 일의자리는 "+b+"이다");
		
	}

}
