package p06.textbook.s061303.package1;

public class A {
    //필드
	
	public int field1;  //public 접근제한
	int field2;         //default 접근 제한
	private int field3; // private 접근 제한
	
	//생성자
	public A() {
		field1 = 1;  //o
		field2 = 1;  //0
		field3 = 1;  //0
		
		method1();     //0
		method2();     //0
		method3();     //0
	}
	
	//메소드
	
	public void method1() {} //public 접근제한
	 void method2() {}       //default 접근제한
	public void method3() {} //private 접근제한
}
