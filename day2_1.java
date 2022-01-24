import java.util.Scanner;

public class day2_1 {

	public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);
		
		//[연산자] 
		//대입연산자-> 방향이존재함.우선순위가 낮음
		int a=10;
		int b=20;
		int sum=a+b; //=(대입), +(산술)-> 연산자 우선순위

		// 산술 연산자 +-/%
		// 정수+정수 ->정수 정수끼리 계산하면 정수만 나옴 ex) 10/3=3
		//10/3-> 몫.int 10%3-> 나머지.mod
		System.out.println("10%3="+(10%3)+"");
		
		// 복합대입 연산자
		int s1=70;
		int s2=76;
		int s3=98;
		int hap=0;
		hap=hap+s1; // 연산자가 2개 =,+
		hap+=s2; // 연산자 1개 +=
		
		// 예제1) 정수 2개 입력 : 사각형의 넓이를 출력
		// 예제2) 정수 1개 입력 : 원의 넓이를 출력
		// 형변환(casting) 
				//int i=(int)3.14; -> 명시적 형변환
		        //[반올림이 아니라 소수점 뒤에를 아예 삭제 해서 데이터 손실이 일어남 자주 쓰면 안좋음]
		 // double d=6; -> 자동 형변환
		  // 이건 더 크게 들어간거라 자동으로 6.0 으로 결과 나옴 문제 될것 없음
		
		
		
		
	}

}
