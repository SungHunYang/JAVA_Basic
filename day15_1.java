public class day15_1 {

	public static void main(String[] args) {

		// [예외] -- exception
		// 코드상(문법상) 문제가 없었으나,
		// 실제로 수행하는 과정에서 발생하는 문제
		// -> 프로그램 종료됨 -> 프로그램을 끝까지 수행하는게 불가능
		
		// 예외는 각자 클래스로 이미 정의되어있음
		// 최상위 예외클래스==Exception

		// 예외는 각자 클래스로 이미 정의되어 있음

		// 프로그램을 끝까지 수행할수있도록하는 [예외처리]
		//try-catch문


		int a=10;
		int b=0;
		int arr[]= {1,2,3,4,5};
		int index=5;
		while(true) {
			try {
				// 예외가 발생할수 있는문을 적고
				System.out.println("아");
				System.out.println(a/b);
				// 자기에게 맞는 catch문으로 간다.
				System.out.println("마지막 요소의 값은"+arr[index]); 
				// 얘가 예외  --> try문에서 예외가 발생한다면, "즉시" 해당하는 catch문으로 이동
				System.out.println("무무");
				// 이 전 문에서 문제가 발생해서 catch문으로 가서 이 문장은 안나옴
				break;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				// 예외가 발생하게 되면 여기로 곧장 이동
				index=0;
				System.out.println("확인1 :"+arr[index]);
				System.out.println(e.getMessage());
			}
			catch(ArithmeticException e) {
				b=1;
				System.out.println("확인2: "+(a/b));
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("최상위 예외 클래스");
				// 순차적으로 비교 위에서 부터 아래로 따라서 이게 위에있으면 밑에는 닿을수가 없다.
				// 따라서 최상위는 항상 제일 아래에 적어야된다.
			}
			finally {
				// 예외가 발생하든 안하든 여기는 들림
				System.out.println("홍길동");
			}
		} // 예제1) 1.더하기 2.빼기 3. 종료  int res=10
		  //       입력 : 1  -> 정수 입력: 20 현재 res=30
		  //       입력 : 2 -> 정수입력: 1 현재 res=29
		  //       입력 : 3 -> 종료
		  //        범위가 잘못되면 재입력을 도와주고, 타입을 잘못 적으면 즉시종료
		  //       입력: 3.14 타입이 잘못되면 0을 입력한거처럼 더하기/뺴기를 수행
	}

}
