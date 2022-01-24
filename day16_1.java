
class MyThread extends Thread{
	public void run() {
		for(int i=0; i<15; i++) {
			System.out.println("Ŭ������ ���� ������ "+i);
		}
	}
}
class MyThread2 implements Runnable{

	public void run() {
		for(int i=0; i<15; i++) {
			System.out.println("�������̽��� ���� ������ "+i);
			try {
				Thread.sleep(1000); // ��ϸ��� --> 1000�� 1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class day16_1 {

	public static void main(String[] args) {
		
		//[������]
		//Thread: ���μ������� ���� �����ϴ� �������� ���
		//==��==���α׷�==SW :
		// OS->CPU�� �Ҵ� �޾Ƽ� -> ���μ���
		//���μ���:
		
		// ������ ���
		// �켱���� ������� ���� -> �������
		
		// �ð����� ���
		// �����ð��� ������, �켱������ ����
		
		// ������ ����� ����ϱ�
		// 1)Thread Ŭ���� ���
		// 2)Runnable �������̽� ����
		
		// �����ֱ�(����������Ŭ)
		// ���� -> ��� -> ���� -> ����
		// �����߿�..
		// 1.�ð���� == �ð����
		// 2.��������� == ���������
		
		
		
		
		MyThread t1=new MyThread(); // ������ ��ü(�ν��Ͻ�) ����
		MyThread2 t2=new MyThread2(); //Thread Ŭ���� �������� �μ��� ���޵ɼ�����
		Thread t=new Thread(t2);
		//����
		//���
		
		
		t1.setPriority(1);  //������ ���߿� (�̷� ���⼺�� �ش�)
		// 5�� ����Ʈ ���� ���ڰ� Ŀ������ �켱������ ������
		t.setPriority(10); // ������ ����
		
		
		t1.start(); // run�� ������ �嵥! ��� run�� �����ϰ� ������ �ƴ϶� Thread�� ���ϰ� �ϰ�����Ŵ�!
		t.start();  // 44�� �ϴ����� ������� ������
		//����
		//���� --> �ڿ��� �ݳ��ѻ��� 
		
	}

}
