
//�߻� Ŭ����
// Ŭ������ �����ϴ� Ʋ --> ����� �ݴ��� �����ϸ� �ȴ� --> �ڽ��� ����Ư¡�� �θ�� ����
// �ؾƲ�� �����ϴ� Ʋ --> �ؾ�� ������� xx == ��ü�����Ұ���!
// �߻�޼��带 �������ִ� Ŭ���� �տ����� abstract�� �پ�ߵȴ�.
// �������̵��� �����ϴ� ������ �ſ� ũ��.
abstract class Shape{
	int point;
	int line;
	abstract void draw(); 
	// �ش��߻�Ŭ������ ��ӹ޴� Ŭ�������� �߻�޼��带 �ݵ�� �������̵�(������)�ϰԲ� [����]��
	// �߻�޼��� --> �ƹ��� �������� �ʱ⶧���� �ȿ� ������ �ۼ����� �ʴ´�
	 // Shape�� �ڽ�Ŭ��������
     //draw()�޼��忡���� [100%�������̵�] �Ѵٴ� ��Ģ���ִٸ�,
	// ���� "�׸���"�� �����ұ�?--> ���θ���� �ȵ� -->�ٵ� ������ ��ü�� �ȸ���
	// System.out.println("�׸���"); --> ���� �̰� �ʿ����
}

class Circle extends Shape{
	/*int point;
	int line;
	void draw() {   -> �̰� ���� ���� �߻�Ŭ���� ������� �ʿ������
		System.out.println("���׸���");
	}*/
	void draw() {
		System.out.println("�� �׸���");
	}
}
class Rect extends Shape{
	void draw() {
		System.out.println("�׸� �׸���");}
}
class Tri extends Shape{
	void draw() {
		System.out.println("���� �׸���");}
}

public class day11_1 {

	public static void main(String[] args) {
		
		Circle c=new Circle();
		//Shape s=new Shape();--> �̰� �Ұ��� 
		// Ŭ������ �����Ѱű� ������ ��ü����µ� ���� x  abstract
		c.draw();

	}

}
