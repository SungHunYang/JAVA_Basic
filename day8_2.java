
class Person{
	// ��� ���� Ŭ������ �̿����� x
	String name;
	/*Person(){
		System.out.println("�θ� Ŭ������ ������");
	}*/
	Person(String name){
		this.name=name;
	}
	void hi() {
		System.out.println("�ȳ��ϼ���!");
	}
}

class Student extends Person {
	Student(String name) {
		super(name);
	}
	//        ��ӹް� ���� -> Person(����Ŭ����)�� ��� ��� �����ϴ�
	int Score;
	/*String name;
	void hi()
	{                     -> ��� �޾Ƽ� �̰� �ȸ��� ��
	System.out.println("�ȳ��ϼ���!");
	}*/  
	/*Student(){
		///// �θ�Ŭ������ �⺻�����ڸ� ȣ��!!
		System.out.println("�ڽ� Ŭ������ ������");
	}*/
	void hi() {
		// �θ�Ŭ������ �Լ��� �̸��� ����,
		// ���ڵ� �������
		// -> [�������̵�] == ������
		System.out.println("������������");
	}
	void study()
	{
		System.out.println("������...");
	}
}
// �����ε�: �����̸��� �Լ� ������ ���
// ������ Ÿ�� or ������ �ٸ���. ���x

// �������̵�: �����̸��� �Լ� ������ ���
// ������ Ÿ��and������ �����ϴ�. ���o
public class day8_2 {

	public static void main(String[] args) {
		
		Person p=new Person("ȫ�浿");
		System.out.println("---------------");
		Student s=new Student("�ƹ���");
		
		p.hi();
		s.hi();
		

	}

}
