
class Per{
	void play(Animal animal) { // ��ü�� ���ڷ� �����Ŵ�. AnimalŬ���� ��ü
		System.out.println("������ �����...");
		animal.speak();
	}
}


class Animal{
	void speak() {
		System.out.println("�����Ҹ�");
	}
}
class Dog extends Animal{
	void speak() {
		System.out.println("�۸�");
	}
}
class Cat extends Animal{
	void speak() {
		System.out.println("�߿�");
	}
}
public class day10_4 {

	public static void main(String[] args) {
		
		Per p=new Per();

		Animal a1=new Dog();
		Animal a2=new Cat(); //per �� �����̶� ��ϱ�

		p.play(a1);
		System.out.println();
		p.play(a2);
		// ����� ���� �Դµ� menu �ϸ� ����� �Ϻ��� �Ľ�Ÿ �� ����ϰ�
		// menu Ŭ������ show() �޴� �̸��� �����
	}

}
