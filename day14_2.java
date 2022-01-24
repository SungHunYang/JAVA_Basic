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
      this(title,"���ڹ̻�");
   }
   Book(String title,String author){
      this.title=title;
      this.author=author;
      this.type="����";
      this.check=true;
      this.user="";
   }
   @Override
   public void re(String user) {
      if(this.user.equals(user)) {
         this.check=true;
         this.user="";
         System.out.println(user+"��, "+this.title+" �ݳ��Ϸ�!");
      }
      else {
         System.out.println("����� ����ġ�� �ݳ��Ұ���!");
      }
   }
   @Override
   public void bo(String user) {
      if(this.check) {
         this.check=false;
         this.user=user;
         System.out.println(user+"��, "+this.title+" �뿩�Ϸ�!");
      }
      else {
         System.out.println("�뿩���� �����Դϴ�...");
      }
   }
}
interface useBook{
   void re(String user);
   // main()���� å����� ��������̸� ��ġ Ȯ����
   // �ݳ�ó�� ����

   void bo(String user);
   // main()���� å���� Ȯ����,
   // check, �������ִٸ� ������̸����� �뿩 ����
   // �뿩���Դϴ�.
}

// ��������
class MajorBook extends Book{

   MajorBook(String title) {
      this(title,"���ڹ̻�");
   }

   MajorBook(String title, String author) {
      super(title, author);
      this.type="��������";
   }   
   public String toString() {
      return "["+this.title+"] ver21";
   }
}
// ��ȭå
class ComicBook extends Book{

   ComicBook(String title, String author) {
      super(title, author);
      this.type="��ȭå";
   }
   public String toString() {
      return "["+this.title+"/"+this.author+"]";
   }
}


public class day14_2 {

   public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);

      ArrayList<Book> al=new ArrayList();
      al.add(new MajorBook("JAVA�̾߱�"));
      al.add(new ComicBook("����","�۰�"));

      while(true) {

         System.out.print("�����Ͻðڽ��ϱ�?  ");
         String ans=sc.nextLine();
         if(ans.equals("no")) { // NO No
            break;
         }

         System.out.print("������̸��Է�: ");
         String user=sc.nextLine();

         do {
            int act;
            do {
               System.out.print("1.�뿩  2.�ݳ�  : ");
               act=sc.nextInt();
            }while(act<1 || 2<act);
            sc.nextLine();

            System.out.print("å�����Է�: ");
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

            System.out.print("��� �����Ͻðڽ��ϱ�?  ");
            ans=sc.nextLine();
         }while(ans.equals("yes")); // YES Yes y Y



      }

      Iterator itr=al.iterator();
      while(itr.hasNext()) {
         System.out.println(itr.next());
      }


   }

}