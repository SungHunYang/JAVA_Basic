import java.util.Scanner;

public class day15_2 {

	public static void main(String[] args) {
		
		// ���ܸ� �����.
		
		Scanner sc=new Scanner(System.in);
		
		Exception myExcep = new Exception("�ֻ��� ���� Ŭ������ ���� ���� ��ü");
		System.out.println(myExcep.getMessage());
		// ���� �ΰ��� ���� message�� get���� �����Ŷ�� ��������
		/*class Exception{
			private String message;
			Exception(){
				
			}
			Exception(String msg){
				this.message=msg;
			}
			Public String getMessage() {
				return this.message;
			}  �̷������� �Ǿ��ִ°Ŵ�
		}*/
		System.out.println("ȸ�� ������ �Է��ϼ���");
		System.out.println("���� �Է�: ");
		try {
		int age=sc.nextInt();
		if(age<=0 || 200<=age) {
			// ���ܸ� �߻���Ű�� �ʹ�.
			throw myExcep;
			// �Ϻη� �ش翹�ܰ� �߻��Ѵ�.
			// catch�� myExcep�� ������.
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			// Exception e ���� e �� myExcep�� ���°Ŵ�
		}
	}

}
