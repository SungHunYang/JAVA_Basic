import java.util.Scanner;

public class day4_4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int result=0;
		double average=0;
		System.out.println("������ ���ϸ� '0'�� �Է����ּ���.");
		while(true) {
			System.out.print("������ �Է�: ");
			int num=sc.nextInt();
			if(num==0) {
				System.out.println("����:"+result);
				System.out.println("���:"+average);
				break;
			}
			cnt++;
			result+=num;
			average=(double)result/cnt; 
			// ����ȯ int/int = int�̱⶧���� average�� �Ǽ����� ������ �� ���� int/int=�Ǽ��� �ٲ��ش�
			// �̷� ����� ����ȯ�� result*1.0/cnt -> 1.0�� �����ָ鼭 �Ǽ��� �Ǿ����
		}
		

	}

}
