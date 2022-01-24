import java.util.Scanner;

abstract class Phone implements usePhone{
   String name;
   private int pw;
   boolean mode;
   
   public int getPw() {
      return pw;
   }
   public void setPw(int pw) {
      this.pw = pw;
   }
   
   Phone(String name){
      this(name, 1111, false);
   }
   Phone(String name,int pw,boolean mode){
      this.name=name;
      this.pw=pw;
      this.mode=mode;
   }
   @Override
   public boolean isMode() {
      return this.mode;
   }
   public abstract void show();
   @Override
   public void changePW() {
      Scanner sc=new Scanner(System.in);
      if(this.isMode()) {
         System.out.print("비번입력: ");
         int pw=sc.nextInt();
         if(this.pw!=pw) {
            System.out.println("비번불일치!");
            return;
         }
      }
      System.out.print("바꿀번호입력: ");
      int pw=sc.nextInt();
      this.setPw(pw);
      System.out.println("비번변경완료!");
   }
}
interface usePhone{
   boolean isMode();
   void show();
   void changePW();
}


class IPhone extends Phone{

   IPhone(String name) {
      super(name);
      // TODO Auto-generated constructor stub
   }
   IPhone(String name, int pw, boolean mode) {
      super(name, pw, mode);
      // TODO Auto-generated constructor stub
   }
   
   @Override
   public void show() {
      System.out.println("아이폰입니다.");
   }
   
}

public class day11_6 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      
      IPhone i=new IPhone("아무무",4567,true);
      i.changePW();
      i.show();

      
      
      
      
      
   }

}