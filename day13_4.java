import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class day13_4 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet(); 
		// 집합
		// : 순서 xx
		// : 중복 xx
		
		set.add(100);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(10);
		set.add(11);
		set.add(20);
		set.add(1234);
		set.add(9);
		set.add(9);
		System.out.println(set);
		// 넣은 순서대로 값이 안나옴 / 순서가 없다
		
		System.out.println(set.contains(10));
		// 포함 됐는지 안됐는지 알려줌
		System.out.println(set.contains(1000));
		
		HashSet set2=new HashSet();
		set2.add(1);
		
		HashSet set3=new HashSet();
		set3.add(1);
		set3.add(111);
		
		System.out.println(set.containsAll(set2));
		// set 안에 set2가 포함되는지 포함관계를 물어봄
		System.out.println(set.containsAll(set3));
		
		System.out.println(set.size());
		
		////
		
		//이터레이터(반복자)
		// : 모든 컬렉션에 존재
		// : 컬렉션의 데이터를 복사한 객체
		ArrayList a=new ArrayList();
		LinkedList l=new LinkedList();
		Iterator itr3=a.iterator(); // 자동임폴트 해야됨
		Iterator itr2=l.iterator();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			// 다음 itr이 있니?
			System.out.println(itr.next());
			// 있으면 다음 itr을 보여줘
			// itr은 출력하면 삭제한다.
		}
		

	}

}
