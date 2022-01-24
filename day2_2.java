import java.util.Scanner;

public class day2_2 {
 // 보통 클래스 명은 첫번째는 '대문자' 대문자 안쓴건 실수ㅎㅎ 보통 그렇다는거고 의무는 아님
	public static void main(String[] args) {
		
		
		//[증감연산자]
		//★디버깅표★ 매우중요
		int num=10;
		
		num++;//후위 증감 연산자.우선순위가 매우 낮음   연산자 1개
		System.out.println(num);
		++num;//전위 증감 연산자.우선순위가 매우 높음   연산자 1개
		System.out.println(num);
		
		System.out.println();
	      int a=10;
	      int b=a++; //대입연산자,후위연산자 연산자가 2개다 따라서 대입한뒤 후위(우선순위가 낮다)가 들어간다 = -> ++
	      System.out.println("a="+a+", b="+b);
	// +는 이어주고 "로 닫아주는거다 a는 앞뒤로 이어주니까 ++ b는 한쪽이니까 +하나 문자와 넣는값을 분리하고("") 연결한다고(+) 생각하면 된다
	      b=++a; //대입연산자,전위연산자 연산자가 2개다 따라서 대입하기전 전위(우선순위가 높다)가 들어간다 ++ -> =
	      System.out.println("a="+a+", b="+b);
	      // a         b
	      // 10        10 1.a=b     b=a++ -> 1.(b=a) 2. a++
	      // 11 2.a++               
	      // 12 3.++a  12 4.a=b     b=++a -> 3.++a   4. (b=a)
		
	      //[비교연산자] -> 질문 응답이 true,false로 돌아옴
	     int c=10;
	     int d=20;
	     System.out.println(c>d);
	     // > < >= <= == !=  !:NOT
	     
	     //[논리 연산자] -> true false 로 값이 나옴 17 20
	     // && : and / || : or / ! : not
	     int e=10;
	     int f=20;
	     int g=30;
	     System.out.println(e<f && c<g);
	     System.out.println(e<f || c<g);
	     System.out.println(!(e<f));
	     
	     // 예제3) 두자리수 (10~99) 정수를 1개 입력  45의 십 의자리는 4이고, 일의 자리는 5입니다
	     
	     
	     //[삼항 연산자 == 조건연산자]
	     // 조건식 ? T : F 
	     int k=  10>5 ? 100:200;
	     System.out.println(k);
	     Scanner sc=new Scanner(System.in);
	     System.out.println("첫번째 넣어주세요");
	     int q=sc.nextInt();
	     System.out.println("두번째 넣어주세요");
	     int w=sc.nextInt();
	     int big= q>w ? q:w;
	     System.out.println("큰 정수는 "+big+"");
	     
	     // 예제4) 정수를 3개 입력 가장작은 정수 출력

	}

}
