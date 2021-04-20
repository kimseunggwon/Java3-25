package p11.lecture.object;

public class A05HashCode {
   public static void main(String[] args) {
	Object o1 = new Object();
	Object o2 = new Object();
	
	System.out.println(o1.hashCode());
	System.out.println(o2.hashCode());
	
	System.out.println(o1.equals(o2));
	
	String s1 = new String("java");
	String s2 = new String("java");
	
	System.out.println(System.identityHashCode(s1)); //s1 s2 서로 다른 참조값을 가지고 있다
	System.out.println(System.identityHashCode(s2));
	
	System.out.println(s1.hashCode()); //hashcoe 메소드는 서로 같은 값을 가지고있다
	System.out.println(s2.hashCode());
	
    System.out.println(s1.equals(s2)); //
	
 }
}
