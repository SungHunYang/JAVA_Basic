
class Human{
	void eat(Menu m) {
		System.out.println("¹¹ ¸ÔÁö?");
		m.show();
	}
}
class Menu{
	void show() {
		System.out.println("¸Þ´º ¼±ÅÃ");
	}
}
class M1 extends Menu{
	void show() {
		System.out.println("ºñºö¹ä");
	}
}
class M2 extends Menu{
	void show() {
		System.out.println("ÆÏºù¼ö");
	}
}
class M3 extends Menu{
	void show() {
		System.out.println("ÆÄ½ºÅ¸");
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
