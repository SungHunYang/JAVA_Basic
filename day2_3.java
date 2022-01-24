import java.util.Scanner;

public class day2_3 {

	public static void main(String[] args) {
		// [제어문]

		// [조건문]
		// : ~할때.양자택일.특정조건.분기점

		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		
		if(num%12==0)  // if만 사용하면 if끼리 영향 주지않고 다른 문단처럼 사용한다.
		{System.out.println("12의배수입니다");}
		if(num%2==0) // if(조건식) 해당조건식의 결과가 T이면 {}안에 수행문을 실행
		{System.out.print("짝수입니다");}
		else// 자신과 가장가까운 if와만 짝지어서 하나의 if에만 반응한다
		{System.out.print("홀수입니다");}
		//ctrl+A(전체선택) -> ctrl+I(줄정렬)
		
		if(num%12==0)  // else if가 되면 3개의 if가 연결된다. if가 T이면 연결된 if문은 모두 무시
		{System.out.println("12의배수입니다");}
		else if(num%2==0) // if가 F면 else if가 진행됨
		{System.out.print("짝수입니다");}
		else
		{System.out.print("홀수입니다");}
		
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a<b && a<c) {
			System.out.println(a);}
		else if(b<a && b<c) {
			System.out.println(b);}
		else {System.out.println(c);}
		
	//예제5) 실수 3개 입력 가장 큰 실수를 출력
	
		//과제1) 성적입력하세요. (0~100) 80~100 A 50~79 B 0~49 F 출력 
        //과제2) 버스요금을 알려주는 프로그램    나이입력: 8이하 or 65이상 0원 , 20이하: 800원 , 나머지 1200원
		//과제3) H시M분 입력 -> 1시간 20분전을 출력 ex) 12:30->11:10
		  // 1~12 / 0~59   1:10-> 11:50 이렇게 나오게 
		
		//coding_helper@naver.com 
		//[JAVA 방학특강]
	}
	





		// [반복문]
		// : 여러번진행.무한하게.N회.N번.특정조건일때 계속





	}


