
class Point1 {
	String color;
	int x;
	int y;
	Point1(){
		this("����",0,0); 
// �ڱ��ڽ�.���� == ������ //�̶��� 'this'->�� Ŭ�������� '('-->�����ڸ� ã�´� ���� 18�� ������ ã�Ƽ� �̿�
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	Point1(int x, int y){
		this("����",x,y); 
		System.out.println(this.color+"("+this.x+","+this.y+")");
		
	}
	Point1(String color){
		this(color,0,0);  //--> �̷��� ���� �������� ��Ȱ�� �ϴ°��̴�.
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	Point1(String color,int x, int y ){ // �����Ѵ� -> �̰� ��Ȱ��
 		this.x=x;
		this.y=y;
		this.color=color;
		System.out.println(this.color+"("+this.x+","+this.y+")");
	}
	void move() {
		this.x++;
		this.y++;
		System.out.println(this.color+"("+this.x+","+this.y+")");
		//  this.show(); --> ����Լ��� �̷��� ����ϴ� ����� �ִ�. �ϳ� ����� ��� �Լ����� ������
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
