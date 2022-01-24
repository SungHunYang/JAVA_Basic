import java.util.ArrayList;
import java.util.Scanner;

class Menu{
	String name;
	int price;
	Menu(String name, int price){
		this.name=name;
		this.price=price;
		System.out.println(this.name+"메뉴 등록완료!");
	}
	public String toString() {
		return this.name+": "+this.price+"원";
	}
}
class Person{
	String name;
	int phone;
	int check;
	int coupon;
	Person(String name, int phone){
		this.name=name;
		this.phone=phone;
		this.check=0;
		this.coupon=0;
		System.out.println(this.name+"님, 등록 완료");
	}
	void pay(int money) {
		if(this.coupon>0) {
			this.coupon--;
			System.out.println("쿠폰 결제");
			return;
		}
		money/=1000;
		this.check+=money;
		while(this.check>=10) {
			this.check-=10;
			this.coupon++;
			System.out.println("쿠폰 1장지급");
		}
		System.out.println("결제 완료");
	}
}

public class day13_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Menu> mL=new ArrayList(); // 메뉴 클래스 임을 보장
		ArrayList<Person> pL=new ArrayList();
		pL.add(new Person("홍길동",1234));
		mL.add(new Menu("아메리카노",2000));
		mL.add(new Menu("카페라떼",2500)); 
		// 객체생성없이 바로 저장--> 후에 인덱스넘버로 호출
		mL.add(new Menu("녹차라떼",3500));
		
		//1.메뉴추가 add()
		//2.메뉴삭제 remove()
		//3.메뉴수정  getter,setter
		//4.고객리스트 출력 -> foreach문
		
		while(true) {
			System.out.println();
			System.out.println("어서오세요! 카페입니다~!");
			System.out.println("==메뉴판==");
			for(int i=0; i<mL.size(); i++) {
				System.out.println((i+1)+"."+mL.get(i));
			}
			System.out.println("메뉴 번호 입력: ");
			int num=sc.nextInt();
			System.out.println("개수 입력: ");
			int cnt=sc.nextInt();
			sc.nextLine();
			int price=mL.get(num-1).price*cnt;
			System.out.println("총 금액은"+price+"원 입니다.");
			
			System.out.println();
		System.out.println("휴대폰 뒷자리 번호입력: ");
			int phone=sc.nextInt();
			boolean check=true;
			for(int i=0; i<pL.size();i++) {
				if(phone==pL.get(i).phone) {
					pL.get(i).pay(price);
					check=false;
					break;
				}
			}
			if(check) {
				System.out.println("신규 등록...");
				sc.nextLine();
				System.out.println("이름 등록: ");
				String name=sc.nextLine();
				pL.add(new Person(name,phone));
				pL.get(pL.size()-1).pay(price);
				
			}
			else{sc.nextLine();}
			System.out.println();
			System.out.println("추가주문하시겠습니까?");
			String ans=sc.nextLine();
			ans.toUpperCase();
			if(ans.equals("NO")) {
				break;
			}
		}
		
		

	}

}
