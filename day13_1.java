import java.util.ArrayList;

public class day13_1 {

	public static void main(String[] args) {
		
		//[컬렉션 프레임워크]
		//[자료구조]

		// 배열 vs 리스트
		// 배열: 삽입(),삭제() 불리 / 크기제한이있음
		//      검색() 유리
		
		// 리스트
		// 리스트 : 검색() 불리/ 인덱싱방식 xx
		//        공간의 제약이 상대적으로 덜함/ 크기제한xx/삽입(), 삭제() 유리
		
		// 배열리스트
		ArrayList alist=new ArrayList(5); //--> 자동 리포트 --> '5'를 집어넣지 않아도 된다 리스트이기 때문
		ArrayList<Integer> blist=new ArrayList();
		//<> 제네릭(Generic): 타입을 명시. 저장되는 데이터들의 타입을 일반화
		
		alist.add(10);
		alist.add(20); //-> 값을 집어넣는
		alist.add(30);
		alist.add(0,11);  // (0,11) --> 0번 인덱스에 11을 넣겠다.
		alist.add(0,12); //--> 뒤로 밀림
		alist.add(0,100); //--> 배열이 리스트가 되면서 크기가 제한이 없어져 6번째이지만  5로 해도 된다.
		alist.add(0, "apple"); //--> 이것도 가능 오브젝트객체이면 뭐든지 들어갈수있다.
		System.out.println(alist);

		/*alist.clear(); //--> 안에있는 내용물을 모두 지우는 메서드*/
		System.out.println(alist.get(0));
		//alist.clear();
		//System.out.println(alist.isEmpty());// -> 배열리스트가 비어있는지 확인하는 것
		alist.remove(2); //--> 인덱스 번호에 맞는 값 삭제
		System.out.println(alist.size()); //--> 크기가 얼마나 되는지 알려줌
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i)); // get--> 호출
		}
		for(Object v:alist) {
			// alist 안에 들어가있는게 무슨타입인지 장담할수 없으므로 앞에 타입에는 오브젝트를 쓴다.
			System.out.println(v);
		}
		blist.add(10);
		blist.add(20);
		blist.add(30);
		for(int v:blist) {
			// blist 안에 타입이 명시되었기 때문에 int로 해도 무관
			System.out.println(v);
		}
		
	}

}
