package sub2;

/*
 * 날짜 : 2020/05/13
 * 이름 : 최정한
 * 내용 : 인터페이스 실습하기 
 */
public class InterfaceTest2 {
	
	public static void main(String[] args) {
		// 인터페이스 역할 : 다중 상속 효과를 구현하는 역할
		SmartTV stv = new SmartTV();
		stv.powerOn();
		stv.booting();
		stv.internet();
	}
}
