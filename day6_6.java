import java.util.Scanner;

public class day6_6 {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		int[][] stu=new int[3][2];
		
		for(int i=0; i<3; i++) {
			for(int a=0; a<2; a++) {
				System.out.println((i+1)+"�� �л� "+(a+1)+"��° ����:");
				stu[i][a]=sc.nextInt();
			}
		}
		for(int i=0; i<stu.length; i++) {
			int hap=0;
			double avg=0;
			for(int a=0; a<stu[i].length;a++) {
				hap+=stu[i][a];
			}avg=hap/stu[i].length;
			System.out.println((i+1)+"�� �л��� ����:"+hap);
			System.out.println((i+1)+"�� �л��� ���:"+avg);
		}
		for(int a=0; a<stu[0].length; a++) {
			int sum=0;
			for(int i=0; i<stu.length; i++) {
				sum+=stu[i][a];	
			}
			System.out.println((a+1)+"��° ������ ����:"+sum);
			System.out.println((a+1)+"��° ������ ���:"+sum*1.0/stu[0].length);
		}

	}

}
