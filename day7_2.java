
class Car{
	String name;
	int speed;
	int maxSpeed;

	void show(){
		System.out.println(this.name+"���� �ڵ��� ����ӵ���"+this.speed+"���Ѽӵ���"+this.maxSpeed+"�Դϴ�");	
	}
	void speedUp() {
		this.speed+=20;
		if(this.speed>this.maxSpeed) {
			System.out.println("���!!");
			this.speed=this.maxSpeed;
		}
			}
	void speedUp(int speed) {
		this.speed+=speed;
		if(this.speed>this.maxSpeed) {
			System.out.println("���!!");
			this.speed=this.maxSpeed;}
	}
	
	void speedDown() {
		this.speed-=20;
		if(this.speed<=0) {
			System.out.println("���������Դϴ�.");
			this.speed=0;
		}
	}
	void speedDown(int speed) {
		this.speed-=speed;
		if(this.speed<=0) {
			System.out.println("���������Դϴ�.");
			this.speed=0;
		}
	}
	Car(String name){
		this.name=name;
		this.speed=0;
		this.maxSpeed=60;
	}

	Car(String name, int maxSpeed){
		this.name=name;
		this.speed=0;
		this.maxSpeed=maxSpeed;
	}
}



public class day7_2 {

	public static void main(String[] args) {

		Car c1=new Car("�ƹ���");
		Car c2=new Car("Ƽ��",110);

		c1.speedUp();
		c1.speedUp();
		c1.show();

		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp(50);
		c2.speedDown();
		c2.show();


		Car c3=new Car("����",50);
		c3.show();
		c3.speedUp();
		c3.speedUp(50);
		c3.show();
		c3.speedDown(10);
		c3.speedDown();
		c3.speedDown();
		c3.show();
		

	}
	//����1) c1.speedDown(); // -20 �ɼ� �ֵ��� ��, 0���ϰ� �Ǹ� ���������Դϴ� ���  -> ����ٰ� �ҰԿ�
	         // c2.speedUp(50); �ϸ� +50�ɼ��ֵ���

}
