import java.util.Scanner;

public class day5_6 {

	public static void main(String[] args) {
		System.out.println("원하는 값을 5개 넣어주세요: ");
		int[] data=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<data.length; i++) {
			System.out.print((i+1)+"째의 값: ");
			data[i]=sc.nextInt();
		}
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		

	}

}
