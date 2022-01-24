import java.util.Scanner;

// 접근제어자 == 접근자
//public : 다른패키지에서도 접근가능
//private : 자기자신 클래스에서만 접근 가능(정보은닉)
//protected : 상속받은 클래스에서 접근가능

// static :객체와 무관하게 존재하는 사항

class Card2{
	String user;
	private int pw;
	
	//우클릭 -> sourse -> Generate Getters and Setters
	 public int getPw() {
			return pw;   // 보여주는거 (주다)
		}
		public void setPw(int pw) {
			this.pw = pw;   // 바꾸는거 (가져오다)
		}
	
	/*void setPw(int pw) {
		this.pw=pw;
	}                         -> 이렇게도 된다. 참고해라
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
		
		Card2 c1=new Card2("아무무");
		Card2 c2=new Card2("아리",9876);
		//System.out.println(c1.pw); -> private 라 변경 출력 불가
		
		c1.setPw(5555);
		System.out.println(c1.getPw());
		

	}

}
