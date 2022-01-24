/*
과목 클래스 -> 과목 객체들을 만들예정
과목이름 시간 ex) 자바 24시간 c 30시간
ex) 15 -> 과목미지정 : 15
ec) 자바 -> c++ : 30
*/

class Sub{
	String name;
	int time;
	Sub(String name, int time){
		this.name=name;
		this.time=time;
	}
	Sub(int time){
		this("과목 미지정",time);
	}
	Sub(String name){
		this(name , 30);
	}
	void show(){
		System.out.println("신청과목 :"+this.name+" 이수 시간 :"+this.time);
	}
	
}
public class day9_2 {

	public static void main(String[] args) {
		

		Sub s1=new Sub("JAVA", 24);
		s1.show();
		
	}

}
