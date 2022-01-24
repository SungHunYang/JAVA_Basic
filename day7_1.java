// JAVA: 객체지향언어
		//1) 추상화 
		//2) 캡슐화: 오류의 파급효과 줄어듦
		//3) 상속: 중복코드 최소화
		//4) 다향성
class Circle{
	// 클래스는 기본 단위이기 때문에 단독으로 존재
	String name; // 멤버 -> 객체끼리 값 공유x
	int radius;  // 멤버변수.속성.필드
	void show() { // 멤버함수. 메서드. 메소드 -> 객체지향 함수를 만들었기 때문에 static 안함
		System.out.println(name+"은 반지름이 "+radius);
	}
	Circle(){ // 클래스의 이름과 동일한 이름의 함수를 생성자라고 한다. 객체화할때 쓴다.
		System.out.println("기본생성자 호출");
		//기본생성자. 디폴트생성자 -> main함수에서 만들어줄수도 아니면 내가 만들거나
		// 다른생성자가 1개이상 정의되면 기본제공되지 않는다!
	}
	
	Circle(String name, int radius){
		        
		System.out.println("생성자 호출");
		this.name=name;
		this.radius=radius; //this: 자기자신
		
	} //[오버로딩] 생성자 오버로딩
	  //String s, int i
	  //name=s;   이렇게 해도 되나 복잡해짐
	  //radius=i;
}


public class day7_1 {

	public static void main(String[] args) {
		
		//[객체지향코딩]
		// 클래스
		//1)객체지향언어에서의 기본단위
		//2)객체화, 인스턴스화
		//클래스 코딩->->객체 ex) 자동차 클래스-> 자동차 객체*N개
		// 클래스:객체=1:N 관계 
		System.out.println("a");
		Circle c1=new Circle(); // new 가 들어가면 객체화 했다. -> 클래스에서 객체를 뽑아내겠다.
		Circle c2=new Circle("도넛",1); // 앞에있는 Circle과 뒤에있는 Circle()은 다르다. 똑같이 않다!
		                        // 클래스와 함수이다. 따라서 클래스에 있는 Circle 함수를 호출한것과 같다.
		System.out.println("b");
		c1.name="피자";
		c1.radius=10;
		
		System.out.println(c1.name+"(은)"+c1.radius);
		System.out.println(c2.name+"(은)"+c2.radius);
		c1.show();
		c2.show();
		
		
		
		
		

	}

}
