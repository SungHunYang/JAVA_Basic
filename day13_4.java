import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class day13_4 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet(); 
		// ����
		// : ���� xx
		// : �ߺ� xx
		
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
		// ���� ������� ���� �ȳ��� / ������ ����
		
		System.out.println(set.contains(10));
		// ���� �ƴ��� �ȵƴ��� �˷���
		System.out.println(set.contains(1000));
		
		HashSet set2=new HashSet();
		set2.add(1);
		
		HashSet set3=new HashSet();
		set3.add(1);
		set3.add(111);
		
		System.out.println(set.containsAll(set2));
		// set �ȿ� set2�� ���ԵǴ��� ���԰��踦 ���
		System.out.println(set.containsAll(set3));
		
		System.out.println(set.size());
		
		////
		
		//���ͷ�����(�ݺ���)
		// : ��� �÷��ǿ� ����
		// : �÷����� �����͸� ������ ��ü
		ArrayList a=new ArrayList();
		LinkedList l=new LinkedList();
		Iterator itr3=a.iterator(); // �ڵ�����Ʈ �ؾߵ�
		Iterator itr2=l.iterator();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			// ���� itr�� �ִ�?
			System.out.println(itr.next());
			// ������ ���� itr�� ������
			// itr�� ����ϸ� �����Ѵ�.
		}
		

	}

}
