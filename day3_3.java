import java.util.Scanner;

public class day3_3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
			// �߸��� ���� ������ �ٽ� �޴����� ���ü� �ֵ��� �����
			// while�� : ��������ó��-> �ּҼ���Ƚ���� 0��(�ѹ��� ������ϰ� �Ҽ��ִ�)
            //do-while��: ��ó�� �� ���� -> �ּ�����Ƚ���� 1��(�ݵ�� �ѹ��� �����Ѵ�)
		int act;
		do{
		System.out.println("===�޴���===");
		System.out.println("1.�Ƹ޸�ī��");
		System.out.println("2.ī���");
		System.out.println("3.����Ǫġ��");
		act=sc.nextInt();	
	}while(act<1 || 3<act);

		
		// ����333) �н���  1.������ 2.���� 3.�      ���н� ���Է�/    �Է� ������  1. ~ ���Խ��ϴ� ���
	}
}

