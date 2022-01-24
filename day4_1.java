import java.util.Scanner;

public class day4_1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);


		while(10<100) // 무한루프-> [종료조건]을 필요로한다
		{
			System.out.println("확인");
			break; // 자신이 속해있는 반복문의 바깥으로 만나는 즉시 이동한다.
			       // 이게 없으면 '확인2'는 나오지 않는다	
		}
		System.out.println("확인2");

		int i=1;
		while(i<=50) {
			System.out.print(i);
			i++;
			if(i==20) {
				break; // ★조건문if 안에 있더라도 반복문 바깥으로 나가기 때문에 while 밖으로 나감★
			}
			
			System.out.println();
			
			// 짝수일때만 출력해주세요. break를 사용할때의 어감
		    // 홀수일때, 출력하지않겠습니다. continue 를 사용할때의 어감

			
			int c=1;
			while(c<=50) {
				c++;
				if(c%2==1)
				{
				continue; // 자신이 해당되어있는 반복문의 조건식으로 즉시 이동시킨다.(while(i<=50)으로 이동)
				}
				System.out.print(c);
				
				
				//예제1) 정수 1개입력 -> 그 정수의 약수들을 출력 continue 사용
				
				System.out.print("정수 입력: ");
				int num=sc.nextInt();
				int a=1;
			while(a<=num) {
				if(num%a==0) {
					System.out.print(i+" ");
				}
				i++;
			}
				//예제2) 정수를 여러번 입력  0입력시 즉시 종료 -> 그때 그동안 입력했던 정수의 총합과 평균(실수)를 보여줘라
			}
		}
		
	}

}
