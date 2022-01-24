import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


abstract class Character implements Fnc{
	String name;
	int hp;
	int maxHp;
	private int life;
	public String toString() {
		for(int i=0; i<this.life; i++) {
			System.out.println("♥");
		}
		return" "+this.name;
	}

	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	Character(){
		this.maxHp=100;
		this.hp=this.maxHp;
		this.life=1;
	}
	@Override
	public boolean lifecheck() {
		if(this.life<=0) {
			System.out.println("생명 0 게임 불가능");
			return false;
		}
		else {
			return true;
		}

	}
	@Override
	public void game() {
		int a;
		if(!this.lifecheck()) {
			System.out.println("===game over===");
			return;
		}
		System.out.println("1. 공격  2. 회복");
		a=new Scanner(System.in).nextInt();
		if(a==1) {
			this.attack();
		}
		else if(a==2) {
			System.out.println("생명력 입력: ");
			int hp=new Scanner(System.in).nextInt();
			this.heal(hp);
		}

	}

	public void attack(){
		if(this.action()) {
			Random rand=new Random();
			int a=rand.nextInt(30)+20;
			System.out.println("데미지:"+a+", 공격 성공!");
			return;
		}
		System.out.println("공격 실패!");
		this.hp-=50;
		if(this.hp<=0) {
			this.life--;
			System.out.println("생명력: "+this.life);
			this.hp=this.maxHp;
			if(this.life==0) {
				System.out.println("GAME OVER");
			}
		}
	}

	public void heal(int hp) {
		this.hp+=hp;
		if(this.hp>this.maxHp) {
			this.hp=this.maxHp;
			System.out.println("더이상 피를 채울수 없습니다.");
		}
		System.out.println("회복 완료");
	}
	abstract public boolean action();

}
class War extends Character {
	War() {
		this.name="전사";
	}
	public boolean action(){
		Random rand=new Random();
		int a=rand.nextInt(2);
		if(a==0) {
			return true;
		}
		return false;
	}

}
class Maige extends Character {
	Maige(){
		this.name="법사";
		this.setLife(2);
	}
	public boolean action() {
		Random rand=new Random();
		int a=rand.nextInt(3);
		if(a==0) {
			return true;
		}
		return false;
	}
}
interface Fnc{
	boolean lifecheck();
	void game();
	void attack();
	void heal(int hp);
	boolean action();
}

public class day14_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> al=new ArrayList();
		al.add(new War());
		al.add(new Maige());

		while(true) {
			System.out.println("1. 캐릭터선택 2.캐릭터목록 3.게임종료");
			System.out.println("입력: ");
			int act=sc.nextInt();
			if(act==1) {
				System.out.println("==목록==");
				for(int i=0; i<al.size(); i++) {
					System.out.println((i+1)+". ");
					System.out.println(al.get(i).name);
				}
				System.out.println("번호입력: ");
				int num=sc.nextInt();
				al.get(num-1).game();
			}
			else if(act==2) {
				for(int i=0; i<al.size(); i++) {
					if(al.get(i).getLife()==0) {
						al.remove(i);
						i--;
						// remove 되면서 al.size가 줄어버린다
						// for문 수행횟수에 유의!
					}
				}
				System.out.println("==목록==");
				for(int i=0; i<al.size(); i++) {
					System.out.println((i+1)+". ");
					System.out.println(al.get(i).name);
				}
				System.out.println("번호입력: ");
				int num=sc.nextInt();
				al.get(num-1).game();

			}
			else {
				break;
			}

		}

	}

}
