import java.util.Scanner;

public class day3_12 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("�ð�(H)�� �Է¹ްڽ��ϴ�");
		int hour=sc.nextInt();
		System.out.print("��(M)�� �Է¹ްڽ��ϴ�");
		int Min=sc.nextInt();


		if(Min<20)
		{hour--;
		Min+=40;}
		else
		{Min-=20;}

		{if(hour==1)
		{hour=12;}
		else if(hour==0)
		{hour=11;}
		else
		{--hour;}}

		System.out.println("�����"+hour+"��"+Min+"�� �Դϴ�");

	}

}
