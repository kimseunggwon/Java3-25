package p06.lecture.p8access_modifier.package1;

public class A04AcessModifierExample {
     public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
		System.out.println(o1.i);
//		System.out.println(o1.j);// private
		System.out.println(o1.k);// package private,default
	}
}
