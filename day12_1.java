
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
	// syso(p1) �� �ϸ� p1�� �ڵ尪�� ���´�
	// �̰��� p1�� ����Ŭ������ toString�� �θ��Ŵ�
	// ���� �츮�� toString�� ������ �ؼ� ���ϴ� ���� ���̰� �ϴ°Ŵ�.
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
		// Object Ŭ���� --> ���, �θ�Ŭ��������
		// �⺻������ �����Ǵ�
		// ���� ������ Ŭ�������� ObjectŬ������ ��ӹ޴´�.
		// �ֻ���Ŭ����
		
		// toString()
		// : ��ü�� ���ڿ�ȭ
		// : @�ڵ尪�� ������������. --> �̷��� ó�� �����Ǿ�����
		// : println()��� �ڵ�ȣ��
		
		// o1.equals(o2)
		// : o1��ü�� o2��ü�� ������ Ȯ���ϴ� �޼���
		// : T/F ���� ����
		// : o1�� o2�� ��Ȯ�� ���� ��ü���� T����
		p1.move(10,20);
		
		if(p1.equals(p2)) {
			System.out.println("�� ���� ����.");
		}
		else {
			System.out.println("�� ���� ����.");
		}
		System.out.println(p1);
		System.out.println(p2);

		

		
		
		
		
		

	}

}
