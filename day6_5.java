
public class day6_5 {

	static int add(int x,int y) {
		System.out.println("확인1");
		return x+y;
	}
	static int add(int x,int y, int z) {
		System.out.println("확인2");
		return x+y+z;
	}
	static double add(double x,double y) {
		System.out.println("확인3");
		return x+y;
	}
	// 기능이 서로 유사한 함수들의 이름을 동일하게 정의할수있다.
	// 단, 서로의 매개변수 개수 or 타입 /반환값의 타입이 달라야한다.
	//[오버로딩]★★★ 이름 외워라
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		int num1=add(a,b);
		int num2=add(a,b,c);
		System.out.println(num1+" "+num2);
		
		
		double x=1.2;
		double y=2.3;
		double num3=add(x,y);
		System.out.println(num3);

	}

}
