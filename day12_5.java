import java.util.Scanner;

class Book1{
   String name;
   String author;
   boolean check;
   Book1(String name,String author){
      this.name=name;
      this.author=author;
      this.check=true;
      System.out.println(this.name+", ��ϿϷ�!");
   }
   public String toString() {
      return "["+this.name+":"+this.author+"]";
   }
   void act() {
      if(this.check) {
         System.out.println(this);
         this.check=false;
         System.out.println("�ݳ��� 2�ϳ��� ��Ź�帳�ϴ�.");
      }
      else {
         System.out.println(this.name+"��(��) �뿩���Դϴ�.");
         System.out.println("������ �ٽ� ã���ּ���...");
      }
   }
}


public class day12_5 {

   public static void main(String[] args) {
      
      System.out.println("==������ ���α׷�==");
      System.out.println();
      
      Scanner sc=new Scanner(System.in);
      System.out.print("�������� å�� ����ֳ���? ");
      int N=sc.nextInt();
      sc.nextLine();
      
      Book1[] book=new Book1[N];
      
      for(int i=0;i<N;i++) {
         System.out.println((i+1)+"��° å�Է�...");
         System.out.print("å����: ");
         String name=sc.nextLine();
         System.out.print("�۰�: ");
         String author=sc.nextLine();
         book[i]=new Book1(name,author);
      }
      
      while(true) {
         System.out.println();
         System.out.print("å�� �����ðڽ��ϱ�? ");
         String ans=sc.nextLine();
         if(ans.equals("NO") ||ans.equals("No") || ans.equals("no")) {
            break;
         }
         
         System.out.println();
         System.out.print("å����: ");
         String name=sc.nextLine();
         boolean check=true;
         for(int i=0;i<N;i++) {
            if(name.equals(book[i].name)) {
               check=false;
               book[i].act();
               break;
            }
         }
         
         if(check) {
            System.out.println("�Է��Ͻ� å�� �����ϴ�.");
         }
         
         
         
      }
      
      
      
      
      
      
      
      
      
      
      
      
      

   }

}