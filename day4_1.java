import java.util.Scanner;

public class day4_1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);


		while(10<100) // ���ѷ���-> [��������]�� �ʿ���Ѵ�
		{
			System.out.println("Ȯ��");
			break; // �ڽ��� �����ִ� �ݺ����� �ٱ����� ������ ��� �̵��Ѵ�.
			       // �̰� ������ 'Ȯ��2'�� ������ �ʴ´�	
		}
		System.out.println("Ȯ��2");

		int i=1;
		while(i<=50) {
			System.out.print(i);
			i++;
			if(i==20) {
				break; // �����ǹ�if �ȿ� �ִ��� �ݺ��� �ٱ����� ������ ������ while ������ ������
			}
			
			System.out.println();
			
			// ¦���϶��� ������ּ���. break�� ����Ҷ��� �
		    // Ȧ���϶�, ��������ʰڽ��ϴ�. continue �� ����Ҷ��� �

			
			int c=1;
			while(c<=50) {
				c++;
				if(c%2==1)
				{
				continue; // �ڽ��� �ش�Ǿ��ִ� �ݺ����� ���ǽ����� ��� �̵���Ų��.(while(i<=50)���� �̵�)
				}
				System.out.print(c);
				
				
				//����1) ���� 1���Է� -> �� ������ ������� ��� continue ���
				
				System.out.print("���� �Է�: ");
				int num=sc.nextInt();
				int a=1;
			while(a<=num) {
				if(num%a==0) {
					System.out.print(i+" ");
				}
				i++;
			}
				//����2) ������ ������ �Է�  0�Է½� ��� ���� -> �׶� �׵��� �Է��ߴ� ������ ���հ� ���(�Ǽ�)�� �������
			}
		}
		
	}

}
