/*
���� Ŭ���� -> ���� ��ü���� ���鿹��
�����̸� �ð� ex) �ڹ� 24�ð� c 30�ð�
ex) 15 -> ��������� : 15
ec) �ڹ� -> c++ : 30
*/

class Sub{
	String name;
	int time;
	Sub(String name, int time){
		this.name=name;
		this.time=time;
	}
	Sub(int time){
		this("���� ������",time);
	}
	Sub(String name){
		this(name , 30);
	}
	void show(){
		System.out.println("��û���� :"+this.name+" �̼� �ð� :"+this.time);
	}
	
}
public class day9_2 {

	public static void main(String[] args) {
		

		Sub s1=new Sub("JAVA", 24);
		s1.show();
		
	}

}
