

class Dog{
	String name; // 공유 x --> 인스턴스 변수
	static String[] act=new String[3]; // 공유o --> 클래스 변수
	static int index; //공유 o
	void play(String act) {
		this.act[this.index++]=act; // 후 증감 연산자이기 때문에 대입연산자 한뒤 증감  따라서 같이 써도 무관
	
	}
	void show() {
		System.out.print(this.name+"가 배운 것은");
		for(int i=0; i<this.index;i++) {
			System.out.print(this.act[i]+" ");
		}
		System.out.println("입니다");
	}
	Dog(String name){
		this.name=name;
	}

	
}


public class day9_3 {

	public static void main(String[] args) {
		

		Dog d1=new Dog("나르");
		Dog d2=new Dog("렝가");
		
		d1.play("앉아!");
		d1.show();
		d2.show();
		
		d2.play("사냥을 시작");
		d1.show();
		d2.show();
	}

}
