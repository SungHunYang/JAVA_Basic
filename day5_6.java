import java.util.Scanner;

public class day5_6 {

	public static void main(String[] args) {
		System.out.println("���ϴ� ���� 5�� �־��ּ���: ");
		int[] data=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<data.length; i++) {
			System.out.print((i+1)+"°�� ��: ");
			data[i]=sc.nextInt();
		}
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		

	}

}
