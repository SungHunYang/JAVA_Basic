import java.util.Scanner;

class Phone{
	String name; // �������, �Ӽ�, �ʵ�
	String num;// ��ü���� ������ ���� ����, ���� ���� ����xx
	// ������ int 3�� ��� ��ȣ
	boolean check;
	int pw;
	void show() { // ����Լ�, �޼���, �޼ҵ�
		if(this.check) {
			Scanner sc=new Scanner(System.in);
			System.out.println(this.name+"��, ��й�ȣ �Է� : ");
			int pw=sc.nextInt();
			if(pw!=this.pw) {
				System.out.println("��й�ȣ ����ġ!");
				return;
			}
		}
		System.out.println(this.name+"���� ��ȣ�� "+this.num+"�Դϴ�.");
	}
	
	Phone(String name, String num){// �����ε�
		this(name, num, false, 1111); // �����ڴ� �׻� ��ù�ٿ� �ۼ�
		// -> Ȯ��2 �ҷ��� ��ü�����, �ؿ� Ȯ��1 �θ�.
		System.out.println("Ȯ��1");
	}
	Phone(String name, String num, boolean check, int pw){
		this.name=name;
		this.num=num;
		this.check=check;
		this.pw=pw;
		System.out.println("Ȯ��2");
	}
	
	
}

public class day9_1 {

	public static void main(String[] args) {
		
		Phone p1=new Phone("Samsung","010-2021-3083");
		System.out.println();
		Phone p2=new Phone("I phone","010-2021-3083",true,3083);
		p1.show();
		p2.show();
		p2.show();
	}

}
