import java.util.Scanner;

public class day3_9 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int num;
		do {
			System.out.println("===ºÐ½ÄÁý ¸Þ´º===");
			System.out.println("1.¶±ººÀÌ");
			System.out.println("2.¼ø´ë");
			System.out.println("3.¾î¹¬");
			num=sc.nextInt();
			} while(num<1 || 3<num);

		switch(num) {

		case 1:
			System.out.print("¶±ººÀÌ");
			break;	
		case 2:
			System.out.print("¼ø´ë");
			break;
		case 3:
			System.out.print("¾î¹¬");
			break;
		}
		System.out.println(" ³ª¿Ô½À´Ï´Ù");


	}

}
