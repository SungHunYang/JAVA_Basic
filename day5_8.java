import java.util.Random;

public class day5_8 {

	public static void main(String[] args) {
		
		int[] num=new int[5];
		Random rand=new Random();
		
		for(int i=0; i<num.length;i++) {
			num[i]=rand.nextInt(90)+10;
		}
		System.out.print("[");
		for(int i=0; i<num.length;i++) {
			
			System.out.print(num[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		for(int a=0; a<num.length;a++) {
		for(int i=0; i<num.length-1;i++) {
			if(num[i]>num[i+1]) {
				int temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}}
		}
		for(int a=0; a<num.length;a++) {
			System.out.print(num[a]+" ");
		}
	}

}
