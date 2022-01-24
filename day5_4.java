
public class day5_4 {

	public static void main(String[] args) {
		
		//[가장 큰 정수 찾기] 알고리즘
		int[] data= {2,3,1,5,4};
		int max=data[0];
		for(int i=1; i<data.length; i++) {
			if(max<data[i]) {
				max=data[i];
			}
		}
		System.out.println("최대값은"+max);
		
		int min=data[0];
		int num=0;
		for(int i=1; i<data.length; i++) {
			if(min>data[i]) {
				min=data[i];
				num=i;
			}
		}
		System.out.println("최소값"+num+"번은"+min);
		

	}

}
