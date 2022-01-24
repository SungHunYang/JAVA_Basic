
// 과제 강사님 버전

import java.util.Scanner;

// 카드
class Card1{
	String user; // 사용자이름
	String name; // 카드사
	int bal; // 잔액
	private int pw; // 비밀번호

	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	Card1(String user,String name){
		this(user,name,1234,0);
	}
	Card1(String user,String name,int pw){
		this(user,name,pw,0);
	}
	Card1(String user,String name,int pw,int bal){
		this.user=user;
		this.name=name;
		this.bal=bal;
		this.pw=pw;
	}
	void pay(int money) {
		if(money>this.bal) {
			System.out.println(this.user+"님, 잔액부족!!!");
			return;
		}
		if(money>=10000) {
			for(int i=0;i<2;i++) {
				if(this.check()) {
					this.bal-=money;
					return;
				}
			}
			System.out.println("비밀번호를 2회이상 틀리셨습니다!");
			return;
		}
		this.bal-=money;
		// 1.만약에 money 1만원이상의 금액이면 비밀번호 확인을 진행해주세요!
		// 2.2번이상틀리면 결제할수없습니다.
		// 3.잔액이 부족하면 결제할수없습니다.
	}
	boolean check() {
		Scanner sc=new Scanner(System.in);
		System.out.print("비밀번호 입력: ");
		int pw=sc.nextInt();
		if(this.pw==pw) {
			return true;
		}
		return false;
	}
	void show() {
		System.out.println(this.user+"님의 "+this.name+"카드의 잔액은 "+this.bal+"원입니다.");
		// ㅁㅁ님의 oo카드의 잔액은 ____원입니다.
	}
}

public class day8_5 {

	public static void main(String[] args) {

		/*
      1)사용자이름,카드사는 무조건 지정해야함.
      잔액은 0원,비밀번호는 1234로 지정해주세요.

      2)사용자이름,카드사,비밀번호
      3)사용자이름,카드사,비밀번호,잔액

      사용자이름,카드사,잔액xxxxx
		 */

		Card1 c1=new Card1("아무무","신한");
		Card1 c2=new Card1("아리","국민",5555);
		Card1 c3=new Card1("티모","현대",9999,20000);

		c1.pay(500);
		c2.pay(10000);
		c3.pay(10000);

		c1.show();
		c2.show();
		c3.show();


	}

}
