package p06.lecture.p6final;

public class A01Final {
	final static int f=55;
	//final 값을 한번만 할당 받을 수 있다

	
	int a;
	final int b;
	
	A01Final() {
		this.b = 0;
	}
	
public static void main(String[] args) {
	//final 변수(지역변수,파라미터,필드)
	//값을 한 번만 할당 받을 수 있음
	
	final int i;
	int j;
	j = 3;
	j = 5;
	
	i = 9;
//	i = 10; //x
	
  }
   static void method1 (final int i) {
	   System.out.println(i);
//	   i = 3; //x
	   
   }

}
