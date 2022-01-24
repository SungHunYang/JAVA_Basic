import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class day16_3 {

	public static void main(String[] args) {
		
		// [파일 입출력]
		
		// C:\
		
		File f=new File("C:\\input.txt");
		// 해당파일이 없으면, 새로생성해줌
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("파일생성하는 try문 수행완료");
		}

		try {
			FileInputStream fis=new FileInputStream(f);
			// 얘는 파일이 없으면 안됌
			int data;
			while( (data=fis.read()) !=-1) {
				// fis.read()는 마지막 글자를 읽으면 -1을 가져옴
				System.out.print((char)data);
			}
			System.out.println();
			fis.close(); // 파일을 닫아주는거다. 수행할때 항상 열리기 때문에 닫으면 좋다
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("input스트림 try문 수행완료");
		}
		
		try {
			FileInputStream fis2=new FileInputStream("C:\\fizz.jpg");
			FileOutputStream fos2=new FileOutputStream("C:\\fizz2.jpg");
			// 사진을 복사
			
			byte[] b=new byte[1000]; 
			// 사진은 바이트로 이뤄져있음 따라서 바이트가 있어야함
			int data;
			while((data=fis2.read(b))!=-1) {
				//read는 마지막까지 읽으면 -1을 반환
				fos2.write(b, 0, data);
				// 내가 읽어들인 친구를 0부터 data까지 write 하겠습니다
			}
			fos2.flush();
			fos2.close();
			fis2.close();
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		finally {
			System.out.println("사진 복사 완료");
		}
		
		
		
		
		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\output.txt");
			fos.write(97); //이어쓰기가 아니라 덮어쓰기
			fos.flush(); 
			// 이걸 반드시 써야된다 --> 쓰레기값이 들어가지 않게 버퍼를 비우는 역할
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("output스트림 try문 수행완료");
		}
		
	}

}
