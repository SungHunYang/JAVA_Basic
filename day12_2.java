import java.util.Scanner;

class Book{
	Scanner sc=new Scanner(System.in);
	String name;
	String book;
	boolean rent;
	int cnt;
	Book(String book, String name){
		this(book, name, true);
		System.out.println(this.book+" 등록");
	}
	Book(String book, String name, boolean rent){
		this.book=book;
		this.name=name;
		this.rent=rent;
		System.out.println(this.book+" 등록");
	}
	void borrow() {
		System.out.println("책을 빌리시겠습니까?");
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
			System.out.println("대여 가능");
			System.out.println("반납은 2일내로 부탁드립니다.");
			this.rent=true;
		}
		else if(this.rent=false) {
			this.rent=false;
			System.out.println(this.book+"은 대여중 입니다.");
			System.out.println("다음에 다시 찾아주세요");
		}
		
	}
	public String toString(){
		return "["+this.book+":"+this.name+"]";
	}
}

public class day12_2 {

	public static void main(String[] args) {
		
		System.out.println("==도서관 프로그램==");
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("도서관에 책이 몇권 있나요?");
		int N=sc.nextInt();
		sc.nextLine();
		
		Book[] a=new Book[N];
		
		for(int i=0; i<N; i++) {
		 System.out.println((i+1)+"번째 책 입력..");
		 System.out.print("책 제목: ");
		 String book=sc.nextLine();
		 System.out.print("작가: ");
		 String name=sc.nextLine();
		 a[i]=new Book(book, name);
		}
		
		while(true) {
			System.out.println("책을 빌리시겠습니까?");
			String act=sc.nextLine();
			if(act.equals("No") || act.equals("no")|| act.equals("NO") ) {
				break;
			}
			// String 은 클래스 기반이다. 그래서 자료형들과 조금은 다르다.
			// 따라서 비교 연산자가 아니라 equals을 썻다. 비교연산자 쓰면 =="No"못알아본다.
			System.out.print("책 제목: ");
			String book=sc.nextLine();
			
			for(int i=0; i<N; i++) {
				if(book.equals(a[i].name)) {
					//대여체크
					a[i].show();
					break;
				}
			}System.out.println("그런 책 없어요ㅎㅎ");
			
			// 향상된 for문 ?
			for(Book v:a) {
				if(book.equals(v.name)) {
					//대여체크
					v.show();
					break;}
			}
		}
		

	}

}
