import java.util.Scanner;

public class day3_1 {

	public static void main(String[] args) {

		// switch
		Scanner sc=new Scanner(System.in);

		System.out.print("���� �Է�: ");
		int num=sc.nextInt();

		switch(num) // () �ȿ� ����(or ��)�� �Է�
		{

		case 1:  
// case�� �ؿ��ִ� �鿩����(���� case 1�� ����Ǹ� break�� ���ٸ� 17~26�� ���)�� ��� �����Ѵ� 
			System.out.println("�ϳ�");
			break; // break�� ������ �Ͽ��ִ°� �������� �ʰ� switch�� ������ ������
		case 2: 
			System.out.println("��");
			break;
		case 3: 
			System.out.println("��");
			break;
		default: // else�� �����ϴ�
			System.out.println("�ش����");

			
//���� �׼��� if�� ���� (�����Է°�����), ��ư���� switch�� ����(ARS ������)
			// String nextLine(), char c=sc.nextLine().charAt(0)
			
			//����1)int a=10; ,int b=20;  c '+' switch �Ἥ ���� �����
			// ����2) ���� 1�� �Է� ¦��/Ȧ��
			// ����3) R/G/Y(���Ϲ��� 1�� �Է�) R : ���� Y:���� G : ����
		}


	}

}
