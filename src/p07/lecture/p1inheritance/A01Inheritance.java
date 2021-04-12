package p07.lecture.p1inheritance;

public class A01Inheritance {

		// 상속 : 상속받는 클래스는 상속하는 클래스의 맴버를 갖는다.
		
		// 상속받는 클래스 : 하위클래스, 자식클래스, sub class
		// 상속한느 클래스 : 상위클래스, 부모클래스, super class
		
		// 문법 :서브클래스에 (extends) 수퍼클래스 를 입력한다
	
	    // 서브클래스는 여러 수퍼클래스를 가질 수 없다
	    // 하나의 수퍼클래스는 여러 서브클래스에 상속할 수 있다
	    //
	
	    
	public static void main(String[] args) {
		A01Child o1 = new A01Child();
		
		o1.i =3;
		o1.method1();
	}
}
