
public class day12_3 {

	public static void main(String[] args) {
		
		// ���� for�� -> �ַ� �迭[] ������ �Բ� �̿��ϴ� ��� ��
		// forEach��
		int[] data= {1,2,3,4,5};
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println();
		for(int v:data) {
		//  �迭 �ȿ� ����Ǿ��ִ� Ÿ�� : ���� ������ �迭
		// �迭�� ������ŭ ��
			System.out.println(v);
		}

	}

}
