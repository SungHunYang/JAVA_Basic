import java.util.Scanner;

public class day6_4 {// ★★★★

	static int f1() {
		System.out.println("확인1");
		return 10;
	}
	static void f2(int a) {
		System.out.println("확인2");
		a+=10;
	}
	static int f3(int a, int b) {
		System.out.println("확인3");
		return a+b;
	}
	public static void main(String[] args) {
		
		
		int a=f1();
		int b=f1();
		f2(a);
		
		System.out.println("확인4");
		int c=f3(a,b);
		System.out.println("확인5");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	
		
	}

}
