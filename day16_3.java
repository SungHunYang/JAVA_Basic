import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class day16_3 {

	public static void main(String[] args) {
		
		// [���� �����]
		
		// C:\
		
		File f=new File("C:\\input.txt");
		// �ش������� ������, ���λ�������
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("���ϻ����ϴ� try�� ����Ϸ�");
		}

		try {
			FileInputStream fis=new FileInputStream(f);
			// ��� ������ ������ �ȉ�
			int data;
			while( (data=fis.read()) !=-1) {
				// fis.read()�� ������ ���ڸ� ������ -1�� ������
				System.out.print((char)data);
			}
			System.out.println();
			fis.close(); // ������ �ݾ��ִ°Ŵ�. �����Ҷ� �׻� ������ ������ ������ ����
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("input��Ʈ�� try�� ����Ϸ�");
		}
		
		try {
			FileInputStream fis2=new FileInputStream("C:\\fizz.jpg");
			FileOutputStream fos2=new FileOutputStream("C:\\fizz2.jpg");
			// ������ ����
			
			byte[] b=new byte[1000]; 
			// ������ ����Ʈ�� �̷������� ���� ����Ʈ�� �־����
			int data;
			while((data=fis2.read(b))!=-1) {
				//read�� ���������� ������ -1�� ��ȯ
				fos2.write(b, 0, data);
				// ���� �о���� ģ���� 0���� data���� write �ϰڽ��ϴ�
			}
			fos2.flush();
			fos2.close();
			fis2.close();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		finally {
			System.out.println("���� ���� �Ϸ�");
		}
		
		
		
		
		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\output.txt");
			fos.write(97); //�̾�Ⱑ �ƴ϶� �����
			fos.flush(); 
			// �̰� �ݵ�� ��ߵȴ� --> �����Ⱚ�� ���� �ʰ� ���۸� ���� ����
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("output��Ʈ�� try�� ����Ϸ�");
		}
		
	}

}
