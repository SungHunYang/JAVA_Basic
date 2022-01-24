import java.util.Scanner;

public class day3_1 {

	public static void main(String[] args) {

		// switch
		Scanner sc=new Scanner(System.in);

		System.out.print("정수 입력: ");
		int num=sc.nextInt();

		switch(num) // () 안에 변수(or 값)을 입력
		{

		case 1:  
// case는 밑에있는 들여쓰기(만일 case 1이 실행되면 break가 없다면 17~26줄 모두)를 모두 실행한다 
			System.out.println("하나");
			break; // break를 만나면 믿에있는걸 수행하지 않고 switch문 밖으로 나간다
		case 2: 
			System.out.println("둘");
			break;
		case 3: 
			System.out.println("셋");
			break;
		default: // else와 유사하다
			System.out.println("해당없음");

			
//범위 액션은 if가 유리 (성적입력같은거), 버튼형은 switch가 유리(ARS 같은거)
			// String nextLine(), char c=sc.nextLine().charAt(0)
			
			//예제1)int a=10; ,int b=20;  c '+' switch 써서 계산기 만들기
			// 예제2) 정수 1개 입력 짝수/홀수
			// 예제3) R/G/Y(단일문자 1개 입력) R : 정지 Y:주의 G : 진행
		}


	}

}
