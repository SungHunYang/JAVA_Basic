import java.util.Scanner;

class Card{
	String name;
	private int pw; //접근제어자
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
			System.out.println("잔액부족");
			return;
		}
		if(money>=10000) {
			Scanner sc=new Scanner(System.in);
		for(int i=0;i<3; i++) {
			System.out.print("비밀번호 입력: ");
			int pw=sc.nextInt();
			if(pw==this.pw) {
				this.money-=money;
				System.out.println("결제완료");
				return;
			}
		}
		System.out.println("결제 불가능");
		return;
		}
		this.money-=money;
		System.out.println("결제완료");
	}
	void show() {
		System.out.println(this.name+"님의 잔액: "+this.money+"원");
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

	void pay(int money){ //[오버라이딩]
		if(money>this.onemax) {
			System.out.println("일일한도 초과");
			return;
		}
		else if(money>=this.allmax) {
			System.out.println("전체한도 초과");
			return;
		}
		else {
			System.out.println("결제 성공");
			this.allmax-=money;
			return;
		}
	}
		
	
}

public class day10_2 {

	public static void main(String[] args) {

		Card c1=new Card("피즈",1234,20000);
		
		BusCard b1=new BusCard("베인",1234,10000);
		BusCard b2=new BusCard("애니",1234,10000,10);
		
		b1.ride();
		b1.show();
		b2.ride();
		b2.show();
		
	}

}
