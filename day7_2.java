
class Car{
	String name;
	int speed;
	int maxSpeed;

	void show(){
		System.out.println(this.name+"님의 자동차 현재속도는"+this.speed+"제한속도는"+this.maxSpeed+"입니다");	
	}
	void speedUp() {
		this.speed+=20;
		if(this.speed>this.maxSpeed) {
			System.out.println("경고!!");
			this.speed=this.maxSpeed;
		}
			}
	void speedUp(int speed) {
		this.speed+=speed;
		if(this.speed>this.maxSpeed) {
			System.out.println("경고!!");
			this.speed=this.maxSpeed;}
	}
	
	void speedDown() {
		this.speed-=20;
		if(this.speed<=0) {
			System.out.println("정지상태입니다.");
			this.speed=0;
		}
	}
	void speedDown(int speed) {
		this.speed-=speed;
		if(this.speed<=0) {
			System.out.println("정지상태입니다.");
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

		Car c1=new Car("아무무");
		Car c2=new Car("티모",110);

		c1.speedUp();
		c1.speedUp();
		c1.show();

		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp(50);
		c2.speedDown();
		c2.show();


		Car c3=new Car("피즈",50);
		c3.show();
		c3.speedUp();
		c3.speedUp(50);
		c3.show();
		c3.speedDown(10);
		c3.speedDown();
		c3.speedDown();
		c3.show();
		

	}
	//예제1) c1.speedDown(); // -20 될수 있도록 단, 0이하가 되면 정지상태입니다 출력  -> 여기다가 할게요
	         // c2.speedUp(50); 하면 +50될수있도록

}
