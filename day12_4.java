
public class day12_4 {

	public static void main(String[] args) {
		
		//Wrapper Ŭ����
		//String Ŭ����
		
			Integer i=new Integer(10); // �ڽ�
			int i2=i.intValue(); // ��ڽ�
			Integer i3=10; // ����ڽ�
			int i4=i3; // �����ڽ�
			
			System.out.println(i); // ��ü
			System.out.println(i2); // ����
			
			if(i==i3) { // ��ü������ �񱳿����ڷ� ���Ҽ� ���� equals ��ߵȴ�.
				System.out.println("Ƽ");
			}
			else {
				System.out.println("��");
			}
			
			String str=new String(); 
			// �̷��� ��� �ϴ������� �޼ҵ带 ������̴�.
			// String str="apple" �̷��� �Ҽ��� ������ �̷��� �Ǹ�
			// ��ü�� �ƴϱ� ������ �޼ҵ� ����� �ȵȴ�. 
			// ���� ��ü�� �޼ҵ� ����̶�� ���� ������ �̷��� ����ϱ⵵ �Ѵ�.
			str="apple";
			System.out.println(str.toUpperCase());

	}

}
