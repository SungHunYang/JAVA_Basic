import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class day4_6 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("양수의 합계를 구합니다.");
		System.out.println("종료를 원하면 '0'을 눌러주세요");
		for(int i=1; i<=10; i++) {
			System.out.print("정수를 입력:");
			int a=sc.nextInt();
			if(a==0) {
				break;
			}
			else if(a<0) {
				continue;
			}
				sum+=a;
		}
		System.out.print("총합:"+sum);

	}

}
