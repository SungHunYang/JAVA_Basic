
/* 카드
/class Card{
	String user; // 사용자 이름
	String name; // 회사이름
	int bal; //잔액
	int pw; // 비밀번호
	void pay(int money) {
		this.bal-=money;
		//1. 만약에 money 1만원 이상의 금액이면 비밀번호 확인을 진행
		//2. 2번 이상 틀리면 결제할수없습니다.
		//3. 잔액이 부족하면 결제 할수없습니다.
		}
	void show() {
		//ㅁㅁ님의 oo카드의 잔액은 __ 원 입니다 -->출력
	}
}
*/


public class day7_5 {

	public static void main(String[] args) {
		
		// 1)사용자 이름, 카드사 << 무조건 지정해야함
		// 잔액은 0원, 비밀번호는 1234로 지정
		
		// 2)사용자이름, 카드사, 비밀번호 
		// 3)사용자이름, 카드사, 비밀번호, 잔액
		
		// 사용자이름,카드사, 잔액 xxxx

		
		// card c1=new card("아무무", "신한");
	}

}
