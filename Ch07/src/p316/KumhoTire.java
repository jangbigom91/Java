package p316;

import p314.Tire;

public class KumhoTire extends Tire{

	// �ʵ�
	// ������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// �޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+"HankookTire ���� : "+(maxRotation - accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"HankookTire ��ũ ***");
			return false;
		}
	}
	
}
