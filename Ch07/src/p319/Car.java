package p319;

import p314.Tire;

public class Car {

	// �ʵ�
	public Tire[] tires = {
			new Tire("�տ���", 6),
			new Tire("�տ�����", 2),
			new Tire("�ڿ���", 3),
			new Tire("�ڿ�����", 4)
	};

	// �޼ҵ�
	public int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}

	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}