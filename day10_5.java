
class Human{
	void eat(Menu m) {
		System.out.println("�� ����?");
		m.show();
	}
}
class Menu{
	void show() {
		System.out.println("�޴� ����");
	}
}
class M1 extends Menu{
	void show() {
		System.out.println("�����");
	}
}
class M2 extends Menu{
	void show() {
		System.out.println("�Ϻ���");
	}
}
class M3 extends Menu{
	void show() {
		System.out.println("�Ľ�Ÿ");
	}
}

public class day10_5 {

	public static void main(String[] args) {
		
		Human a=new Human();
		Menu p=new M1();
		Menu q=new M2();
		Menu r=new M3();
		
		a.eat(p);
		a.eat(q);
		a.eat(r);
		

	}

}
