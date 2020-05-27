package sub2;

/*
 * 날짜 : 2020/05/19
 * 이름 : 최정한
 * 내용 : 쓰레드 활용 실습하기 교재 p576
 */
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		// 메인스레드에서 파생된 서브스레드의 작업이 완료된 후 다시 메인스레드로 합류되는 것을 실행(join)
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("결과 : "+count.getNum());
	}
}
