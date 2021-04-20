package p11.lecture.object;

import p08.lecture.ex2.MyClass;

public class A01Object {
   //object 클래스는 
   // 모든 클래스의 상위 클래스 이다
	
	public static void main(String[] args) {
		MyClass o1 =new MyClass();
		int i = o1.hashCode();
		String s =o1.toString();
	}
}

class Myclass { //모든클래스는 자동으로 object 를 상속받는다
	
}
