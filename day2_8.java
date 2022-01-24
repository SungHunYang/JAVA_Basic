import java.util.Scanner;

public class day2_8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("가장 큰 실수를 찾습니다 ");
		System.out.print("확인하고싶은 첫번째 실수를 넣어주세요: ");
		double a=sc.nextDouble();
		System.out.print("확인하고싶은 두번째 실수를 넣어주세요: ");
		double b=sc.nextDouble();
		System.out.print("확인하고싶은 세번째 실수를 넣어주세요: ");
		double c=sc.nextDouble();

		if(a>b && a>c)
		{System.out.print(a+"가 가장큰실수입니다");}
		else if(b>a && b>c)
		{System.out.print(b+"가 가장큰실수입니다");}
		else
		{System.out.print(c+"가 가장큰실수입니다");}
	}

}
