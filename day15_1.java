public class day15_1 {

	public static void main(String[] args) {

		// [����] -- exception
		// �ڵ��(������) ������ ��������,
		// ������ �����ϴ� �������� �߻��ϴ� ����
		// -> ���α׷� ����� -> ���α׷��� ������ �����ϴ°� �Ұ���
		
		// ���ܴ� ���� Ŭ������ �̹� ���ǵǾ�����
		// �ֻ��� ����Ŭ����==Exception

		// ���ܴ� ���� Ŭ������ �̹� ���ǵǾ� ����

		// ���α׷��� ������ �����Ҽ��ֵ����ϴ� [����ó��]
		//try-catch��


		int a=10;
		int b=0;
		int arr[]= {1,2,3,4,5};
		int index=5;
		while(true) {
			try {
				// ���ܰ� �߻��Ҽ� �ִ¹��� ����
				System.out.println("��");
				System.out.println(a/b);
				// �ڱ⿡�� �´� catch������ ����.
				System.out.println("������ ����� ����"+arr[index]); 
				// �갡 ����  --> try������ ���ܰ� �߻��Ѵٸ�, "���" �ش��ϴ� catch������ �̵�
				System.out.println("����");
				// �� �� ������ ������ �߻��ؼ� catch������ ���� �� ������ �ȳ���
				break;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				// ���ܰ� �߻��ϰ� �Ǹ� ����� ���� �̵�
				index=0;
				System.out.println("Ȯ��1 :"+arr[index]);
				System.out.println(e.getMessage());
			}
			catch(ArithmeticException e) {
				b=1;
				System.out.println("Ȯ��2: "+(a/b));
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("�ֻ��� ���� Ŭ����");
				// ���������� �� ������ ���� �Ʒ��� ���� �̰� ���������� �ؿ��� �������� ����.
				// ���� �ֻ����� �׻� ���� �Ʒ��� ����ߵȴ�.
			}
			finally {
				// ���ܰ� �߻��ϵ� ���ϵ� ����� �鸲
				System.out.println("ȫ�浿");
			}
		} // ����1) 1.���ϱ� 2.���� 3. ����  int res=10
		  //       �Է� : 1  -> ���� �Է�: 20 ���� res=30
		  //       �Է� : 2 -> �����Է�: 1 ���� res=29
		  //       �Է� : 3 -> ����
		  //        ������ �߸��Ǹ� ���Է��� �����ְ�, Ÿ���� �߸� ������ �������
		  //       �Է�: 3.14 Ÿ���� �߸��Ǹ� 0�� �Է��Ѱ�ó�� ���ϱ�/���⸦ ����
	}

}
