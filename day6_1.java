import java.util.Scanner;

public class day6_1 {

	public static void main(String[] args) {
		
		//[다차원배열]
		//[2차원배열]
		
		int[][] stu2=new int[3][2];
		
		int[][] stu= {{10,20,30}, {11,12,13}, {1,2,3}, {1,2,3}}; 
		// 이차원배열, 정방형 -> 각기 다른 시험 횟수를 가졌으면 묶을수없다
		for(int a=0; a<4; a++) {
		System.out.println((a+1)+"번학생의");
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"시험성적:"+stu[a][i]); // a와 i의 순서(앞뒤)도 중요함
		}System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<stu2.length; i++) {
			// 여기서 길이는 학생의 길이(3)
			System.out.println((i+1)+"번학생의");
			for(int a=0; a<stu2[i].length; a++) {
				// 여기서 길이는 학생이 가지고있는 데이터의 길이(2)
				System.out.println((a+1)+"시험성적:");
				stu2[i][a]=sc.nextInt();
				//예제1) 1번학생의 총점 평균 / 2번의 총점 평균 / 3번의 총점평균
			}
		}
	}
}
