package test03;

/*
 * 날짜 : 2020/05/22
 * 이름 : 최정한
 * 내용 : String 클래스 연습문제
 */
public class JavaTest3 {
	
	public static void main(String[] args) {
		
		String fileName = "자바 수행평가.hwp";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
	}
}
