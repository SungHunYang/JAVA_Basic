import java.util.ArrayList;
import java.util.Scanner;

public class day15_4 {

	public static void main(String[] args) {

		Exception ec=new Exception("���� �� �Է�");
		ArrayList<String> al=new ArrayList();
		al.add("ġŲ");
		al.add("�ʹ�");
		al.add("���");
		al.add("��â");
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("<< �޴��� ���� �ý��� >>");
		System.out.println();
		while(true) {

			System.out.println("1. ���  2. ���  3. ����  4. ����  5. ����");
			System.out.println("�Է�: ");
			num=sc.nextInt();
			try{
				if(num<0 || num>5) {
					throw ec;
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				break;
			}
			if(num==5) {
				break;
			}
			if(num==1) {
				System.out.println("�޴� ���");
				for(int i=0; i<al.size(); i++) {
				System.out.println((i+1)+". "+al.get(i));
				System.out.println();}
			}
			else if(num==2) {
				System.out.println("�޴� ���");
				sc.nextLine();
				String a=sc.nextLine();
				al.add(a);
				System.out.println(a+", ���");
				System.out.println();
			}
			else if(num==3) {
				System.out.println("�޴� ����");
				System.out.println("��ȣ �Է�: ");
				int cnt=sc.nextInt();
				sc.nextLine();
				try {
				if(num<1 || al.size()<num) {
					throw ec;
				}}
				catch(Exception e) {
					cnt=1;
					System.out.println(e.getMessage());
				}
			System.out.println("����޴�: "+al.get(cnt-1));
				System.out.println("������ �޴� : ");
				String a=sc.nextLine();
				al.remove(cnt-1);
				al.add(cnt-1,a);
			}
			else if(num==4) {
				System.out.println("�޴� ����");
				System.out.println("�����ϰ� ���� ��ȣ: ");
				int a=sc.nextInt();
				al.remove(a-1);
				System.out.println();
			}

		}
	}

}
