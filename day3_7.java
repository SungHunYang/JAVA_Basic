import java.util.Scanner;

public class day3_7 {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.원하는 정수를 입력해주세요: ");
		int a=sc.nextInt();
		System.out.println("2.원하는 정수를 입력해주세요: ");
		int b=sc.nextInt();
		
		if(a>b) {
			// a에저장된 값과 b에 저장된 값을 교환한다
			//[임시저장변수]가 필요로하다 -> 교환 알고리즘
			int temp=0;
			temp=a;
			a=b;
			b=temp;// temp는 if 블록에서 선언 되었기 때문에 if 문단에서만 사용 가능하고 밖으로 나오면 사용 x
		}
		
		
		
		/*int max=a>b? a:b;
		int min=a<b? a:b;*/ // 이것도 하나의 방법이다
		
		int i=a;
		while(i<=b)
		{
			System.out.print(i+" ");
			i++;
		
		}
		System.out.println();
		System.out.print(i);

	}

}
