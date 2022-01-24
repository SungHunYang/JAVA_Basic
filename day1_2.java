
public class day1_2 {

	public static void main(String[] args) {
		
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
	//  자바   유틸     스케너사용 sc는 이름-> new 하고 앞과 똑같이 적고 (System.in){값입력}
		// 스케너는 한번만 하면 여러번 쓸수있다.
		// 여기서 out은 가져온다는 느낌이고 in은 가져온걸 쓴다는 느낌이다.
		System.out.print("정수입력: ");
		int num1=sc.nextInt();
		// 6번줄에서 만든 sc를 사용한것 sc는 설정한 이름이다.
		// 이것의 설명은 sc스케너로부터 .받을게 nextint 인트를 이런뜻
		System.out.println("실수입력:");
		double num2=sc.nextDouble();
		//String nextLine(), char c=sc.nextLine().charAt(0)
		System.out.println("입력된정수는"+num1+"입니다");
		System.out.println("입력된정수는"+num2+"입니다");
	}
}
