
/*
 �� ��ü���� ���´�.
 �� Ŭ����point <<
 String color;
 int x;
 int y;
 
  ��(10,20) -> ����(10,20)
  ��(����)-> ����(0,0)
  ��(��ȫ,1,2) -> ��ȫ(1,2)
  ��()-> ����(0,0)
  p1.move() -> ����(10,20)-> ����(11,21)
  p2.move(100)-> ����(100,100)
  p3.move(11,22)-> ��ȫ(1,2) ->��ȫ(12,24)
 */
class Point {
	String color;
	int x;
	int y;
	Point(){
		this.color="����";
		this.x=0;
		this.y=0;
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	Point(int x, int y){
		this.color="����";
		this.x=x;
		this.y=y;
		System.out.println(this.color+"("+this.x+","+this.y+")");
		
	}
	Point(String color){
		this.color=color;
		this.x=0;
		this.y=0;
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	Point(String color,int x, int y ){
		this.x=x;
		this.y=y;
		this.color=color;
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	void move() {
		this.x++;
		this.y++;
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	void move(int x) {
		this.x=x;
		this.y=x;
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	void move(int x, int y) {
		this.x=x*12;
		this.y=y*12;
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
}



public class day7_3 {

	public static void main(String[] args) {
		
		Point p1=new Point(10,20);
		Point p2=new Point("����");
		Point p3=new Point("��ȫ",1,2);
		Point p4=new Point();
		
		p1.move();
		p2.move(100);
		p3.move(11,22);

	}

}
