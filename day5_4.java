
public class day5_4 {

	public static void main(String[] args) {
		
		//[���� ū ���� ã��] �˰���
		int[] data= {2,3,1,5,4};
		int max=data[0];
		for(int i=1; i<data.length; i++) {
			if(max<data[i]) {
				max=data[i];
			}
		}
		System.out.println("�ִ밪��"+max);
		
		int min=data[0];
		int num=0;
		for(int i=1; i<data.length; i++) {
			if(min>data[i]) {
				min=data[i];
				num=i;
			}
		}
		System.out.println("�ּҰ�"+num+"����"+min);
		

	}

}
