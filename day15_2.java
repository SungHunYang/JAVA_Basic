import java.util.Scanner;

public class day15_2 {

	public static void main(String[] args) {
		
		// 예외를 만든다.
		
		Scanner sc=new Scanner(System.in);
		
		Exception myExcep = new Exception("최상위 예외 클래스로 만든 예외 객체");
		System.out.println(myExcep.getMessage());
		// 위에 두개를 통해 message를 get으로 꺼낸거라고 볼수있음
		/*class Exception{
			private String message;
			Exception(){
				
			}
			Exception(String msg){
				this.message=msg;
			}
			Public String getMessage() {
				return this.message;
			}  이런식으로 되어있는거다
		}*/
		System.out.println("회원 정보를 입력하세요");
		System.out.println("나이 입력: ");
		try {
		int age=sc.nextInt();
		if(age<=0 || 200<=age) {
			// 예외를 발생시키고 싶다.
			throw myExcep;
			// 일부러 해당예외가 발생한다.
			// catch에 myExcep을 날린다.
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			// Exception e 에서 e 에 myExcep이 들어가는거다
		}
	}

}
