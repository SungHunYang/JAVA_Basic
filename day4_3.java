import java.util.Scanner;

public class day4_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 중첩반복문 == 이중 for문
		
		//구구단	
		for(int i=2; i<=9; i++) {
			for(int a=1; a<=9; a++) {
				System.out.println(i+"X"+a+"="+i*a);
			}
			System.out.println("---------");
		}
		
		
		System.out.println("몇줄 하실?");
		int c=sc.nextInt();
		for(int i=1; i<=c; i++) {
			for(int a=1; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//예제5) 거꾸로 별 찍기
		//과제1) 정수 1개 입력 해서 거꾸로 별찍기 = 예제 5랑 같음
	}

}
