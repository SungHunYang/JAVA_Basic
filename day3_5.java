import java.util.Scanner;

public class day3_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("원하는 정수를 입력해주세요: ");
		int a=sc.nextInt();
		int i=1;
		while(i<=a)
		{
			System.out.print(i+" ");
			i++;
		
		}
		System.out.println();
		System.out.print(i);
	}

}
