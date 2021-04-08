package p06.lecture.p4method;

public class A06ParameterCast {
	public static void main(String[] args) {
		int a = 5;
		double b;
		b = a;
		//파라미터에게 값을 넣을때 자동형변환된다
		
		
		MyClass6 o1 = new MyClass6();
		o1.method1(a);
//		o1.method1(b);
		
		o1.method2(b);
		o1.method2(a); //더블타입인데 int 넣어도 자동형변환으로됨
	}

}
