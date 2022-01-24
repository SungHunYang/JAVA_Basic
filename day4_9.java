import java.util.Scanner;

public class day4_9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		int a=0;
	while(a<=num) {
		a++; // continue를 사용할때는 증가하는 부분이 continue 앞에 있어야 증가한다.
		if(num%a!=0) {
			continue;
		}
		System.out.print(a+" ");
		
		// 약수가 아니라면 출력하지않겠다! continue 느낌

	}
	}
}

