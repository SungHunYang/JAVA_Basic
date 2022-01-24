import java.util.Scanner;

public class day3_11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("당신의 버스요금을 알려드립니다.");
		System.out.print("당신의 나이를 알려주세요.");
		int age=sc.nextInt();
		int fee=0;
		if(age<=0 || 200<=age) {
			System.out.println("나이를 잘못 입력하셨어요");
		}
		else {
		if(age<=8 || age>=65)
		{fee=0;}
		else if(8< age && age <=20)
		{fee=800;}
		else
		{fee=1200;}
		System.out.println("당신의 요금은"+fee+"원 입니다.");}
		
		
		
		
	}

}
