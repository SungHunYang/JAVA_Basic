
public class day5_5 {

	public static void main(String[] args) {
		
		// ��[����]�� : ��������, ����, ��, �պ�, ���� ,��.....
		// -> "Ž��"�� �����ϰ� �ϱ����ؼ��̴�.
		// : �������� -> �αٿ� �ִ� �� �����͸� ����
		
		int[] data= {5,3,4,2,1};
		int temp=0;
		for(int a=0; a<data.length;a++) { //�� ���� ��ü��(�����Ͱ���)��==Nȸ�� ����
		// ���ϴ� ������ (�����Ͱ���-1)�� ������
		for(int i=0; i<data.length-1;i++) {
			if(data[i]>data[i+1]) {
				temp=data[i];
				data[i]=data[i+1];
				data[i+1]=temp;
			}
		}
		}
		for(int i=0; i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
   // ����3) ������ 5�� �����ϴ� �迭 10~99 ���� �������� �� ���� -> ��� �ϰ� �׸��� ���������ؼ� ������������ ����-> ���
	}

}
