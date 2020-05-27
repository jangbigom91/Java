package test10;

import java.io.Serializable;

// 스트림을 통해 외부 객체파일로 생성되는 클래스로 직렬화를 위해
// Serializable 인터페이스를 구현해야 한다.
public class Apple implements Serializable {

	// 객체 시리얼버전 선언(옵션)
	private static final long serialVersionUID = 1L;
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	public void show() {
		
		System.out.println("원산지 : "+country);
		System.out.println("가   격 : "+price);
	}
}
