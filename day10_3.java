
class Person{
	String name;
	void hi() {
		System.out.println("�ȳ��ϼ���");
	}
}
class Student extends Person{
	int score;
	void hi() {
		System.out.println("hi hi");
	}
}

public class day10_3 {

	public static void main(String[] args) {
		
		Person p1=new Person();
		Student s1=new Student();
		Person stu=new Student(); // �� ĳ���� //Person �ؾƲ�� ���� ���� Student �ؾ
		stu.hi(); // �������ε�  person���� ������ student���� ���
		//Student c=(Student)new Person();--> �ٿ�ĳ����--> ��ġ���һ�Ȳ�� �������� �뵵��
		
		

	}

}
