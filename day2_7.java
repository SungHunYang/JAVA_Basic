import java.util.Scanner;

public class day2_7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("1��");
		int a=sc.nextInt();
		System.out.print("2��");
		int b=sc.nextInt();
		System.out.print("3��");
		int c=sc.nextInt();
		int low = (a<b ? a:b)<c ? (a<b ? a:b):c;
		System.out.println("������������ "+low);
	}

}
