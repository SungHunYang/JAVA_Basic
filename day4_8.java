import java.util.Scanner;

public class day4_8 {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int even=0;
		int odd=0;
		int a=0;
		for(int i=0; i<10; i++) {
			System.out.println("�����Է�: ");
			a=sc.nextInt();
			if(a<=0) {
				System.out.println("���Է�");
			    i--; // continue ������ ī��Ʈ ���� �ʰ� Ƚ���� �ѹ� �����ش�.
 				continue;} // continue�� if�� �ٱ��� ������ ���ǿ� ������� ��� ������ �Ǽ� ��������� 
			
			if(a%2==0) {
				even++;
			}
			else if(a%2!=0) {
				odd+=a;
			}
			
		}
		System.out.println("¦���ǰ���:"+even);
		System.out.println("Ȧ������:"+odd);
		

	}

	//while�� ����ϸ�
	  int c=0;
      int sum=0;
      int cnt=0;
      
      while(c<5) {
         System.out.print("�����Է�: ");
         int num=sc.nextInt();
         if(num<=0) {
            System.out.println("���Է�!");
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
      
      System.out.println("Ȧ�� ������ "+sum+"�̰�,¦�� ������ "+cnt+"���Դϴ�.");

}
