// JAVA: ��ü������
		//1) �߻�ȭ 
		//2) ĸ��ȭ: ������ �ı�ȿ�� �پ��
		//3) ���: �ߺ��ڵ� �ּ�ȭ
		//4) ���⼺
class Circle{
	// Ŭ������ �⺻ �����̱� ������ �ܵ����� ����
	String name; // ��� -> ��ü���� �� ����x
	int radius;  // �������.�Ӽ�.�ʵ�
	void show() { // ����Լ�. �޼���. �޼ҵ� -> ��ü���� �Լ��� ������� ������ static ����
		System.out.println(name+"�� �������� "+radius);
	}
	Circle(){ // Ŭ������ �̸��� ������ �̸��� �Լ��� �����ڶ�� �Ѵ�. ��üȭ�Ҷ� ����.
		System.out.println("�⺻������ ȣ��");
		//�⺻������. ����Ʈ������ -> main�Լ����� ������ټ��� �ƴϸ� ���� ����ų�
		// �ٸ������ڰ� 1���̻� ���ǵǸ� �⺻�������� �ʴ´�!
	}
	
	Circle(String name, int radius){
		        
		System.out.println("������ ȣ��");
		this.name=name;
		this.radius=radius; //this: �ڱ��ڽ�
		
	} //[�����ε�] ������ �����ε�
	  //String s, int i
	  //name=s;   �̷��� �ص� �ǳ� ��������
	  //radius=i;
}


public class day7_1 {

	public static void main(String[] args) {
		
		//[��ü�����ڵ�]
		// Ŭ����
		//1)��ü��������� �⺻����
		//2)��üȭ, �ν��Ͻ�ȭ
		//Ŭ���� �ڵ�->->��ü ex) �ڵ��� Ŭ����-> �ڵ��� ��ü*N��
		// Ŭ����:��ü=1:N ���� 
		System.out.println("a");
		Circle c1=new Circle(); // new �� ���� ��üȭ �ߴ�. -> Ŭ�������� ��ü�� �̾Ƴ��ڴ�.
		Circle c2=new Circle("����",1); // �տ��ִ� Circle�� �ڿ��ִ� Circle()�� �ٸ���. �Ȱ��� �ʴ�!
		                        // Ŭ������ �Լ��̴�. ���� Ŭ������ �ִ� Circle �Լ��� ȣ���ѰͰ� ����.
		System.out.println("b");
		c1.name="����";
		c1.radius=10;
		
		System.out.println(c1.name+"(��)"+c1.radius);
		System.out.println(c2.name+"(��)"+c2.radius);
		c1.show();
		c2.show();
		
		
		
		
		

	}

}
