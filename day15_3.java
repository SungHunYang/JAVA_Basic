
class MyException extends Exception{
	MyException(){
		// 나의 예외메세지를 " 예외 메세지 출력중..."
		super(" 예외 메세지 출력중... ");
	}
	MyException(String message){
		super(" 예외 메세지 출력중... ["+message+"]");
	}
}


public class day15_3 {

	static void f1() throws Exception {
		int a=10, b=1;
		System.out.println(a/b);
		System.out.println("f1() 수행 완료");
	}
	static void f2() throws Exception {
		// 여기서 나온 예외를 나를 부른 애한테 넘기겠다 --> throws
		Exception myE=new Exception("내가 만든 예외");

		throw myE;
	}
	static void f3() throws MyException {
		// 여기서 나온 예외를 나를 부른 애한테 넘기겠다 --> throws
		MyException myE2=new MyException();
		MyException myE3=new MyException("예외 메세지!");
		throw myE3;
	}

	
	public static void main(String[] args) {
		
		//[예외 처리 미루기]
		//throws
		try {
		f1();
		
		f2();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
