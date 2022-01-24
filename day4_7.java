import java.util.Scanner;

public class day4_7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ธ๎มู?");
		int c=sc.nextInt();
		for(int i=0; i<c; i++) {
			for(int a=1; a<=c-i; a++) {
				System.out.print("*");
			}
			System.out.println();
	}

}
}
