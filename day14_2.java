import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

abstract class Book implements useBook{
   String title;
   String author;
   String type;
   boolean check;
   String user;
   Book(String title){
      this(title,"작자미상");
   }
   Book(String title,String author){
      this.title=title;
      this.author=author;
      this.type="종류";
      this.check=true;
      this.user="";
   }
   @Override
   public void re(String user) {
      if(this.user.equals(user)) {
         this.check=true;
         this.user="";
         System.out.println(user+"님, "+this.title+" 반납완료!");
      }
      else {
         System.out.println("사용자 불일치로 반납불가능!");
      }
   }
   @Override
   public void bo(String user) {
      if(this.check) {
         this.check=false;
         this.user=user;
         System.out.println(user+"님, "+this.title+" 대여완료!");
      }
      else {
         System.out.println("대여중인 도서입니다...");
      }
   }
}
interface useBook{
   void re(String user);
   // main()에서 책제목과 빌린사람이름 일치 확인후
   // 반납처리 진행

   void bo(String user);
   // main()에서 책제목 확인후,
   // check, 빌릴수있다면 사용자이름으로 대여 진행
   // 대여중입니다.
}

// 전공서적
class MajorBook extends Book{

   MajorBook(String title) {
      this(title,"작자미상");
   }

   MajorBook(String title, String author) {
      super(title, author);
      this.type="전공서적";
   }   
   public String toString() {
      return "["+this.title+"] ver21";
   }
}
// 만화책
class ComicBook extends Book{

   ComicBook(String title, String author) {
      super(title, author);
      this.type="만화책";
   }
   public String toString() {
      return "["+this.title+"/"+this.author+"]";
   }
}


public class day14_2 {

   public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      ArrayList<Book> al=new ArrayList();
      al.add(new MajorBook("JAVA이야기"));
      al.add(new ComicBook("제목","작가"));

      while(true) {

         System.out.print("입장하시겠습니까?  ");
         String ans=sc.nextLine();
         if(ans.equals("no")) { // NO No
            break;
         }

         System.out.print("사용자이름입력: ");
         String user=sc.nextLine();

         do {
            int act;
            do {
               System.out.print("1.대여  2.반납  : ");
               act=sc.nextInt();
            }while(act<1 || 2<act);
            sc.nextLine();

            System.out.print("책제목입력: ");
            String title=sc.nextLine();

            for(int i=0;i<al.size();i++) {
               if(al.get(i).title.equals(title)) {
                  if(act==1) {
                     al.get(i).bo(user);
                  }
                  else {
                     al.get(i).re(user);
                  }
                  break;
               }
            }

            System.out.print("계속 진행하시겠습니까?  ");
            ans=sc.nextLine();
         }while(ans.equals("yes")); // YES Yes y Y



      }

      Iterator itr=al.iterator();
      while(itr.hasNext()) {
         System.out.println(itr.next());
      }


   }

}