import java.util.Scanner;

public class day3_7 {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.���ϴ� ������ �Է����ּ���: ");
		int a=sc.nextInt();
		System.out.println("2.���ϴ� ������ �Է����ּ���: ");
		int b=sc.nextInt();
		
		if(a>b) {
			// a������� ���� b�� ����� ���� ��ȯ�Ѵ�
			//[�ӽ����庯��]�� �ʿ���ϴ� -> ��ȯ �˰���
			int temp=0;
			temp=a;
			a=b;
			b=temp;// temp�� if ��Ͽ��� ���� �Ǿ��� ������ if ���ܿ����� ��� �����ϰ� ������ ������ ��� x
		}
		
		
		
		/*int max=a>b? a:b;
		int min=a<b? a:b;*/ // �̰͵� �ϳ��� ����̴�
		
		int i=a;
		while(i<=b)
		{
			System.out.print(i+" ");
			i++;
		
		}
		System.out.println();
		System.out.print(i);

	}

}
