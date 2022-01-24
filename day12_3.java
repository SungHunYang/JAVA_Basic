
public class day12_3 {

	public static void main(String[] args) {
		
		// 향상된 for문 -> 주로 배열[] 구조와 함께 이용하는 경우 多
		// forEach문
		int[] data= {1,2,3,4,5};
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println();
		for(int v:data) {
		//  배열 안에 저장되어있는 타입 : 내가 선언한 배열
		// 배열의 개수만큼 돎
			System.out.println(v);
		}

	}

}
