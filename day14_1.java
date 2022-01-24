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
			System.out.println("��");
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
			System.out.println("���� 0 ���� �Ұ���");
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
		System.out.println("1. ����  2. ȸ��");
		a=new Scanner(System.in).nextInt();
		if(a==1) {
			this.attack();
		}
		else if(a==2) {
			System.out.println("����� �Է�: ");
			int hp=new Scanner(System.in).nextInt();
			this.heal(hp);
		}

	}

	public void attack(){
		if(this.action()) {
			Random rand=new Random();
			int a=rand.nextInt(30)+20;
			System.out.println("������:"+a+", ���� ����!");
			return;
		}
		System.out.println("���� ����!");
		this.hp-=50;
		if(this.hp<=0) {
			this.life--;
			System.out.println("�����: "+this.life);
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
			System.out.println("���̻� �Ǹ� ä��� �����ϴ�.");
		}
		System.out.println("ȸ�� �Ϸ�");
	}
	abstract public boolean action();

}
class War extends Character {
	War() {
		this.name="����";
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
		this.name="����";
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
			System.out.println("1. ĳ���ͼ��� 2.ĳ���͸�� 3.��������");
			System.out.println("�Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				System.out.println("==���==");
				for(int i=0; i<al.size(); i++) {
					System.out.println((i+1)+". ");
					System.out.println(al.get(i).name);
				}
				System.out.println("��ȣ�Է�: ");
				int num=sc.nextInt();
				al.get(num-1).game();
			}
			else if(act==2) {
				for(int i=0; i<al.size(); i++) {
					if(al.get(i).getLife()==0) {
						al.remove(i);
						i--;
						// remove �Ǹ鼭 al.size�� �پ������
						// for�� ����Ƚ���� ����!
					}
				}
				System.out.println("==���==");
				for(int i=0; i<al.size(); i++) {
					System.out.println((i+1)+". ");
					System.out.println(al.get(i).name);
				}
				System.out.println("��ȣ�Է�: ");
				int num=sc.nextInt();
				al.get(num-1).game();

			}
			else {
				break;
			}

		}

	}

}
