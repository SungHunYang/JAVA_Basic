import java.util.Random;

public class day5_7 {

	public static void main(String[] args) {
		
		Random rand=new Random();
		int[] data=new int[10];
		
		for(int i=0; i<data.length; i++) {
			data[i]=rand.nextInt(10)+1;
		}
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		for(int num=1; num<=10; num++) {
			int cnt=0;
		for(int i=0; i<data.length; i++) {
			if(data[i]==num) {
				cnt++;
			}
		}if(cnt==0) {
			continue;
		}
		System.out.println(num+"Àº"+cnt+"°³");
		}
		

	}

}
