import java.util.ArrayList;
import java.util.Scanner;

public class day15_4 {

	public static void main(String[] args) {

		Exception ec=new Exception("범위 외 입력");
		ArrayList<String> al=new ArrayList();
		al.add("치킨");
		al.add("초밥");
		al.add("돈까스");
		al.add("곱창");
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("<< 메뉴판 관리 시스템 >>");
		System.out.println();
		while(true) {

			System.out.println("1. 출력  2. 등록  3. 수정  4. 삭제  5. 종료");
			System.out.println("입력: ");
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
				System.out.println("메뉴 출력");
				for(int i=0; i<al.size(); i++) {
				System.out.println((i+1)+". "+al.get(i));
				System.out.println();}
			}
			else if(num==2) {
				System.out.println("메뉴 등록");
				sc.nextLine();
				String a=sc.nextLine();
				al.add(a);
				System.out.println(a+", 등록");
				System.out.println();
			}
			else if(num==3) {
				System.out.println("메뉴 수정");
				System.out.println("번호 입력: ");
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
			System.out.println("현재메뉴: "+al.get(cnt-1));
				System.out.println("수정할 메뉴 : ");
				String a=sc.nextLine();
				al.remove(cnt-1);
				al.add(cnt-1,a);
			}
			else if(num==4) {
				System.out.println("메뉴 삭제");
				System.out.println("삭제하고 싶은 번호: ");
				int a=sc.nextInt();
				al.remove(a-1);
				System.out.println();
			}

		}
	}

}
