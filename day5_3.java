import java.util.Random;

public class day5_3 {

	public static void main(String[] args) {
		
		int[] data=new int[5];
		
		Random rand=new Random();
     // �������   �̸�     -> import ����� �ȴ�. shift+ctrl+O
		for(int i=0; i<data.length; i++) {
			data[i]=rand.nextInt(6)+1; 
			// 0~5�߿��� (6������) �������� 1���� �̾��ּ��� -> rand.nextInt(6)
			// 0~5  -> +1   ->1~6  ->rand.nextInt(6)+1
			// rand.nextInt(������ ������)+��������		
		}
		System.out.print("[");
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}System.out.print("]");
		
		// ����2) ������ 10�� �����ϴ� �迭 1~10���� ������ �� ����  1�� � 2�� � 3�� � ���� ���
	}

}
