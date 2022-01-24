
class TSys implements Runnable{
	
	Ticketting t=new Ticketting();
	public void run() {
		t.pay();
		
	}
	
}
class Ticketting{
	static int ticket=2; //��ü�鳢�� �����ϴ� ������ Ŭ��������
	synchronized void pay() {
		// ����ȭ �ϴ°�
		if(ticket>0) {
			System.out.println(Thread.currentThread().getName()+"��, ����Ϸ�!");
			// Thread�� �̸� �ֱ�
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"��, �̹� ���õ� �¼�");
		}
		System.out.println("���� Ƽ�ϼ�: "+ticket);
	}
}

public class day16_2 {

	public static void main(String[] args) {
		
		// "����ȭ"
		// : �����ڿ��� � �����尡 �����ϰ� ������ �ٸ� �������� ������ ���� ��
		
		TSys tsys=new TSys();
		Thread p1=new Thread(tsys,"����");
		Thread p2=new Thread(tsys,"��Į��");
		Thread p3=new Thread(tsys,"����"); // �ڿ� ������ �̸�
		
		p1.start();
		p2.start();
		p3.start();

	}

}
