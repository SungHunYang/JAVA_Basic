import java.util.Scanner;

public class day4_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int result=0;
		double average=0;
		System.out.println("정지를 원하면 '0'을 입력해주세요.");
		while(true) {
			System.out.print("정수를 입력: ");
			int num=sc.nextInt();
			if(num==0) {
				System.out.println("총합:"+result);
				System.out.println("평균:"+average);
				break;
			}
			cnt++;
			result+=num;
			average=(double)result/cnt; 
			// 형변환 int/int = int이기때문에 average가 실수여도 정수가 들어감 따라서 int/int=실수로 바꿔준다
			// 이런 방법도 형변환임 result*1.0/cnt -> 1.0을 곱해주면서 실수가 되어버림
		}
		

	}

}
