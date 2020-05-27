package p411;

public class Anonymous {
	
	// 필드 초기값으로 대입
	public RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	public void method1() {
		// 로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		
		// 로컬 변수 사용
		localVar.turnOn();
	}
	
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
