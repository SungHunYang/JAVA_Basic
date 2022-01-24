
class TV implements useTV{
	boolean power;
	int sound;
	TV(){
		this.power=false;
		this.sound=50;
	}
	public void powerOnOff() {
		if(this.power) {
			this.power=false;
		}
		else {
			this.power=true;
		}
		
	}
	public void soundUp() {
		if(this.power==false) {
			System.out.println("����off");
			return;
		}
		if(this.sound==maxsound) {
			System.out.println("�ִ�����");
			return;
		}
		this.sound++;
		
	}
	public void soundDown() {
		if(this.power==false) {
			System.out.println("����off");
			return;
		}
		if(this.sound==minsound) {
			System.out.println("�ּ�����");
			return;
		}
		this.sound--;
		
	}
	public void show() {
		System.out.println("���� ����: "+this.power);
		System.out.println("���� ����: "+this.sound);
		
	}
}

interface useTV{ 
	//� Ŭ������ ����� �����ϴµ� ������ ��
	//� Ŭ������ ��� �̿��ϴ����� ���� ���� �ۼ�
	//���� ��� TV-������, ��ǻ��-���콺 ����� Ŭ����-�������̽� �̷�����
	int minsound=0;
    int maxsound=100;
	void powerOnOff();
	void soundUp();
	void soundDown();
	void show();
	
}
public class day11_4 {

	public static void main(String[] args) {
		
		TV tv=new TV();
		tv.powerOnOff();
		tv.soundUp();
		tv.show();

	}

}
