
class TSys implements Runnable{
	
	Ticketting t=new Ticketting();
	public void run() {
		t.pay();
		
	}
	
}
class Ticketting{
	static int ticket=2; //객체들끼리 공유하는 데이터 클래스변수
	synchronized void pay() {
		// 동기화 하는것
		if(ticket>0) {
			System.out.println(Thread.currentThread().getName()+"님, 예약완료!");
			// Thread에 이름 주기
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"님, 이미 선택된 좌석");
		}
		System.out.println("남은 티켓수: "+ticket);
	}
}

public class day16_2 {

	public static void main(String[] args) {
		
		// "동기화"
		// : 공유자원을 어떤 스레드가 점유하고 있을때 다른 스레드의 접근을 막는 것
		
		TSys tsys=new TSys();
		Thread p1=new Thread(tsys,"피즈");
		Thread p2=new Thread(tsys,"아칼리");
		Thread p3=new Thread(tsys,"베인"); // 뒤에 적으면 이름
		
		p1.start();
		p2.start();
		p3.start();

	}

}
