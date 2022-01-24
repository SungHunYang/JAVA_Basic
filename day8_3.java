// 자동차 클래스
// 현재속도. speedUP(). speedDown()
// show() : 현재 속도는 -입니다
// 버스 클래스
// 자동차 클래스 + 현재 인원수. move() 인원 up down
//show() : 현재 속도는 -입니다, 현재 인원은 -명입니다

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
		System.out.println("현재 속도는"+this.speed+"입니다.");
	}
}
class Bus extends Car{
	int cnt;
	Bus(){
		// 부모 클래스의 기본생성자를 호출
		//1) 부모클래스에 기본생성자를 작성한다
		//2) 부모클래스의 다른생성자를 이용한다.
/*자 잘들어! 자식만 선언해서 내가 만든다고 가정 했을때 자식과 부모가 연결되어있기때문에 자식을 쓰려면 부모도 써야 돼
		따라서 부모를 선언하기 위해 부모의 어떤생성자든지 가져와서 부모를 선언하는거다! ㅇㅋ?
		*/
		super(0); // 부모클래스를 의미함
		// super.speed =10; 이런것도 가능
	}
	Bus(int speed, int cnt){
		this.speed=speed;
		this.cnt=cnt;
	}
	void move(int cnt){
		this.cnt+=cnt;
	}
	void show() {
		// 오버라이딩 
		System.out.println("현재속도는"+this.speed+", 현재인원은"+this.cnt+"명 입니다.");
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
