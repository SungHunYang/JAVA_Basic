import java.util.Scanner;

// return : �Լ��� ��� �����Ű�� Ű����
// break : ����� ��� �����Ű�� Ű����

class Card{
	Scanner sc=new Scanner(System.in);
	String name;
	String user;
	int bal;
	int pw;
	int pay(int money) {
		if(this.bal<money) {
			System.out.println("�ܾ��� �����Ͽ� ���� �Ҽ������ϴ�");
		}
		else if(money>=10000) {
			System.out.print("4�ڸ� ��й�ȣ�� �Է����ּ���: ");
			int i;
			for(i=0; i<2; i++) {
				int check=sc.nextInt();
				if(this.pw==check) {
					System.out.println("���� �Ǿ����ϴ�");
					this.bal-=money;
					break;
				}
				else if(i==0)
				{System.out.print("Ʋ�Ƚ��ϴ�! �ٽ� �Է����ּ���: ");}
			}
			while(i==2) {
				System.out.println("��й�ȣ 2ȸ �̻�Ǽ�!");
				System.out.println("���� �Ұ���");
				i++;}

		}
		else {
			this.bal-=money;
			System.out.println("���� �Ǿ����ϴ�");
		}
		return this.bal;
	}


	void show() {
		System.out.println(this.user+"���� "+this.name+"ī�� �ܾ��� "+this.bal+"�Դϴ�.");
	}
	Card(String user, String name){
		this(user, name, 1234, 0);
	}
	Card(String user, String name, int pw){
		this(user, name, pw, 0);
	}
	Card(String user, String name, int pw, int bal){
		this.user=user;
		this.bal=bal;
		this.name=name;
		this.pw=pw;
		System.out.println(this.user+"����"+this.name+"ī��");
		System.out.println("��й�ȣ:"+this.pw+" �ܾ�:"+this.bal);
	}
}


public class day8_4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int pw;
		int bal;
		int money;
		int num;
		int cnt;

		do
		{System.out.println("���ϴ� ī��縦 �������ּ���");
		System.out.println(" 1. �Ｚ");
		System.out.println(" 2. LG");
		System.out.println(" 3. ��");
		num=sc.nextInt();}while(num>3 || num<1);
		switch(num)
		{
		case 1 : 
			System.out.println("��й�ȣ �Է�: ");
			pw=sc.nextInt();
			System.out.println("�ܾ� �Է�: ");
			bal=sc.nextInt();
			Card c1=new Card("�缺��", "�Ｚ", pw, bal);
			do{
				System.out.println("��ǰ�� ���� �Է�: ");
				money=sc.nextInt();
				c1.pay(money);
				c1.show();
				do{System.out.println("��ǰ�� �� �����ϰ�����ø� 1. �ƴϸ� 2.");
				cnt=sc.nextInt();}while(cnt<1 || cnt>2);
			}while(cnt==1);
			break;

		case 2 :
			System.out.println("��й�ȣ �Է�: ");
			pw=sc.nextInt();
			System.out.println("�ܾ� �Է�: ");
			bal=sc.nextInt();
			Card c2=new Card("�缺��", "LG", pw, bal);
			do{
				System.out.println("��ǰ�� ���� �Է�: ");
				money=sc.nextInt();
				c2.pay(money);
				c2.show();
				do{System.out.println("��ǰ�� �� �����ϰ�����ø� 1. �ƴϸ� 2.");
				cnt=sc.nextInt();}while(cnt<1 || cnt>2);
			}while(cnt==1);
			break;

		case 3 :
			System.out.println("��й�ȣ �Է�: ");
			pw=sc.nextInt();
			System.out.println("�ܾ� �Է�: ");
			bal=sc.nextInt();
			Card c3=new Card("�缺��", "��", pw, bal);
			do{
				System.out.println("��ǰ�� ���� �Է�: ");
				money=sc.nextInt();
				c3.pay(money);
				c3.show();
				do{System.out.println("��ǰ�� �� �����ϰ�����ø� 1. �ƴϸ� 2.");
				cnt=sc.nextInt();}while(cnt<1 || cnt>2);
			}while(cnt==1);
			break;
		}
		System.out.println();
		Card c4=new Card("�缺��", "����");
		c4.pay(10000);
		c4.show();
		System.out.println();
		Card c5=new Card("�缺��", "����", 5555);
		c5.pay(10000);
		c5.show();

	}

}
