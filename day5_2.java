import java.util.Scanner;

public class day5_2 {

	public static void main(String[] args) {

		//�ݿ� �л��� 5�� // �������� (���� 0~100) // ����,��������� ��� 
		// ���(�Ǽ�)�������� ���������� ���� �л��� ��ȣ ���

		int[] stu=new int[5];
		Scanner sc=new Scanner(System.in);

		for(int i=0; i<stu.length; i++) {
			do{
				System.out.println((i+1)+"�� �л��� ���� �Է�: ");
				stu[i]=sc.nextInt();
			}while(stu[i]<0 || stu[i]>100); 
// 13���� �������� 18���� ��ƾ� �ϴµ� do while�� ���н� 14�� ����(do while ��Ͼȿ����� ����)���� ���� i���� ���̰�� �ݺ��ȴ�.
		}
		System.out.println();
		System.out.println("�Է¿Ϸ�!");
		System.out.println();
		
		int sum=0;
		double avg;
		for(int i=0; i<stu.length; i++) {
			sum+=stu[i];
		}
		avg=sum*1.0/5;// sum�� ����� ���� ���� ������ ������ for�� �ۿ� �־����
		System.out.println("�հ�:"+sum+" ���:"+avg);
		for(int i=0; i<stu.length; i++) {
			if(stu[i]>=avg) {
				System.out.println("��պ��� ���� ���̴�"+(i+1)+"�л��̴�");
			}
				
		}
		
	}

}
