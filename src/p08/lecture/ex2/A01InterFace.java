package p08.lecture.ex2;

public class A01InterFace {
	public static void main(String[] args) {
		System.out.println(MyInterFace.MY_FIELD1);
		System.out.println(MyInterFace.MY_FIELD2);
		MyInterFace.staticMethod1();
		MyInterFace.staticMethod2();

		MyClass c1 = new MyClass();
		c1.method1();
		c1.method2();

		c1.defaultMethod1();
		c1.defaultMethod2();
	}

}
