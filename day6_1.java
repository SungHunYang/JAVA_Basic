import java.util.Scanner;

public class day6_1 {

	public static void main(String[] args) {
		
		//[�������迭]
		//[2�����迭]
		
		int[][] stu2=new int[3][2];
		
		int[][] stu= {{10,20,30}, {11,12,13}, {1,2,3}, {1,2,3}}; 
		// �������迭, ������ -> ���� �ٸ� ���� Ƚ���� �������� ����������
		for(int a=0; a<4; a++) {
		System.out.println((a+1)+"���л���");
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"���輺��:"+stu[a][i]); // a�� i�� ����(�յ�)�� �߿���
		}System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<stu2.length; i++) {
			// ���⼭ ���̴� �л��� ����(3)
			System.out.println((i+1)+"���л���");
			for(int a=0; a<stu2[i].length; a++) {
				// ���⼭ ���̴� �л��� �������ִ� �������� ����(2)
				System.out.println((a+1)+"���輺��:");
				stu2[i][a]=sc.nextInt();
				//����1) 1���л��� ���� ��� / 2���� ���� ��� / 3���� �������
			}
		}
	}
}
