import java.util.Scanner;

class Phone{
	String name; // 멤버변수, 속성, 필드
	String num;// 객체마다 각자의 값을 가짐, 서로 값을 공유xx
	// 보통은 int 3개 묶어서 번호
	boolean check;
	int pw;
	void show() { // 멤버함수, 메서드, 메소드
		if(this.check) {
			Scanner sc=new Scanner(System.in);
			System.out.println(this.name+"님, 비밀번호 입력 : ");
			int pw=sc.nextInt();
			if(pw!=this.pw) {
				System.out.println("비밀번호 불일치!");
				return;
			}
		}
		System.out.println(this.name+"님의 번호는 "+this.num+"입니다.");
	}
	
	Phone(String name, String num){// 오버로딩
		this(name, num, false, 1111); // 생성자는 항상 맨첫줄에 작성
		// -> 확인2 불러서 객체만들고, 밑에 확인1 부름.
		System.out.println("확인1");
	}
	Phone(String name, String num, boolean check, int pw){
		this.name=name;
		this.num=num;
		this.check=check;
		this.pw=pw;
		System.out.println("확인2");
	}
	
	
}

public class day9_1 {

	public static void main(String[] args) {
		
		Phone p1=new Phone("Samsung","010-2021-3083");
		System.out.println();
		Phone p2=new Phone("I phone","010-2021-3083",true,3083);
		p1.show();
		p2.show();
		p2.show();
	}

}
