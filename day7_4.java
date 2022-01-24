
class Point1 {
	String color;
	int x;
	int y;
	Point1(){
		this("검정",0,0); 
// 자기자신.본인 == 생성자 //이뜻이 'this'->내 클래스에서 '('-->생성자를 찾는다 따라서 18번 라인을 찾아서 이용
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	Point1(int x, int y){
		this("검정",x,y); 
		System.out.println(this.color+"("+this.x+","+this.y+")");
		
	}
	Point1(String color){
		this(color,0,0);  //--> 이런건 전부 가장긴것을 재활용 하는것이다.
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	Point1(String color,int x, int y ){ // 선택한다 -> 이걸 재활용
 		this.x=x;
		this.y=y;
		this.color=color;
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	void move() {
		this.x++;
		this.y++;
		System.out.println(this.color+"("+this.x+","+this.y+")");
		//  this.show(); --> 멤버함수는 이렇게 출력하는 방법도 있다. 하나 만들고 계속 함수에서 쓰려면
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
public class day7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
