import java.util.Scanner;

public class day3_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
			// 잘못된 값을 넣으면 다시 메뉴판이 나올수 있도록 만든것
			// while문 : 선조건후처리-> 최소수행횟수가 0번(한번도 수행안하게 할수있다)
            //do-while문: 선처리 후 조건 -> 최수수행횟수가 1번(반드시 한번은 수행한다)
		int act;
		do{
		System.out.println("===메뉴판===");
		System.out.println("1.아메리카노");
		System.out.println("2.카페라떼");
		System.out.println("3.프라푸치노");
		act=sc.nextInt();	
	}while(act<1 || 3<act);

		
		// 예제333) 분식집  1.떡볶이 2.순대 3.어묵      실패시 재입력/    입력 성공시  1. ~ 나왔습니다 출력
	}
}

