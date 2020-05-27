package p401;

import p399.Outter;

public class OutterExample {

	public static void main(String[] args) {
		
		Outter outter = new Outter();
		
		Outter.Nested nested = outter.new Nested();
		
		nested.print();
	}
}
