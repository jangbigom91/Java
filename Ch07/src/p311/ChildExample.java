package p311;


import p310.Child;
import sub3.Parent;

public class ChildExample {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		
		Child parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3();
	}
}
