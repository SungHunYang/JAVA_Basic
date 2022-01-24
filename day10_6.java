import java.util.Random;
import java.util.Scanner;

class Trainer{
	Trainer(String name){
		this.name=name;
	}
	String name;
	void levelUp(Pocket p) {
		System.out.println();
		System.out.println("Ʈ���̳�: "+this.name);
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
		this.name="���ϸ�";
		this.level=5;
		this.exp=0;
	}
	
	void game() {
		Random rand=new Random();
		int exp=(rand.nextInt(10)+1)*10;
		this.exp+=exp;
		System.out.println(this.name+", ["+exp+"] ȹ��");
		if(this.exp>=100) {
			this.level++;
			this.exp-=100;
			System.out.println("������");
		}
		System.out.println(this.name+"�� ����: "+this.level+" ����ġ :"+this.exp );
		return;
	}
	abstract void speak(); //�߻� �޼���
	void show() {
		System.out.println(this.name+" Lv."+this.level);
	}
}
class Pica extends Pocket{
	Pica(){
		this.name="��ī��";
	}
	void speak() {
		System.out.println("��ī��ī");
		this.show();
	}
}
class Pi extends Pocket{
	Pi(){
		this.name="���̸�";
	}
	void speak() {
		System.out.println("����");
		this.show();
	}
}
class Bugi extends Pocket{
	Bugi(){
		this.name="������";
	}
	void speak() {
		System.out.println("����Ĩ");
		this.show();
	}
}


public class day10_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Trainer t=new Trainer("����");
		Pocket p1=new Pica();
		Pocket p2=new Pi();
		
		while(true) {
			System.out.println("1.���� 2.��å 3.����");
			System.out.println("�Է�: ");
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
