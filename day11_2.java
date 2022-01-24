
abstract class Car{
	int speed;
	int maxSpeed;
	Car(int maxSpeed){
		this.maxSpeed=speed;
	}
	void speedUp(int speed) {
		this.speed+=speed;
		System.out.println("현재속도: "+this.speed);
		if(this.speed>maxSpeed) {
			System.out.println("속력을 낮춥니다.");
			speedDown(maxSpeed-=this.speed);
		}
	}
	void speedDown(int speed) {
		this.speed-=speed;
		System.out.println("현재속도: "+this.speed);
	}
	abstract void show(); //오버라이딩(재정의)을 강제
}
class Bus extends Car{
	Bus(int maxSpeed){
		super(maxSpeed);
	}
	void show() {
		System.out.println("현재 탑승인원은 ");
	}
}
class Taxi extends Car{
	Taxi(int maxSpeed){
		super(maxSpeed);
	}
	void show() {
		System.out.println("현재 요금은 ");
	}
}
class Bike extends Car{
	Bike(){
		super(60);
	}
	
	void show() {
		System.out.println("목표주소는 ");
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
