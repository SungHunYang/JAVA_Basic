
public class day6_3 {

	static int f3() {
		// void 자리에 output을 리턴으로 주고 싶으면 타입에 맞는 데이터형을 적어주면 된다.
		System.out.println("f3() 호출!");
		return 100; // output을 주는거다 
		// return 자기 자신을 호출한 위치로 값을 '즉시' 반환하는 키워드
	}
	
	static int f4(int x, int y) {
		System.out.println("f4() 호출");
		int z=x+y;
		return z;	
	}
	
	
	public static void main(String[] args) {
		
	 System.out.println("프로그램 실행...");
	 f3(); // 즉 이건 = 100; 이거랑 같다.
	 int a=f3(); // f3가 화면에 뜨고 리턴을 만나면 100을 a에 저장
	 int b=1;
	 b=f3();// 17번 라인과 마찬가지
	 System.out.println("a:"+a+" b:"+b);
	 
	 int c=f4(a,b);
	 System.out.println("c:"+c);
			 
	 
	}

}
