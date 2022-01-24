import java.util.Random;

public class day5_3 {

	public static void main(String[] args) {
		
		int[] data=new int[5];
		
		Random rand=new Random();
     // 랜덤사용   이름     -> import 해줘야 된다. shift+ctrl+O
		for(int i=0; i<data.length; i++) {
			data[i]=rand.nextInt(6)+1; 
			// 0~5중에서 (6가지의) 랜덤수중 1개를 뽑아주세요 -> rand.nextInt(6)
			// 0~5  -> +1   ->1~6  ->rand.nextInt(6)+1
			// rand.nextInt(랜덤수 가짓수)+시작정수		
		}
		System.out.print("[");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}System.out.print("]");
		
		// 예제2) 정수를 10개 저장하는 배열 1~10까지 랜덤수 중 저장  1이 몇개 2가 몇개 3이 몇개 인지 출력
	}

}
