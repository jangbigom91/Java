package test10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectTest {

	public static void main(String[] args) {
		
		try {
			// 현재 프로젝트 폴더 하위에 apple.txt 객체파일과 스트림 연결
			FileInputStream fis 	= new FileInputStream("./apple.txt");
			ObjectInputStream ois 	= new ObjectInputStream(fis);
			
			// 스트림을 통한 객체를 복원(역직렬화)
			Apple a1 = (Apple) ois.readObject();
			Apple a2 = (Apple) ois.readObject();
			
			a1.show();
			a2.show();
			
			// 스트림 해제
			fis.close();
			ois.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("apple.text 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
	}
}
