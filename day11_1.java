
//추상 클래스
// 클래스를 정의하는 틀 --> 상속의 반대라고 생각하면 된다 --> 자식의 공통특징을 부모로 만듦
// 붕어빵틀을 정의하는 틀 --> 붕어빵을 구울수가 xx == 객체생성불가능!
// 추상메서드를 가지고있는 클래스 앞에서도 abstract를 붙어야된다.
// 오버라이딩을 강제하는 역할이 매우 크다.
abstract class Shape{
	int point;
	int line;
	abstract void draw(); 
	// 해당추상클래스를 상속받는 클래스에서 추상메서드를 반드시 오버라이딩(재정의)하게끔 [강제]함
	// 추상메서드 --> 아무도 수행하지 않기때문에 안에 내용을 작성하지 않는다
	 // Shape을 자식클래스에서
     //draw()메서드에대해 [100%오버라이딩] 한다는 규칙이있다면,
	// 누가 "그리기"를 수행할까?--> 본인말고는 안됨 -->근데 본인은 객체를 안만듬
	// System.out.println("그리기"); --> 따라서 이게 필요없음
}

class Circle extends Shape{
	/*int point;
	int line;
	void draw() {   -> 이건 먼저 적고 추상클래스 만들고나면 필요없어짐
		System.out.println("원그리기");
	}*/
	void draw() {
		System.out.println("원 그리기");
	}
}
class Rect extends Shape{
	void draw() {
		System.out.println("네모 그리기");}
}
class Tri extends Shape{
	void draw() {
		System.out.println("세모 그리기");}
}

public class day11_1 {

	public static void main(String[] args) {
		
		Circle c=new Circle();
		//Shape s=new Shape();--> 이거 불가능 
		// 클래스를 정의한거기 때문에 객체만드는데 관심 x  abstract
		c.draw();

	}

}
