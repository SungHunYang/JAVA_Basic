import java.util.Scanner;

public class day2_2 {
 // ���� Ŭ���� ���� ù��°�� '�빮��' �빮�� �Ⱦ��� �Ǽ����� ���� �׷��ٴ°Ű� �ǹ��� �ƴ�
	public static void main(String[] args) {
		
		
		//[����������]
		//�ڵ����ǥ�� �ſ��߿�
		int num=10;
		
		num++;//���� ���� ������.�켱������ �ſ� ����   ������ 1��
		System.out.println(num);
		++num;//���� ���� ������.�켱������ �ſ� ����   ������ 1��
		System.out.println(num);
		
		System.out.println();
	      int a=10;
	      int b=a++; //���Կ�����,���������� �����ڰ� 2���� ���� �����ѵ� ����(�켱������ ����)�� ���� = -> ++
	      System.out.println("a="+a+", b="+b);
	// +�� �̾��ְ� "�� �ݾ��ִ°Ŵ� a�� �յڷ� �̾��ִϱ� ++ b�� �����̴ϱ� +�ϳ� ���ڿ� �ִ°��� �и��ϰ�("") �����Ѵٰ�(+) �����ϸ� �ȴ�
	      b=++a; //���Կ�����,���������� �����ڰ� 2���� ���� �����ϱ��� ����(�켱������ ����)�� ���� ++ -> =
	      System.out.println("a="+a+", b="+b);
	      // a         b
	      // 10        10 1.a=b     b=a++ -> 1.(b=a) 2. a++
	      // 11 2.a++               
	      // 12 3.++a  12 4.a=b     b=++a -> 3.++a   4. (b=a)
		
	      //[�񱳿�����] -> ���� ������ true,false�� ���ƿ�
	     int c=10;
	     int d=20;
	     System.out.println(c>d);
	     // > < >= <= == !=  !:NOT
	     
	     //[�� ������] -> true false �� ���� ���� 17 20
	     // && : and / || : or / ! : not
	     int e=10;
	     int f=20;
	     int g=30;
	     System.out.println(e<f && c<g);
	     System.out.println(e<f || c<g);
	     System.out.println(!(e<f));
	     
	     // ����3) ���ڸ��� (10~99) ������ 1�� �Է�  45�� �� ���ڸ��� 4�̰�, ���� �ڸ��� 5�Դϴ�
	     
	     
	     //[���� ������ == ���ǿ�����]
	     // ���ǽ� ? T : F 
	     int k=  10>5 ? 100:200;
	     System.out.println(k);
	     Scanner sc=new Scanner(System.in);
	     System.out.println("ù��° �־��ּ���");
	     int q=sc.nextInt();
	     System.out.println("�ι�° �־��ּ���");
	     int w=sc.nextInt();
	     int big= q>w ? q:w;
	     System.out.println("ū ������ "+big+"");
	     
	     // ����4) ������ 3�� �Է� �������� ���� ���

	}

}
