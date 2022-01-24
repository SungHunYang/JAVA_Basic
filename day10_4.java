
class Per{
	void play(Animal animal) { // 객체를 인자로 받은거다. Animal클라스의 객체
		System.out.println("동물과 노는중...");
		animal.speak();
	}
}


class Animal{
	void speak() {
		System.out.println("울음소리");
	}
}
class Dog extends Animal{
	void speak() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	void speak() {
		System.out.println("야옹");
	}
}
public class day10_4 {

	public static void main(String[] args) {
		
		Per p=new Per();

		Animal a1=new Dog();
		Animal a2=new Cat(); //per 이 동물이랑 노니까

		p.play(a1);
		System.out.println();
		p.play(a2);
		// 사람이 밥을 먹는데 menu 하면 비빔밥 팥빙수 파스타 를 출력하게
		// menu 클래스는 show() 메뉴 이름을 출력함
	}

}
