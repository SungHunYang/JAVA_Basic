
// ���� ����� ����

import java.util.Scanner;

// ī��
class Card1{
	String user; // ������̸�
	String name; // ī���
	int bal; // �ܾ�
	private int pw; // ��й�ȣ

	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	Card1(String user,String name){
		this(user,name,1234,0);
	}
	Card1(String user,String name,int pw){
		this(user,name,pw,0);
	}
	Card1(String user,String name,int pw,int bal){
		this.user=user;
		this.name=name;
		this.bal=bal;
		this.pw=pw;
	}
	void pay(int money) {
		if(money>this.bal) {
			System.out.println(this.user+"��, �ܾ׺���!!!");
			return;
		}
		if(money>=10000) {
			for(int i=0;i<2;i++) {
				if(this.check()) {
					this.bal-=money;
					return;
				}
			}
			System.out.println("��й�ȣ�� 2ȸ�̻� Ʋ���̽��ϴ�!");
			return;
		}
		this.bal-=money;
		// 1.���࿡ money 1�����̻��� �ݾ��̸� ��й�ȣ Ȯ���� �������ּ���!
		// 2.2���̻�Ʋ���� �����Ҽ������ϴ�.
		// 3.�ܾ��� �����ϸ� �����Ҽ������ϴ�.
	}
	boolean check() {
		Scanner sc=new Scanner(System.in);
		System.out.print("��й�ȣ �Է�: ");
		int pw=sc.nextInt();
		if(this.pw==pw) {
			return true;
		}
		return false;
	}
	void show() {
		System.out.println(this.user+"���� "+this.name+"ī���� �ܾ��� "+this.bal+"���Դϴ�.");
		// �������� ooī���� �ܾ��� ____���Դϴ�.
	}
}

public class day8_5 {

	public static void main(String[] args) {

		/*
      1)������̸�,ī���� ������ �����ؾ���.
      �ܾ��� 0��,��й�ȣ�� 1234�� �������ּ���.

      2)������̸�,ī���,��й�ȣ
      3)������̸�,ī���,��й�ȣ,�ܾ�

      ������̸�,ī���,�ܾ�xxxxx
		 */

		Card1 c1=new Card1("�ƹ���","����");
		Card1 c2=new Card1("�Ƹ�","����",5555);
		Card1 c3=new Card1("Ƽ��","����",9999,20000);

		c1.pay(500);
		c2.pay(10000);
		c3.pay(10000);

		c1.show();
		c2.show();
		c3.show();


	}

}
