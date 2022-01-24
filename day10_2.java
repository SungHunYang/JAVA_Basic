import java.util.Scanner;

class Card{
	String name;
	private int pw; //����������
	private int money;
	
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}

	Card(String name, int pw, int money){
		this.name=name;
		this.pw=pw;
		this.money=money;
	}
	Card(String name){
		this(name,1111,0);
	}
	void pay(int money) {
		if(this.money<=money) {
			System.out.println("�ܾ׺���");
			return;
		}
		if(money>=10000) {
			Scanner sc=new Scanner(System.in);
		for(int i=0;i<3; i++) {
			System.out.print("��й�ȣ �Է�: ");
			int pw=sc.nextInt();
			if(pw==this.pw) {
				this.money-=money;
				System.out.println("�����Ϸ�");
				return;
			}
		}
		System.out.println("���� �Ұ���");
		return;
		}
		this.money-=money;
		System.out.println("�����Ϸ�");
	}
	void show() {
		System.out.println(this.name+"���� �ܾ�: "+this.money+"��");
	}
}
class BusCard extends Card {
	BusCard(String name, int pw, int money) {
		this(name, pw, money,20);
	}
	BusCard(String name, int pw, int money,int age) {
		super(name, pw, money);
		this.age=age;
		if(this.age<8 || 65<=this.age) {
			this.fare=0;
		}
		else if(this.age<20) {
			this.fare=800;
		}
		else{
			this.fare=1300;
		}
	}
	int age;
	int fare;
	
	void ride() {
		this.pay(this.fare);
	}
	
}
class CreditCard extends Card{
	CreditCard(String name, int pw, int money,int onemax,int allmax) {
		super(name, pw, money);
		this.allmax=allmax;
		this.onemax=onemax;}
	CreditCard(String name, int pw, int money) {
		this(name, pw, money,1000,50000);
		}
	int onemax;
    int allmax;

	void pay(int money){ //[�������̵�]
		if(money>this.onemax) {
			System.out.println("�����ѵ� �ʰ�");
			return;
		}
		else if(money>=this.allmax) {
			System.out.println("��ü�ѵ� �ʰ�");
			return;
		}
		else {
			System.out.println("���� ����");
			this.allmax-=money;
			return;
		}
	}
		
	
}

public class day10_2 {

	public static void main(String[] args) {

		Card c1=new Card("����",1234,20000);
		
		BusCard b1=new BusCard("����",1234,10000);
		BusCard b2=new BusCard("�ִ�",1234,10000,10);
		
		b1.ride();
		b1.show();
		b2.ride();
		b2.show();
		
	}

}
