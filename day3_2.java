
public class day3_2 {

	public static void main(String[] args) {
		
		// [반복문]
		
		// while
		// : 반복횟수가 불명확할때 / 특정조건을 만족할때까지 계속 / 무한하게
		
		int i=1;
		
		while(i<=3) // 해당 조건식이 여기서 false가 나와야 19번(while을 나갈수있다)으로 이동 가능
		{
		
		System.out.println("안녕하세요!");
		i++;
		}// 코드의 재사용성을 증가
		
		System.out.println(i);
		
		
		i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.print("i="+i);
		
		//예제111) 정수를 1개 입력 : 7 1234567
		//예제222) 정수 1 입력: 정수 2 입력: 456
		
		
	
		
		
	}

}