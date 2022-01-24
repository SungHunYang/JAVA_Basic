import java.util.Scanner;

class Book1{
   String name;
   String author;
   boolean check;
   Book1(String name,String author){
      this.name=name;
      this.author=author;
      this.check=true;
      System.out.println(this.name+", 등록완료!");
   }
   public String toString() {
      return "["+this.name+":"+this.author+"]";
   }
   void act() {
      if(this.check) {
         System.out.println(this);
         this.check=false;
         System.out.println("반납은 2일내로 부탁드립니다.");
      }
      else {
         System.out.println(this.name+"는(은) 대여중입니다.");
         System.out.println("다음에 다시 찾아주세요...");
      }
   }
}


public class day12_5 {

   public static void main(String[] args) {
      
      System.out.println("==도서관 프로그램==");
      System.out.println();
      
      Scanner sc=new Scanner(System.in);
      System.out.print("도서관에 책이 몇권있나요? ");
      int N=sc.nextInt();
      sc.nextLine();
      
      Book1[] book=new Book1[N];
      
      for(int i=0;i<N;i++) {
         System.out.println((i+1)+"번째 책입력...");
         System.out.print("책제목: ");
         String name=sc.nextLine();
         System.out.print("작가: ");
         String author=sc.nextLine();
         book[i]=new Book1(name,author);
      }
      
      while(true) {
         System.out.println();
         System.out.print("책을 빌리시겠습니까? ");
         String ans=sc.nextLine();
         if(ans.equals("NO") ||ans.equals("No") || ans.equals("no")) {
            break;
         }
         
         System.out.println();
         System.out.print("책제목: ");
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
            System.out.println("입력하신 책은 없습니다.");
         }
         
         
         
      }
      
      
      
      
      
      
      
      
      
      
      
      
      

   }

}