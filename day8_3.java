// �ڵ��� Ŭ����
// ����ӵ�. speedUP(). speedDown()
// show() : ���� �ӵ��� -�Դϴ�
// ���� Ŭ����
// �ڵ��� Ŭ���� + ���� �ο���. move() �ο� up down
//show() : ���� �ӵ��� -�Դϴ�, ���� �ο��� -���Դϴ�

class Car{
	int speed;
	Car(){
		
	}
	Car(int speed){
		this.speed=speed;
	}
	void speedUp(int speed) {
		this.speed+=speed;	
	}
	void speedDown(int speed) {
		this.speed+=speed;
	}
	void show(){
		System.out.println("���� �ӵ���"+this.speed+"�Դϴ�.");
	}
}
class Bus extends Car{
	int cnt;
	Bus(){
		// �θ� Ŭ������ �⺻�����ڸ� ȣ��
		//1) �θ�Ŭ������ �⺻�����ڸ� �ۼ��Ѵ�
		//2) �θ�Ŭ������ �ٸ������ڸ� �̿��Ѵ�.
/*�� �ߵ��! �ڽĸ� �����ؼ� ���� ����ٰ� ���� ������ �ڽİ� �θ� ����Ǿ��ֱ⶧���� �ڽ��� ������ �θ� ��� ��
		���� �θ� �����ϱ� ���� �θ��� ������ڵ��� �����ͼ� �θ� �����ϴ°Ŵ�! ����?
		*/
		super(0); // �θ�Ŭ������ �ǹ���
		// super.speed =10; �̷��͵� ����
	}
	Bus(int speed, int cnt){
		this.speed=speed;
		this.cnt=cnt;
	}
	void move(int cnt){
		this.cnt+=cnt;
	}
	void show() {
		// �������̵� 
		System.out.println("����ӵ���"+this.speed+", �����ο���"+this.cnt+"�� �Դϴ�.");
	}
}



public class day8_3 {

	public static void main(String[] args) {
	

		Car c1=new Car(10);
		Bus c2=new Bus(50, 20);
		
		c1.speedUp(50);
		c1.show();
		c2.speedUp(50);
		c2.show();
		
		
		
		
	}

}
