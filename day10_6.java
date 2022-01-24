import java.util.Random;
import java.util.Scanner;

class Trainer{
	Trainer(String name){
		this.name=name;
	}
	String name;
	void levelUp(Pocket p) {
		System.out.println();
		System.out.println("트레이너: "+this.name);
		p.game();
	}
	void play(Pocket p) {
		System.out.println();
		p.speak();
	}
}

abstract class Pocket{
	String name;
	int level;
	int exp;
	Pocket(){
		this.name="포켓몬";
		this.level=5;
		this.exp=0;
	}
	
	void game() {
		Random rand=new Random();
		int exp=(rand.nextInt(10)+1)*10;
		this.exp+=exp;
		System.out.println(this.name+", ["+exp+"] 획득");
		if(this.exp>=100) {
			this.level++;
			this.exp-=100;
			System.out.println("레벨업");
		}
		System.out.println(this.name+"의 레벨: "+this.level+" 경험치 :"+this.exp );
		return;
	}
	abstract void speak(); //추상 메서드
	void show() {
		System.out.println(this.name+" Lv."+this.level);
	}
}
class Pica extends Pocket{
	Pica(){
		this.name="피카츄";
	}
	void speak() {
		System.out.println("피카피카");
		this.show();
	}
}
class Pi extends Pocket{
	Pi(){
		this.name="파이리";
	}
	void speak() {
		System.out.println("파이");
		this.show();
	}
}
class Bugi extends Pocket{
	Bugi(){
		this.name="꼬북이";
	}
	void speak() {
		System.out.println("꼬북칩");
		this.show();
	}
}


public class day10_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Trainer t=new Trainer("피즈");
		Pocket p1=new Pica();
		Pocket p2=new Pi();
		
		while(true) {
			System.out.println("1.게임 2.산책 3.종료");
			System.out.println("입력: ");
			int act=sc.nextInt();
			if(act==1) {
				t.levelUp(p1);
				t.levelUp(p2);
			}
			else if(act==2) {
				t.play(p1);
				t.play(p2);
			}
			else {
				break;
			}
		}
		
		

	}

}
