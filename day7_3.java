
/*
 Á¡ °´Ã¼µéÀ» °®´Â´Ù.
 Á¡ Å¬·¡½ºpoint <<
 String color;
 int x;
 int y;
 
  Á¡(10,20) -> °ËÁ¤(10,20)
  Á¡(»¡°­)-> »¡°­(0,0)
  Á¡(ºÐÈ«,1,2) -> ºÐÈ«(1,2)
  Á¡()-> °ËÁ¤(0,0)
  p1.move() -> °ËÁ¤(10,20)-> °ËÁ¤(11,21)
  p2.move(100)-> »¡°­(100,100)
  p3.move(11,22)-> ºÐÈ«(1,2) ->ºÐÈ«(12,24)
 */
class Point {
	String color;
	int x;
	int y;
	Point(){
		this.color="°ËÁ¤";
		this.x=0;
		this.y=0;
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	Point(int x, int y){
		this.color="°ËÁ¤";
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
		Point p2=new Point("»¡°­");
		Point p3=new Point("ºÐÈ«",1,2);
		Point p4=new Point();
		
		p1.move();
		p2.move(100);
		p3.move(11,22);

	}

}
