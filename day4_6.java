import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class day4_6 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("����� �հ踦 ���մϴ�.");
		System.out.println("���Ḧ ���ϸ� '0'�� �����ּ���");
		for(int i=1; i<=10; i++) {
			System.out.print("������ �Է�:");
			int a=sc.nextInt();
			if(a==0) {
				break;
			}
			else if(a<0) {
				continue;
			}
				sum+=a;
		}
		System.out.print("����:"+sum);

	}

}
