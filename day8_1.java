import java.util.Scanner;

// ���������� == ������
//public : �ٸ���Ű�������� ���ٰ���
//private : �ڱ��ڽ� Ŭ���������� ���� ����(��������)
//protected : ��ӹ��� Ŭ�������� ���ٰ���

// static :��ü�� �����ϰ� �����ϴ� ����

class Card2{
	String user;
	private int pw;
	
	//��Ŭ�� -> sourse -> Generate Getters and Setters
	 public int getPw() {
			return pw;   // �����ִ°� (�ִ�)
		}
		public void setPw(int pw) {
			this.pw = pw;   // �ٲٴ°� (��������)
		}
	
	/*void setPw(int pw) {
		this.pw=pw;
	}                         -> �̷��Ե� �ȴ�. �����ض�
	int getPw() {
		return this.pw;
	}*/
	Card2(String user){
		this(user,1234);
	}
    
	Card2(String user, int pw){
		this.user=user;
		this.pw=pw;
		
	}
	
}

public class day8_1 {

	public static void main(String[] args) {
		
		Card2 c1=new Card2("�ƹ���");
		Card2 c2=new Card2("�Ƹ�",9876);
		//System.out.println(c1.pw); -> private �� ���� ��� �Ұ�
		
		c1.setPw(5555);
		System.out.println(c1.getPw());
		

	}

}
