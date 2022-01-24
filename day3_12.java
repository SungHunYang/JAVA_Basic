import java.util.Scanner;

public class day3_12 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("시간(H)을 입력받겠습니다");
		int hour=sc.nextInt();
		System.out.print("분(M)을 입력받겠습니다");
		int Min=sc.nextInt();


		if(Min<20)
		{hour--;
		Min+=40;}
		else
		{Min-=20;}

		{if(hour==1)
		{hour=12;}
		else if(hour==0)
		{hour=11;}
		else
		{--hour;}}

		System.out.println("결과는"+hour+"시"+Min+"분 입니다");

	}

}
