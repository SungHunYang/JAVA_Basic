import java.util.Scanner;

class Book{
	Scanner sc=new Scanner(System.in);
	String name;
	String book;
	boolean rent;
	int cnt;
	Book(String book, String name){
		this(book, name, true);
		System.out.println(this.book+" ���");
	}
	Book(String book, String name, boolean rent){
		this.book=book;
		this.name=name;
		this.rent=rent;
		System.out.println(this.book+" ���");
	}
	void borrow() {
		System.out.println("å�� �����ðڽ��ϱ�?");
		String act=sc.nextLine();
		if(act=="Yes" || act=="yes" || act=="YES") {
			show();
			return;
		}
	}
	void show() {
		if(this.rent) {
			System.out.println(this);
			//System.out.println("["+this.book+":"+this.name+"]");
			System.out.println("�뿩 ����");
			System.out.println("�ݳ��� 2�ϳ��� ��Ź�帳�ϴ�.");
			this.rent=true;
		}
		else if(this.rent=false) {
			this.rent=false;
			System.out.println(this.book+"�� �뿩�� �Դϴ�.");
			System.out.println("������ �ٽ� ã���ּ���");
		}
		
	}
	public String toString(){
		return "["+this.book+":"+this.name+"]";
	}
}

public class day12_2 {

	public static void main(String[] args) {
		
		System.out.println("==������ ���α׷�==");
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�������� å�� ��� �ֳ���?");
		int N=sc.nextInt();
		sc.nextLine();
		
		Book[] a=new Book[N];
		
		for(int i=0; i<N; i++) {
		 System.out.println((i+1)+"��° å �Է�..");
		 System.out.print("å ����: ");
		 String book=sc.nextLine();
		 System.out.print("�۰�: ");
		 String name=sc.nextLine();
		 a[i]=new Book(book, name);
		}
		
		while(true) {
			System.out.println("å�� �����ðڽ��ϱ�?");
			String act=sc.nextLine();
			if(act.equals("No") || act.equals("no")|| act.equals("NO") ) {
				break;
			}
			// String �� Ŭ���� ����̴�. �׷��� �ڷ������ ������ �ٸ���.
			// ���� �� �����ڰ� �ƴ϶� equals�� ����. �񱳿����� ���� =="No"���˾ƺ���.
			System.out.print("å ����: ");
			String book=sc.nextLine();
			
			for(int i=0; i<N; i++) {
				if(book.equals(a[i].name)) {
					//�뿩üũ
					a[i].show();
					break;
				}
			}System.out.println("�׷� å ����䤾��");
			
			// ���� for�� ?
			for(Book v:a) {
				if(book.equals(v.name)) {
					//�뿩üũ
					v.show();
					break;}
			}
		}
		

	}

}
