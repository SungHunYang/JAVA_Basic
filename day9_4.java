import java.util.Scanner;

class Game{
   String name;
   static int sand=100; // 100에서 시작
   boolean game() {
      Scanner sc=new Scanner(System.in);
      System.out.println("현재 모래: "+this.sand);
      System.out.print(this.name+"님의 차례입니다. 입력: ");
      int sand=sc.nextInt();
      this.sand-=sand;
      // this.sand가 0이하가되면 즉시 게임은 종료되며,
      // 이때 술래의 이름을 출력해주세요!~~
      if(this.sand<=0) {
         System.out.println(this.name+"님, 술래!");
         return true;
      }
      return false;
   }
   Game(String name){
      this.name=name;
   }
}
public class day9_4{

   public static void main(String[] args) {

      /*
      Game g1=new Game("홍길동");
      Game g2=new Game("임꺽정");
       */
      Scanner sc=new Scanner(System.in);

      System.out.print("몇명이 게임을 하나요? ");
      int cnt=sc.nextInt();
      sc.nextLine(); // ☆ // >> String은 이렇게 써야 쓰레기값이 처리됨!
      Game[] g=new Game[cnt]; // 객체배열 생성완료 // Game[] << 객체 배열  //객체들을 배열로 묶을수 있다.

      for(int i=0;i<cnt;i++) {
         System.out.print("이름입력: ");
         String name=sc.nextLine();
         g[i]=new Game(name);
      }

      while(true) {
         System.out.println();
         System.out.print("누가 게임할까? ");
         int num=sc.nextInt();
         if(g[num-1].game()) {
            break;
         }
         /*
         if(g1.game()) { // 술래가 결정된다면,
            break;
         }
          */
      }

   }

}