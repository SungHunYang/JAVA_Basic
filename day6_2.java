
public class day6_2 {

	// 사용자가 정의하는 함수
	// 기능 
	// input : 입력값, 인자, 인수 , 매개변수
	// output : 결과값, 리턴값, 반환값, return
	static void f1() {
//	  함수는 괄호를 갖는다 /함수는 괄호 왼쪽에 '함수명'을 작성한다 / 중괄호 안에 '기능'을 정의함
//  input은 괄호안에 적는것 / void는 결과값이 없다는 뜻이다 즉,함수가 값을 준다는게 아니다
		System.out.println("f1() 수행!");
	} // 정의만 해둔상태 , 쓰려면 main 함수에서 호출해줘야 사용이 가능하다.
	  // 코드의 재사용성 증가
	// 함수는 주어가 있는 스타일과 주어가 없는 스타일이 있다.
	// 주어가 없는 스타일(공장형) -> static사용 ->객채(대상)과 무관하게 일정한 기능을 수행해라
	
	static void f2(int a) {
		a++;
		System.out.println("f2() 수행 "+a);
		
	}
	static void swap(int x, int y) {
		int tmp=x;
		x=y;
		y=tmp;
	}
	
	
	public static void main(String[] args) {
		
	//String[] -> 문자열타입의 배열 , args(배열명)
	// System.out.println(args[0]); -> run configuration 에서 수행할때 메인에 건내주면 들어간다.(외부에서 가져온다고 생각하면된다)
		
		// [함수]
		
		System.out.println("프로그램실행...");
		f1(); f1(); f1(); //f1을 호출 한거다. 함수는 main()에서 호출한 만큼 수행됨
		f2(100);
		
		int a=10;
		int b=20;
		System.out.println("a="+a+", b="+b);
		f2(a);
		f2(b);
		System.out.println("a="+a+", b="+b); // f2의 a와  main a가 다르다
		int x=10;
		int y=20;
		swap(x,y);
		System.out.println(x);
		System.out.println(y);

		
	}

}
