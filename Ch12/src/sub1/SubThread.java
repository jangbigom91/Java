package sub1;

public class SubThread extends Thread{

	
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		for(int i=1; i <= 10; i++) {
			
			// Override에서는 throw선언이 안된다. try ~ catch 만 할수있음.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name+"쓰레드 실행...");
		
		}
		
		System.out.println(name+"쓰레드 종료...");
	}
}
