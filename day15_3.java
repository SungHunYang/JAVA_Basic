
class MyException extends Exception{
	MyException(){
		// ���� ���ܸ޼����� " ���� �޼��� �����..."
		super(" ���� �޼��� �����... ");
	}
	MyException(String message){
		super(" ���� �޼��� �����... ["+message+"]");
	}
}


public class day15_3 {

	static void f1() throws Exception {
		int a=10, b=1;
		System.out.println(a/b);
		System.out.println("f1() ���� �Ϸ�");
	}
	static void f2() throws Exception {
		// ���⼭ ���� ���ܸ� ���� �θ� ������ �ѱ�ڴ� --> throws
		Exception myE=new Exception("���� ���� ����");

		throw myE;
	}
	static void f3() throws MyException {
		// ���⼭ ���� ���ܸ� ���� �θ� ������ �ѱ�ڴ� --> throws
		MyException myE2=new MyException();
		MyException myE3=new MyException("���� �޼���!");
		throw myE3;
	}

	
	public static void main(String[] args) {
		
		//[���� ó�� �̷��]
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
