import java.util.Scanner;

public class day2_8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("���� ū �Ǽ��� ã���ϴ� ");
		System.out.print("Ȯ���ϰ���� ù��° �Ǽ��� �־��ּ���: ");
		double a=sc.nextDouble();
		System.out.print("Ȯ���ϰ���� �ι�° �Ǽ��� �־��ּ���: ");
		double b=sc.nextDouble();
		System.out.print("Ȯ���ϰ���� ����° �Ǽ��� �־��ּ���: ");
		double c=sc.nextDouble();

		if(a>b && a>c)
		{System.out.print(a+"�� ����ū�Ǽ��Դϴ�");}
		else if(b>a && b>c)
		{System.out.print(b+"�� ����ū�Ǽ��Դϴ�");}
		else
		{System.out.print(c+"�� ����ū�Ǽ��Դϴ�");}
	}

}
