package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	// ����ȭ ���ϼ������� �����尣 ������ ���´�.(synchronized)
	public synchronized void setNum() {
		num++;
	}
}