package p503;

public class StringGetBytesExample {
	public static void main(String[] args) {
		
		String str = "¾È³çÇÏ¼¼¿ä";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : "+bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String : "+str1);
	
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : "+bytes2.length);
			
		} catch (Exception e) {

		}
	
	
	
	
	
	
	
	
	
	
	
	}
}
