
class Person{
	String name;
	void hi() {
		System.out.println("안녕하세요");
	}
}
class Student extends Person{
	int score;
	void hi() {
		System.out.println("hi hi");
	}
}

public class day10_3 {

	public static void main(String[] args) {
		
		Person p1=new Person();
		Student s1=new Student();
		Person stu=new Student(); // 업 캐스팅 //Person 붕어빵틀을 보고 만들어낸 Student 붕어빵
		stu.hi(); // 동적바인딩  person것을 가지고 student것을 사용
		//Student c=(Student)new Person();--> 다운캐스팅--> 피치못할상황에 유지보수 용도로
		
		

	}

}
