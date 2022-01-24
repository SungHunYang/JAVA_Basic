
public class day5_5 {

	public static void main(String[] args) {
		
		// ★[정렬]★ : 버블정렬, 삽입, 퀵, 합병, 도수 ,셀.....
		// -> "탐색"을 용이하게 하기위해서이다.
		// : 버블정렬 -> 인근에 있는 두 데이터를 비교함
		
		int[] data= {5,3,4,2,1};
		int temp=0;
		for(int a=0; a<data.length;a++) { //비교 수행 자체를(데이터개수)번==N회전 정렬
		// 비교하는 행위는 (데이터개수-1)번 수행함
		for(int i=0; i<data.length-1;i++) {
			if(data[i]>data[i+1]) {
				temp=data[i];
				data[i]=data[i+1];
				data[i+1]=temp;
			}
		}
		}
		for(int i=0; i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
   // 예제3) 정수를 5개 저장하는 배열 10~99 까지 랜덤으로 수 저장 -> 출력 하고 그리고 버블정렬해서 오름차순으로 저장-> 출력
	}

}
