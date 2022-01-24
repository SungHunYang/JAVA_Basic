import java.util.Scanner;

public class day10_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int i1=sc.nextInt();
		System.out.println("입력한 정수는"+i1);
		sc.nextLine(); // 남아있는 엔터를 가져감
		
		System.out.print("문자열 입력: ");
		String str1=sc.nextLine(); // enter가 나올때까지를 가져감
		System.out.println("입력한 문자열은 "+str1);
		
		

	}

}
