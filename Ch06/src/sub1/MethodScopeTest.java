package sub1;

/*
 * 날짜 : 2020/05/06
 * 이름 : 최정한
 * 내용 : 자바 메서드 실행영역과 메모리 실습하기 
 */
public class MethodScopeTest {
	
	public static void main(String[] args) {
		// 지역변수
		int result = 0;
		int start = 1;
		int end = 10;
		
		result = sum(start, end);
	
		System.out.println("result : "+result);
	} // main end

	public static int sum(int s, int e) {
		// 지역변수
		int sum = 0;
		
		for(int k=s; k<=e; k++) {
			sum += k;
		}
		
		return sum;
	}

}
