package p09.textbook.s090303;

public class Outter {
 //자바 7이전
	public static void main(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100; (x)
		//localVariable = 100; (x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
