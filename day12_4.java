
public class day12_4 {

	public static void main(String[] args) {
		
		//Wrapper 클래스
		//String 클래스
		
			Integer i=new Integer(10); // 박싱
			int i2=i.intValue(); // 언박싱
			Integer i3=10; // 오토박싱
			int i4=i3; // 오토언박싱
			
			System.out.println(i); // 객체
			System.out.println(i2); // 변수
			
			if(i==i3) { // 객체끼리는 비교연산자로 비교할수 없다 equals 써야된다.
				System.out.println("티");
			}
			else {
				System.out.println("모");
			}
			
			String str=new String(); 
			// 이렇게 사용 하는이유는 메소드를 사용함이다.
			// String str="apple" 이렇게 할수도 있지만 이렇게 되면
			// 객체가 아니기 때문에 메소드 사용이 안된다. 
			// 따라서 객체는 메소드 사용이라는 장점 때문에 이렇게 사용하기도 한다.
			str="apple";
			System.out.println(str.toUpperCase());

	}

}
