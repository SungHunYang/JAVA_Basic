import java.util.InputMismatchException;
import java.util.Scanner;

public class day15_5 {

	public static void main(String[] args) {

		int res=10;
		int num;
		int act;
		Scanner sc=new Scanner(System.in);

		Exception ec=new Exception("������ �Է�");
		
		while(true) {

			System.out.println("1. ���ϱ�  2. ����  3. ����");	
			try {
				act=sc.nextInt();
				if(act<1 || 3<act) {
					throw ec;
				}}
				catch(Exception e) {
					System.out.println(e.getMessage());
					break;
				}

			if(act==3) {
				break;
			}
			
			System.out.println("���� �Է�: ");
			try{
				num=sc.nextInt();
			}
			catch(Exception e) {
				sc.nextLine();
				num=0;
			}
			if(act==1) {
				res+=num;
			}
			else {
				res-=num;
			}
			System.out.println("���� res= "+res);
		}

	}

}
