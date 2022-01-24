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
			System.out.println("시크릿모드");
			return true;
		}
		else{
			System.out.println("시크릿모드 아님!");
			return false;
		}
	}
	public void show() {
		if(this.isMode()) {
			System.out.println("비밀번호 확인: ");
			int pw=sc.nextInt();
			if(this.pw==pw) {
				System.out.println("승인");
				System.out.println("사용자 이름: "+this.name);
				return;
			}
			else {
				System.out.println("승인불가");
			}
			
		}
		else {
			System.out.println("사용가능");
			return;
		}
	}
	public void changePW() {
		System.out.println("비밀번호 변경하세요: ");
		int pw=sc.nextInt();
		this.pw=pw;
		System.out.println("변경 성공");
	}

	
}


interface usePhone2{
	boolean isMode();
	void show();
	void changePW();
}

class iphone extends Phone2{ // abstract를 사용했을때 

	iphone(String name, int pw) {
		super(name, pw);
	}
	public void show() {
		System.out.println("아이폰 입니다.");
	}
	
}



public class day11_5 {

	public static void main(String[] args) {
		
		Phone2 p1=new Phone2("피즈",1234,true);
		Phone2 p2=new Phone2("아칼리",9876);
		p1.isMode();
		p1.show();
		p1.changePW();
		

	}

}
