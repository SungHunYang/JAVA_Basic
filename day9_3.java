

class Dog{
	String name; // ���� x --> �ν��Ͻ� ����
	static String[] act=new String[3]; // ����o --> Ŭ���� ����
	static int index; //���� o
	void play(String act) {
		this.act[this.index++]=act; // �� ���� �������̱� ������ ���Կ����� �ѵ� ����  ���� ���� �ᵵ ����
	
	}
	void show() {
		System.out.print(this.name+"�� ��� ����");
		for(int i=0; i<this.index;i++) {
			System.out.print(this.act[i]+" ");
		}
		System.out.println("�Դϴ�");
	}
	Dog(String name){
		this.name=name;
	}

	
}


public class day9_3 {

	public static void main(String[] args) {
		

		Dog d1=new Dog("����");
		Dog d2=new Dog("����");
		
		d1.play("�ɾ�!");
		d1.show();
		d2.show();
		
		d2.play("����� ����");
		d1.show();
		d2.show();
	}

}
