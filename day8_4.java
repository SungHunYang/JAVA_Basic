import java.util.Scanner;

// return : 함수를 즉시 종료시키는 키워드
// break : 제어문을 즉시 종료시키는 키워드

class Card{
	Scanner sc=new Scanner(System.in);
	String name;
	String user;
	int bal;
	int pw;
	int pay(int money) {
		if(this.bal<money) {
			System.out.println("잔액이 부족하여 결제 할수없습니다");
		}
		else if(money>=10000) {
			System.out.print("4자리 비밀번호를 입력해주세요: ");
			int i;
			for(i=0; i<2; i++) {
				int check=sc.nextInt();
				if(this.pw==check) {
					System.out.println("결제 되었습니다");
					this.bal-=money;
					break;
				}
				else if(i==0)
				{System.out.print("틀렸습니다! 다시 입력해주세요: ");}
			}
			while(i==2) {
				System.out.println("비밀번호 2회 이상실수!");
				System.out.println("결제 불가능");
				i++;}

		}
		else {
			this.bal-=money;
			System.out.println("결제 되었습니다");
		}
		return this.bal;
	}


	void show() {
		System.out.println(this.user+"님의 "+this.name+"카드 잔액은 "+this.bal+"입니다.");
	}
	Card(String user, String name){
		this(user, name, 1234, 0);
	}
	Card(String user, String name, int pw){
		this(user, name, pw, 0);
	}
	Card(String user, String name, int pw, int bal){
		this.user=user;
		this.bal=bal;
		this.name=name;
		this.pw=pw;
		System.out.println(this.user+"님의"+this.name+"카드");
		System.out.println("비밀번호:"+this.pw+" 잔액:"+this.bal);
	}
}


public class day8_4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int pw;
		int bal;
		int money;
		int num;
		int cnt;

		do
		{System.out.println("원하는 카드사를 선택해주세요");
		System.out.println(" 1. 삼성");
		System.out.println(" 2. LG");
		System.out.println(" 3. 비씨");
		num=sc.nextInt();}while(num>3 || num<1);
		switch(num)
		{
		case 1 : 
			System.out.println("비밀번호 입력: ");
			pw=sc.nextInt();
			System.out.println("잔액 입력: ");
			bal=sc.nextInt();
			Card c1=new Card("양성훈", "삼성", pw, bal);
			do{
				System.out.println("제품의 가격 입력: ");
				money=sc.nextInt();
				c1.pay(money);
				c1.show();
				do{System.out.println("제품을 더 구매하고싶으시면 1. 아니면 2.");
				cnt=sc.nextInt();}while(cnt<1 || cnt>2);
			}while(cnt==1);
			break;

		case 2 :
			System.out.println("비밀번호 입력: ");
			pw=sc.nextInt();
			System.out.println("잔액 입력: ");
			bal=sc.nextInt();
			Card c2=new Card("양성훈", "LG", pw, bal);
			do{
				System.out.println("제품의 가격 입력: ");
				money=sc.nextInt();
				c2.pay(money);
				c2.show();
				do{System.out.println("제품을 더 구매하고싶으시면 1. 아니면 2.");
				cnt=sc.nextInt();}while(cnt<1 || cnt>2);
			}while(cnt==1);
			break;

		case 3 :
			System.out.println("비밀번호 입력: ");
			pw=sc.nextInt();
			System.out.println("잔액 입력: ");
			bal=sc.nextInt();
			Card c3=new Card("양성훈", "비씨", pw, bal);
			do{
				System.out.println("제품의 가격 입력: ");
				money=sc.nextInt();
				c3.pay(money);
				c3.show();
				do{System.out.println("제품을 더 구매하고싶으시면 1. 아니면 2.");
				cnt=sc.nextInt();}while(cnt<1 || cnt>2);
			}while(cnt==1);
			break;
		}
		System.out.println();
		Card c4=new Card("양성훈", "무명");
		c4.pay(10000);
		c4.show();
		System.out.println();
		Card c5=new Card("양성훈", "무명", 5555);
		c5.pay(10000);
		c5.show();

	}

}
