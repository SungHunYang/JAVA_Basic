import java.util.Scanner;

class Game{
   String name;
   static int sand=100; // 100���� ����
   boolean game() {
      Scanner sc=new Scanner(System.in);
      System.out.println("���� ��: "+this.sand);
      System.out.print(this.name+"���� �����Դϴ�. �Է�: ");
      int sand=sc.nextInt();
      this.sand-=sand;
      // this.sand�� 0���ϰ��Ǹ� ��� ������ ����Ǹ�,
      // �̶� ������ �̸��� ������ּ���!~~
      if(this.sand<=0) {
         System.out.println(this.name+"��, ����!");
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
      Game g1=new Game("ȫ�浿");
      Game g2=new Game("�Ӳ���");
       */
      Scanner sc=new Scanner(System.in);

      System.out.print("����� ������ �ϳ���? ");
      int cnt=sc.nextInt();
      sc.nextLine(); // �� // >> String�� �̷��� ��� �����Ⱚ�� ó����!
      Game[] g=new Game[cnt]; // ��ü�迭 �����Ϸ� // Game[] << ��ü �迭  //��ü���� �迭�� ������ �ִ�.

      for(int i=0;i<cnt;i++) {
         System.out.print("�̸��Է�: ");
         String name=sc.nextLine();
         g[i]=new Game(name);
      }

      while(true) {
         System.out.println();
         System.out.print("���� �����ұ�? ");
         int num=sc.nextInt();
         if(g[num-1].game()) {
            break;
         }
         /*
         if(g1.game()) { // ������ �����ȴٸ�,
            break;
         }
          */
      }

   }

}