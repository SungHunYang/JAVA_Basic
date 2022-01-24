
class Person{
	// 얘는 하위 클래스껄 이용하지 x
	String name;
	/*Person(){
		System.out.println("부모 클래스의 생성자");
	}*/
	Person(String name){
		this.name=name;
	}
	void hi() {
		System.out.println("안녕하세요!");
	}
}

class Student extends Person {
	Student(String name) {
		super(name);
	}
	//        상속받게 해줌 -> Person(상위클래스)껄 모두 사용 가능하다
	int Score;
	/*String name;
	void hi()
	{                     -> 상속 받아서 이걸 안만들어도 됨
	System.out.println("안녕하세요!");
	}*/  
	/*Student(){
		///// 부모클래스의 기본생성자를 호출!!
		System.out.println("자식 클래스의 생성자");
	}*/
	void hi() {
		// 부모클래스와 함수의 이름이 같고,
		// 인자도 같은경우
		// -> [오버라이딩] == 재정의
		System.out.println("ㅎㅇㅎㅇㅎㅇ");
	}
	void study()
	{
		System.out.println("공부중...");
	}
}
// 오버로딩: 같은이름의 함수 선언을 허용
// 인자의 타입 or 개수가 다르다. 상속x

// 오버라이딩: 같은이름의 함수 선언을 허용
// 인자의 타입and갯수가 동일하다. 상속o
public class day8_2 {

	public static void main(String[] args) {
		
		Person p=new Person("홍길동");
		System.out.println("---------------");
		Student s=new Student("아무무");
		
		p.hi();
		s.hi();
		

	}

}
