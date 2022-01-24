import java.util.Scanner;

public class day2_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("반지름을 입력해주세요:");
		int r=sc.nextInt();
		final double PI=3.14;
		double s=r*r*PI;
		System.out.println("원의 넓이는 "+(int)s+"입니다^^ ");
		// 형변환(casting) 
		//int i=(int)3.14; -> 명시적 형변환
	}

}
