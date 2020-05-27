package sub1;

public interface RemoteControl {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	// abstract 생략가능
	public  void chUp();
	public  void chDown();
	
	public  void soundUp();
	public  void soundDown();
}
