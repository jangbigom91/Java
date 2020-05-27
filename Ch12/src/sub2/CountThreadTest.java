package sub2;

/*
 * ��¥ : 2020/05/19
 * �̸� : ������
 * ���� : ������ Ȱ�� �ǽ��ϱ� ���� p576
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
		
		// ���ν����忡�� �Ļ��� ���꽺������ �۾��� �Ϸ�� �� �ٽ� ���ν������ �շ��Ǵ� ���� ����(join)
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("��� : "+count.getNum());
	}
}
