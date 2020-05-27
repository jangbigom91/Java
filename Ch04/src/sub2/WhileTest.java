package sub2;

/*
 * 날짜 : 2020/05/04
 * 이름 : 최정한
 * 내용 : 반복문 While 실습하기 
 */
public class WhileTest {
	
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		
		// do ~ while
		int eSum = 0;
		int i = 1;
		
		do {
			
			if(i % 2 == 0) {
				eSum += i;
			}
			i++;
		}
		while(i <= 10);
		
		System.out.println("1부터 10까지 짝수 합 : "+eSum);
		
		// break
		int num = 0;
		
		while(true) {
			
			num++;
			
			if(num%5 == 0 && num%7 == 0) {
				break; // 반복문 탈출
			}
		}
		
		System.out.println("5와7의 최소공배수 : "+num);
		
		// continue
		int total = 0;
	
		for(int j=1; j<=10; j++) {
			
			if(j%2 == 1) {
				continue; // 반복문의 상위로 이동
			}
			
			total += j;
		
		}
	
		System.out.println("1부터 10까지 짝수합 : "+total);
	
	}
}