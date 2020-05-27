package p394;

// ¹Ù±ù Å¬·¡½º
public class A {

	public A() {
		System.out.println("A °´Ã¼°¡ »ý¼ºµÊ");
	}
	
	// ÀÎ½ºÅÏ½º ¸â¹ö Å¬·¡½º
	public class B {
		public B() {
			System.out.println("B °´Ã¼°¡ »ý¼ºµÊ");
		}
		
		public int field1;
		//static int field2;
		
		public void method1() {}
		// static void method2() {}
	}
	
	// Á¤Àû ¸â¹ö Å¬·¡½º
	public static class C {
		public C() {
			System.out.println("C °´Ã¼°¡ »ý¼ºµÊ");
		}
		
		public int field1;
		public static int field2;
		
		public void method1() {}
		
		public static void method2() {}
	}
	
	public void method() {
		// ·ÎÄÃ Å¬·¡½º
		class D {
			D() {
				System.out.println("D °´Ã¼°¡ »ý¼ºµÊ");
			}
			
			int field1;
			// static int field2;
			
			public void method1() {}
			// static void methdo2() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
