import java.util.ArrayList;

public class day13_1 {

	public static void main(String[] args) {
		
		//[�÷��� �����ӿ�ũ]
		//[�ڷᱸ��]

		// �迭 vs ����Ʈ
		// �迭: ����(),����() �Ҹ� / ũ������������
		//      �˻�() ����
		
		// ����Ʈ
		// ����Ʈ : �˻�() �Ҹ�/ �ε��̹�� xx
		//        ������ ������ ��������� ����/ ũ������xx/����(), ����() ����
		
		// �迭����Ʈ
		ArrayList alist=new ArrayList(5); //--> �ڵ� ����Ʈ --> '5'�� ������� �ʾƵ� �ȴ� ����Ʈ�̱� ����
		ArrayList<Integer> blist=new ArrayList();
		//<> ���׸�(Generic): Ÿ���� ���. ����Ǵ� �����͵��� Ÿ���� �Ϲ�ȭ
		
		alist.add(10);
		alist.add(20); //-> ���� ����ִ�
		alist.add(30);
		alist.add(0,11);  // (0,11) --> 0�� �ε����� 11�� �ְڴ�.
		alist.add(0,12); //--> �ڷ� �и�
		alist.add(0,100); //--> �迭�� ����Ʈ�� �Ǹ鼭 ũ�Ⱑ ������ ������ 6��°������  5�� �ص� �ȴ�.
		alist.add(0, "apple"); //--> �̰͵� ���� ������Ʈ��ü�̸� ������ �����ִ�.
		System.out.println(alist);

		/*alist.clear(); //--> �ȿ��ִ� ���빰�� ��� ����� �޼���*/
		System.out.println(alist.get(0));
		//alist.clear();
		//System.out.println(alist.isEmpty());// -> �迭����Ʈ�� ����ִ��� Ȯ���ϴ� ��
		alist.remove(2); //--> �ε��� ��ȣ�� �´� �� ����
		System.out.println(alist.size()); //--> ũ�Ⱑ �󸶳� �Ǵ��� �˷���
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i)); // get--> ȣ��
		}
		for(Object v:alist) {
			// alist �ȿ� ���ִ°� ����Ÿ������ ����Ҽ� �����Ƿ� �տ� Ÿ�Կ��� ������Ʈ�� ����.
			System.out.println(v);
		}
		blist.add(10);
		blist.add(20);
		blist.add(30);
		for(int v:blist) {
			// blist �ȿ� Ÿ���� ��õǾ��� ������ int�� �ص� ����
			System.out.println(v);
		}
		
	}

}
