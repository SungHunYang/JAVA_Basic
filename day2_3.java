import java.util.Scanner;

public class day2_3 {

	public static void main(String[] args) {
		// [���]

		// [���ǹ�]
		// : ~�Ҷ�.��������.Ư������.�б���

		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num=sc.nextInt();
		
		if(num%12==0)  // if�� ����ϸ� if���� ���� �����ʰ� �ٸ� ����ó�� ����Ѵ�.
		{System.out.println("12�ǹ���Դϴ�");}
		if(num%2==0) // if(���ǽ�) �ش����ǽ��� ����� T�̸� {}�ȿ� ���๮�� ����
		{System.out.print("¦���Դϴ�");}
		else// �ڽŰ� ���尡��� if�͸� ¦��� �ϳ��� if���� �����Ѵ�
		{System.out.print("Ȧ���Դϴ�");}
		//ctrl+A(��ü����) -> ctrl+I(������)
		
		if(num%12==0)  // else if�� �Ǹ� 3���� if�� ����ȴ�. if�� T�̸� ����� if���� ��� ����
		{System.out.println("12�ǹ���Դϴ�");}
		else if(num%2==0) // if�� F�� else if�� �����
		{System.out.print("¦���Դϴ�");}
		else
		{System.out.print("Ȧ���Դϴ�");}
		
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a<b && a<c) {
			System.out.println(a);}
		else if(b<a && b<c) {
			System.out.println(b);}
		else {System.out.println(c);}
		
	//����5) �Ǽ� 3�� �Է� ���� ū �Ǽ��� ���
	
		//����1) �����Է��ϼ���. (0~100) 80~100 A 50~79 B 0~49 F ��� 
        //����2) ��������� �˷��ִ� ���α׷�    �����Է�: 8���� or 65�̻� 0�� , 20����: 800�� , ������ 1200��
		//����3) H��M�� �Է� -> 1�ð� 20������ ��� ex) 12:30->11:10
		  // 1~12 / 0~59   1:10-> 11:50 �̷��� ������ 
		
		//coding_helper@naver.com 
		//[JAVA ����Ư��]
	}
	





		// [�ݺ���]
		// : ����������.�����ϰ�.Nȸ.N��.Ư�������϶� ���





	}


