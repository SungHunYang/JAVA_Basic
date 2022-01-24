
public class day5_1 {

	public static void main(String[] args) {
		
		//[배열]
		// 1) 자료형(date type)
		// 2) 요소의 개수.크기.길이
		int[] arr= {10,20,30,40,50,}; // 처음부터 선언할수도 있다.
		int[] test=new int[3]; // 배열의 기본 모양 '숫자(3)'는 개수이다.
		// 인덱싱방식을 이용     index-> 각데이터(공간)마다 숫자를 부여
		// index번호는 [0]번부터 시작!
		//System.out.println(test); 배열은 이름으로 출력하면 이상한 값이 나옴 이렇게 하면 안됨
		test[0]=40;
		test[1]=50;
		test[2]=60;
		System.out.print(test[0]);
		System.out.print(test[1]);
		System.out.print(test[2]);
		// System.out.println(test[3]); 이걸 수행하면 인덱스가 범위를 벗어났다고 오류가 나옴
		
		// 배열을 만들기위한 조건
		// 1.저장될 데이터들이 서로 관련이 있어야함
		// 2.서로 같은 자료형이어야함
		System.out.println();
		System.out.println("배열의길이는"+test.length);
		for(int i=0; i<test.length; i++) // 굳이 i<3이라고 안하고 test.length로 길이로 해도 된다.
		{
			System.out.println("나의 "+(i+1)+"번째 시험성적은"+test[i]+"점입니다.");
		}
		
		//예제1) 5개의 정수데이터를 저장하는 data[]배열을 만들어주세요!
		// 이후 5개의 정수데이터를 입력받고, 출력해주세요
		
		
		

	}

}
