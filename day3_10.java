import java.util.Scanner;

public class day3_10 {

	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("당신의 성적을 입력해주세요.");
		int point=sc.nextInt();

		char grade;
		if(0>point || point>100) {
			System.out.println("잘못된입력입니다.");
		}// 유효성 검사 잘못된 입력값에 대한 방도
		else {
		if(80<=point && point <= 100)
		{grade='A';
		}
		else if(50<=point && point <= 79)
		{grade='B';
		}
		else
		{grade='F';
		}
		System.out.println("당신의 성적은"+grade+"입니다");
	}}
}
