import java.util.Scanner;

class Phone2 implements usePhone2{
	Scanner sc=new Scanner(System.in);
	String name;
	int pw;
	boolean mode;
	Phone2(String name, int pw){
		this(name,pw,false);
	}
    Phone2(String name, int pw, boolean mode){
		this.name=name;
		this.pw=pw;
		this.mode=mode;
	}
	public boolean isMode() {
		if(this.mode) {
			System.out.println("��ũ�����");
			return true;
		}
		else{
			System.out.println("��ũ����� �ƴ�!");
			return false;
		}
	}
	public void show() {
		if(this.isMode()) {
			System.out.println("��й�ȣ Ȯ��: ");
			int pw=sc.nextInt();
			if(this.pw==pw) {
				System.out.println("����");
				System.out.println("����� �̸�: "+this.name);
				return;
			}
			else {
				System.out.println("���κҰ�");
			}
			
		}
		else {
			System.out.println("��밡��");
			return;
		}
	}
	public void changePW() {
		System.out.println("��й�ȣ �����ϼ���: ");
		int pw=sc.nextInt();
		this.pw=pw;
		System.out.println("���� ����");
	}

	
}


interface usePhone2{
	boolean isMode();
	void show();
	void changePW();
}

class iphone extends Phone2{ // abstract�� ��������� 

	iphone(String name, int pw) {
		super(name, pw);
	}
	public void show() {
		System.out.println("������ �Դϴ�.");
	}
	
}



public class day11_5 {

	public static void main(String[] args) {
		
		Phone2 p1=new Phone2("����",1234,true);
		Phone2 p2=new Phone2("��Į��",9876);
		p1.isMode();
		p1.show();
		p1.changePW();
		

	}

}
