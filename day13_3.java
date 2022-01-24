import java.util.LinkedList;

public class day13_3 {

	public static void main(String[] args) {
		// ArrayList --> 정돈된걸 출력하는 느낌
		// LinkedList--> 삽입 삭제가 자주일어나 정돈을 자주 해야할때
		
		
		LinkedList list=new LinkedList();
		// 연결리스튼
		// 그냥 리스트이기 때문에 인덱스 x 숫자적으면안됨
		// <Integer>
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.addFirst(100);
		list.addLast(200);
		System.out.println(list);
		
		list.offer(1234); //--> addLast랑 같은 역할 마지막 추가
		System.out.println(list);
		System.out.println(list.poll());
		// 제일 처음값--> 삭제를 동반한 출력 
		System.out.println(list);
		System.out.println(list.peek());
		// 제일 처음값--> 삭제를 동반하지 x 출력
		System.out.println(list);
		
		list.push(11);
		// 맨 앞에 추가
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		//맨 앞을 삭제 출력 
	}

}
