import java.util.LinkedList;

public class day13_3 {

	public static void main(String[] args) {
		// ArrayList --> �����Ȱ� ����ϴ� ����
		// LinkedList--> ���� ������ �����Ͼ ������ ���� �ؾ��Ҷ�
		
		
		LinkedList list=new LinkedList();
		// ���Ḯ��ư
		// �׳� ����Ʈ�̱� ������ �ε��� x ����������ȵ�
		// <Integer>
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.addFirst(100);
		list.addLast(200);
		System.out.println(list);
		
		list.offer(1234); //--> addLast�� ���� ���� ������ �߰�
		System.out.println(list);
		System.out.println(list.poll());
		// ���� ó����--> ������ ������ ��� 
		System.out.println(list);
		System.out.println(list.peek());
		// ���� ó����--> ������ �������� x ���
		System.out.println(list);
		
		list.push(11);
		// �� �տ� �߰�
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		//�� ���� ���� ��� 
	}

}
