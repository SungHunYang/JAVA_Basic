
public class day1_1 {

	void Q() {
	
	}
	// 프로그램을 작동시키기 위해서는 main()함수가 필요하다 (대소문자 구분)
	public static void main(String[] args) {
//	공개범위  객체무관(상황에 상관없이)  void-> 반환되는게 없다 저장값을 컴퓨터에 주지 않겠다는것
		System.out.print("안녕하세요!");
		//시스템 .안에있는 .프린트      =출력하는 방법  (자바에서는 줄바꿈 제공 x)
		System.out.print("저는 양성훈입니다");
		//syso ctrl+space+enter 자동완성방법 
		System.out.println("이게 줄바꿈 입니다");
		//pirntln 함수는 줄바꿈을 제공합니다.
		System.out.println("줄바꿈");
		//데이터를 저장하기
		// data=값=value
//1.용도 
//2.타입=자료형=data type -> int(정수) double(실수) char(단일문자) string(문자열) boolean(진위형)(true, false)
//3.값(저장할값)
		int age=23; // 대입 연산자 : 방향-> 오른쪽을 왼쪽에 넣는다.
		/*
		int age;
		age=20;
		*/
		final double PI=3.141592; //상수화 : 불변(final)
		char grade='A';// 단일문자는 ''
		String name="양성훈";// 문자열은 ""
		Boolean pass=true;
			
		//변수 이름 규칙
		//1. 숫자로 시작 x
		//2. 띄어쓰기x 대신 언더바->_
		//3. 특수문자x 언더바제외
		//4. 대소문자를 구별o
		//5. 이미 뜻이 있는 단어들은 사용x
		age=24;
		System.out.println("내가 1년 더먹어서");
		System.out.println(age);	
		System.out.println("PT는 상수이며, 값은 "+PI+"입니다");
		//"++"는 저장해둔값 나오게하기
		System.out.println(name);
		System.out.println(grade);
		System.out.println(pass);
	}
	
}


// c+s +/- : 글씨크기 변경가능
/*
 여러줄 주석처리
 한번에
 여러개의 줄을 주석처리 할수 있다.
 */

// 주석은 프로그램에서 제외되며, 영향을 주지 않는다.