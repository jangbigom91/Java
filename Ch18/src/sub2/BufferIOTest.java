package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2020/05/21
 * 이름 : 최정한
 * 내용 : 자바 파일 입출력 실습하기 교재 p1018
 */
public class BufferIOTest {
	public static void main(String[] args) throws Exception {
		
		String originfile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetfile = "C:\\Users\\bigdata\\Desktop\\target.jpg";
		
		// 기본 파일입출력 스트림 생성
		FileInputStream  fis = new FileInputStream(originfile);
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		// 버퍼스트림 생성 및 연결
		BufferedInputStream  bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		
		while(true) {
			// InputStream으로 데이터 읽어들이기
			value = bis.read();
			
			if(value == -1) {
				break;
			}
			
			// OutputStream으로 데이터 내보내기
			bos.write(value);
		}
		
		// 스트림 해제
		bis.close();
		bos.close();
		fis.close();
		fos.close();
		
		System.out.println("프로그램 종료...");
	}
}
