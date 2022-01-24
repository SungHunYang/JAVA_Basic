
class TV implements useTV{
	boolean power;
	int sound;
	TV(){
		this.power=false;
		this.sound=50;
	}
	public void powerOnOff() {
		if(this.power) {
			this.power=false;
		}
		else {
			this.power=true;
		}
		
	}
	public void soundUp() {
		if(this.power==false) {
			System.out.println("전원off");
			return;
		}
		if(this.sound==maxsound) {
			System.out.println("최대음량");
			return;
		}
		this.sound++;
		
	}
	public void soundDown() {
		if(this.power==false) {
			System.out.println("전원off");
			return;
		}
		if(this.sound==minsound) {
			System.out.println("최소음량");
			return;
		}
		this.sound--;
		
	}
	public void show() {
		System.out.println("현재 전원: "+this.power);
		System.out.println("현재 음량: "+this.sound);
		
	}
}

interface useTV{ 
	//어떤 클래스의 기능을 정의하는데 목적을 둠
	//어떤 클래스를 어떻게 이용하는지에 대한 명세를 작성
	//예를 들면 TV-리모컨, 컴퓨터-마우스 라던가 클래스-인터페이스 이런느낌
	int minsound=0;
    int maxsound=100;
	void powerOnOff();
	void soundUp();
	void soundDown();
	void show();
	
}
public class day11_4 {

	public static void main(String[] args) {
		
		TV tv=new TV();
		tv.powerOnOff();
		tv.soundUp();
		tv.show();

	}

}
