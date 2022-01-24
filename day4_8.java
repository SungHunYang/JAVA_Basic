import java.util.Scanner;

public class day4_8 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int even=0;
		int odd=0;
		int a=0;
		for(int i=0; i<10; i++) {
			System.out.println("정수입력: ");
			a=sc.nextInt();
			if(a<=0) {
				System.out.println("재입력");
			    i--; // continue 됬을때 카운트 되지 않게 횟수를 한번 없애준다.
 				continue;} // continue를 if문 바깥에 적으면 조건에 상관없이 계속 만나게 되서 쓸모없어짐 
			
			if(a%2==0) {
				even++;
			}
			else if(a%2!=0) {
				odd+=a;
			}
			
		}
		System.out.println("짝수의개수:"+even);
		System.out.println("홀수의합:"+odd);
		

	}

	//while을 사용하면
	  int c=0;
      int sum=0;
      int cnt=0;
      
      while(c<5) {
         System.out.print("정수입력: ");
         int num=sc.nextInt();
         if(num<=0) {
            System.out.println("재입력!");
            continue;
         }
         c++;
         if(num%2==1) {
            sum+=num;
         }
         else {
            cnt++;
         }
      }
      
      System.out.println("홀수 총합은 "+sum+"이고,짝수 개수는 "+cnt+"개입니다.");

}
