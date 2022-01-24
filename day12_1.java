
class Point{
	String color;
	int x;
	int y;
	Point(){
		this("black",0,0);
	}
	Point(String color){
		this(color,0,0);
	}
	Point(int x, int y){
		this("black", x, y);
	}
	Point(String color, int x, int y){
		this.color=color;
		this.x=x;
		this.y=y;	
	}
	void move(int x){
		this.x+=x;
		this.y+=x;
		System.out.println(this.color+" ("+this.x+","+this.y+")");
	}
	void move(int x, int y){
		this.x+=x;
		this.y+=y;
		System.out.println(this.color+" ("+this.x+","+this.y+")");
	}
	public String toString(){
		return this.color+" ("+this.x+","+this.y+")";
	}
	// syso(p1) 을 하면 p1의 코드값이 나온다
	// 이것은 p1이 상위클래스인 toString을 부른거다
	// 따라서 우리가 toString을 재정의 해서 원하는 값을 보이게 하는거다.
	public boolean equals(Point p) {
		if(p.x==this.x && p.y==this.y) {
			return true;
		}
		return false;
	}
}


public class day12_1 {

	public static void main(String[] args) {
		
		Point p=new Point();
		Point p1=new Point();
		Point p2=new Point(10,20);
		
		Object o=new Object();
		// Object 클래스 --> 상속, 부모클래스가됨
		// 기본적으로 제공되는
		// 내가 정의한 클래스들은 Object클래스를 상속받는다.
		// 최상위클래스
		
		// toString()
		// : 객체를 문자열화
		// : @코드값이 나오도록하자. --> 이렇게 처음 설정되어있음
		// : println()등에서 자동호출
		
		// o1.equals(o2)
		// : o1객체와 o2객체가 같은지 확인하는 메서드
		// : T/F 값을 리턴
		// : o1과 o2가 정확히 같은 객체여야 T리턴
		p1.move(10,20);
		
		if(p1.equals(p2)) {
			System.out.println("두 점은 같다.");
		}
		else {
			System.out.println("두 점은 같다.");
		}
		System.out.println(p1);
		System.out.println(p2);

		

		
		
		
		
		

	}

}
