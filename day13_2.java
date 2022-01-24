import java.util.ArrayList;
import java.util.Scanner;

class Menu{
	String name;
	int price;
	Menu(String name, int price){
		this.name=name;
		this.price=price;
		System.out.println(this.name+"�޴� ��ϿϷ�!");
	}
	public String toString() {
		return this.name+": "+this.price+"��";
	}
}
class Person{
	String name;
	int phone;
	int check;
	int coupon;
	Person(String name, int phone){
		this.name=name;
		this.phone=phone;
		this.check=0;
		this.coupon=0;
		System.out.println(this.name+"��, ��� �Ϸ�");
	}
	void pay(int money) {
		if(this.coupon>0) {
			this.coupon--;
			System.out.println("���� ����");
			return;
		}
		money/=1000;
		this.check+=money;
		while(this.check>=10) {
			this.check-=10;
			this.coupon++;
			System.out.println("���� 1������");
		}
		System.out.println("���� �Ϸ�");
	}
}

public class day13_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Menu> mL=new ArrayList(); // �޴� Ŭ���� ���� ����
		ArrayList<Person> pL=new ArrayList();
		pL.add(new Person("ȫ�浿",1234));
		mL.add(new Menu("�Ƹ޸�ī��",2000));
		mL.add(new Menu("ī���",2500)); 
		// ��ü�������� �ٷ� ����--> �Ŀ� �ε����ѹ��� ȣ��
		mL.add(new Menu("������",3500));
		
		//1.�޴��߰� add()
		//2.�޴����� remove()
		//3.�޴�����  getter,setter
		//4.������Ʈ ��� -> foreach��
		
		while(true) {
			System.out.println();
			System.out.println("�������! ī���Դϴ�~!");
			System.out.println("==�޴���==");
			for(int i=0; i<mL.size(); i++) {
				System.out.println((i+1)+"."+mL.get(i));
			}
			System.out.println("�޴� ��ȣ �Է�: ");
			int num=sc.nextInt();
			System.out.println("���� �Է�: ");
			int cnt=sc.nextInt();
			sc.nextLine();
			int price=mL.get(num-1).price*cnt;
			System.out.println("�� �ݾ���"+price+"�� �Դϴ�.");
			
			System.out.println();
		System.out.println("�޴��� ���ڸ� ��ȣ�Է�: ");
			int phone=sc.nextInt();
			boolean check=true;
			for(int i=0; i<pL.size();i++) {
				if(phone==pL.get(i).phone) {
					pL.get(i).pay(price);
					check=false;
					break;
				}
			}
			if(check) {
				System.out.println("�ű� ���...");
				sc.nextLine();
				System.out.println("�̸� ���: ");
				String name=sc.nextLine();
				pL.add(new Person(name,phone));
				pL.get(pL.size()-1).pay(price);
				
			}
			else{sc.nextLine();}
			System.out.println();
			System.out.println("�߰��ֹ��Ͻðڽ��ϱ�?");
			String ans=sc.nextLine();
			ans.toUpperCase();
			if(ans.equals("NO")) {
				break;
			}
		}
		
		

	}

}
