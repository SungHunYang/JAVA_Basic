
public class day4_2 {

	public static void main(String[] args) {
		
		// for
        // : 반복횟수가 명확할때/ N회, a번/ 범위가 주어졌을때(a~b까지)
		
		// (초기식;조건식 ;증감식) 초기->조건->수행문->증감->조건->수행문->증감->조건
		for(int i=0;i<3;i++) {
			System.out.print("안녕!");
		}
		// 10번 라인의 조건식이 F가 되어야 13번라인(반목문을 빠저나옴)으로 이동
		System.out.println();
		for(int a=1; a<=10; a++) {
			System.out.print(a+" ");
		}
		//예제3)   정수 1개 입력 다 뽑아내기  3-1) 정수 2개 입력 사이값
		
		for(int i=1; i<=30; i++) {
			if(i%2==1) {
				continue; // for 에서는 증감식으로 보낸다.
			}
		System.out.println(i);
		}
		//예제4) 정수를 10번 입력 양수 0 음수 상관없음 
		// 양수 : 총합   0 : 즉시 종료  음수 : 총합xx 종료시 총합 출력 
		//continue break 모두 사용
	}

}
