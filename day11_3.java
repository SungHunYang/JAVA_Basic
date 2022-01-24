
//[인터페이스]
// 내생각에는 인터페이스는 부족한 역할을 추가해주는 역할을 한다.
// 만일 TV가 부모클래스이고 핸드폰TV,테블릿TV가 자식 클래스 이면 
// TV관련 기능을 부모에게 모두 받고, 인터페이스 Phone으로 부족한 기능을 핸드폰TV,테블릿TV가 더 받는다.

interface A{
	int a=100;
	public static final int b=0; 
	// 인터페이스에서 한 변수는 모두 "public static final"이 [자동]으로 붙어있다.
	// public -> 누구나 접근가능
	// static -> 객체와 무관하게
	// final -> 상수화 , 초기화를 반드시 해야함!
	// 디폴트로 설정됨
	void f1();
	// 인터페이스 내의 메서드는, "public abstract" [자동]으로 붙음
	// public
	// abstract -> 정의 불가능. 오버라이딩(재정의) 강제
	public abstract void f2();  // 추상 메서드
}
class B implements A{
	
	public void f1() { // 항상 "부모의 공개범위 <= 자식의 공개범위"
		
	}
    public void f2() {
		
	}
	
}

public class day11_3 {

	public static void main(String[] args) {
		

	}

}
