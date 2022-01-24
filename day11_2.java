
abstract class Car{
	int speed;
	int maxSpeed;
	Car(int maxSpeed){
		this.maxSpeed=speed;
	}
	void speedUp(int speed) {
		this.speed+=speed;
		System.out.println("����ӵ�: "+this.speed);
		if(this.speed>maxSpeed) {
			System.out.println("�ӷ��� ����ϴ�.");
			speedDown(maxSpeed-=this.speed);
		}
	}
	void speedDown(int speed) {
		this.speed-=speed;
		System.out.println("����ӵ�: "+this.speed);
	}
	abstract void show(); //�������̵�(������)�� ����
}
class Bus extends Car{
	Bus(int maxSpeed){
		super(maxSpeed);
	}
	void show() {
		System.out.println("���� ž���ο��� ");
	}
}
class Taxi extends Car{
	Taxi(int maxSpeed){
		super(maxSpeed);
	}
	void show() {
		System.out.println("���� ����� ");
	}
}
class Bike extends Car{
	Bike(){
		super(60);
	}
	
	void show() {
		System.out.println("��ǥ�ּҴ� ");
	}
}

public class day11_2 {

	public static void main(String[] args) {
		
		Bus c1=new Bus(120);
		Taxi c2=new Taxi(100);
		Bike c3=new Bike();
		
		c1.speedUp(10);
		c2.speedUp(10);
		c3.speedUp(10);
		
		c1.show();
		c2.show();
		c3.show();

	}

}
