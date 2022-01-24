import java.util.Scanner;

public class day5_2 {

	public static void main(String[] args) {

		//반에 학생이 5명 // 시험점수 (정수 0~100) // 총합,평균점수를 출력 
		// 평균(실수)점수보다 높은점수를 받은 학생의 번호 출력

		int[] stu=new int[5];
		Scanner sc=new Scanner(System.in);

		for(int i=0; i<stu.length; i++) {
			do{
				System.out.println((i+1)+"번 학생의 점수 입력: ");
				stu[i]=sc.nextInt();
			}while(stu[i]<0 || stu[i]>100); 
// 13번을 만나려면 18번에 닿아야 하는데 do while은 실패시 14번 라인(do while 블록안에서만 돈다)으로 가서 i증가 없이계속 반복된다.
		}
		System.out.println();
		System.out.println("입력완료!");
		System.out.println();
		
		int sum=0;
		double avg;
		for(int i=0; i<stu.length; i++) {
			sum+=stu[i];
		}
		avg=sum*1.0/5;// sum이 만들어 져야 값이 나오기 때문에 for문 밖에 넣어야함
		System.out.println("합계:"+sum+" 평균:"+avg);
		for(int i=0; i<stu.length; i++) {
			if(stu[i]>=avg) {
				System.out.println("평균보다 높은 아이는"+(i+1)+"학생이다");
			}
				
		}
		
	}

}
