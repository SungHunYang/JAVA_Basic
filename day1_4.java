import java.util.Scanner;

public class day1_4 {

	public static void main(String[] args) {
		//작동을 위해 메인함수 설정
		Scanner yes=new Scanner(System.in);
		
		System.out.println("지금부터 협상을 시작하겠습니다");
		System.out.println("원하는 연봉을 알려주세요");
		int money=yes.nextInt();
		System.out.println("축하합니다 당신의 연봉은 "+money+" 입니다");
		
		System.out.println("생각해보니 이름이 뭐죠?");
		String name=yes.next();
		System.out.println(name);
		
		
		

	}

}
