package p11.lecture.classClass;

public class A02Class {
   public static void main(String[] args) throws Exception {
	Class c1 =Class.forName("p1.lecture.classClass.MyClass"); //클래스 정보를 가져오는방법1
	
	MyClass o1 = new MyClass(); //방법2
	Class c2 = o1.getClass();
	
	Class c3 = MyClass.class; //방법3
	
	System.out.println(c1.getName());
	System.out.println(c2.getName());
	System.out.println(c3.getName());
	
	System.out.println(c1 == c2);
	System.out.println(c2 == c3);
	
   }
}
