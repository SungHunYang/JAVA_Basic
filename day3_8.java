import java.util.Scanner;

public class day3_8 {

	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);
		
		
		System.out.print("원하는 문자를 넣으세요");
		char c=sc.nextLine().charAt(0);
		
		switch(c) {
		
		case'R':
		case'r':// or과 같은 효과로 소문자까지 할수있다 들여쓰기된거 때문에 가능
			System.out.println("정지!");
			break;
		case'G':
		case'g':
			System.out.println("진행!");
			break;
		case'Y':
		case'y':
			System.out.println("주의!");
			break;
		default:
			System.out.println("값을 잘못 넣으셨어요");
		}
		

	}

}
