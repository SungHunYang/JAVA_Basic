
public class day5_1 {

	public static void main(String[] args) {
		
		//[�迭]
		// 1) �ڷ���(date type)
		// 2) ����� ����.ũ��.����
		int[] arr= {10,20,30,40,50,}; // ó������ �����Ҽ��� �ִ�.
		int[] test=new int[3]; // �迭�� �⺻ ��� '����(3)'�� �����̴�.
		// �ε��̹���� �̿�     index-> ��������(����)���� ���ڸ� �ο�
		// index��ȣ�� [0]������ ����!
		//System.out.println(test); �迭�� �̸����� ����ϸ� �̻��� ���� ���� �̷��� �ϸ� �ȵ�
		test[0]=40;
		test[1]=50;
		test[2]=60;
		System.out.print(test[0]);
		System.out.print(test[1]);
		System.out.print(test[2]);
		// System.out.println(test[3]); �̰� �����ϸ� �ε����� ������ ����ٰ� ������ ����
		
		// �迭�� ��������� ����
		// 1.����� �����͵��� ���� ������ �־����
		// 2.���� ���� �ڷ����̾����
		System.out.println();
		System.out.println("�迭�Ǳ��̴�"+test.length);
		for(int i=0; i<test.length; i++) // ���� i<3�̶�� ���ϰ� test.length�� ���̷� �ص� �ȴ�.
		{
			System.out.println("���� "+(i+1)+"��° ���輺����"+test[i]+"���Դϴ�.");
		}
		
		//����1) 5���� ���������͸� �����ϴ� data[]�迭�� ������ּ���!
		// ���� 5���� ���������͸� �Է¹ް�, ������ּ���
		
		
		

	}

}
