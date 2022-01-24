
class MyThread extends Thread{
	public void run() {
		for(int i=0; i<15; i++) {
			System.out.println("클래스로 만든 스레드 "+i);
		}
	}
}
class MyThread2 implements Runnable{

	public void run() {
		for(int i=0; i<15; i++) {
			System.out.println("인터페이스로 만든 스레드 "+i);
			try {
				Thread.sleep(1000); // 블록만듦 --> 1000당 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class day16_1 {

	public static void main(String[] args) {
		
		//[스레드]
		//Thread: 프로세스에서 일을 수행하는 실질적인 대상
		//==앱==프로그램==SW :
		// OS->CPU를 할당 받아서 -> 프로세스
		//프로세스:
		
		// 선점형 방식
		// 우선순위 순서대로 수행 -> 기아현상
		
		// 시간분할 방식
		// 일정시간이 지나면, 우선순위를 증가
		
		// 스레드 만들어 사용하기
		// 1)Thread 클래스 상속
		// 2)Runnable 인터페이스 구현
		
		// 생명주기(라이프사이클)
		// 생성 -> 대기 -> 수행 -> 데드
		// 수행중에..
		// 1.시간대기 == 시간블록
		// 2.무한정대기 == 무한정블록
		
		
		
		
		MyThread t1=new MyThread(); // 스레드 객체(인스턴스) 생성
		MyThread2 t2=new MyThread2(); //Thread 클래스 생성자의 인수로 전달될수있음
		Thread t=new Thread(t2);
		//생성
		//대기
		
		
		t1.setPriority(1);  //가급적 나중에 (이런 경향성을 준다)
		// 5가 디폴트 설정 숫자가 커질수로 우선순위가 높아짐
		t.setPriority(10); // 가급적 먼저
		
		
		t1.start(); // run을 수행함 헌데! 얘는 run을 수행하고 싶은게 아니라 Thread가 일하게 하고싶은거다!
		t.start();  // 44번 하던말던 상관말고 수행함
		//수행
		//데드 --> 자원을 반납한상태 
		
	}

}
