package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��¥ : 2020/05/21
 * �̸� : ������
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018
 */
public class FileIOTest {
	public static void main(String[] args) throws Exception {
		
		String originfile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetfile = "C:\\Users\\bigdata\\Desktop\\target.jpg";
		
		FileInputStream  fis = new FileInputStream(originfile);
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		int value = 0;
		
		while(true) {
			// InputStream���� ������ �о���̱�
			value = fis.read();
			
			if(value == -1) {
				break;
			}
			
			// OutputStream���� ������ ��������
			fos.write(value);
		}
		
		// ��Ʈ�� ����(����� �ڿ� �ݳ�)
		fis.close();
		fos.close();
		
		System.out.println("���α׷� ����...");
	}
}
