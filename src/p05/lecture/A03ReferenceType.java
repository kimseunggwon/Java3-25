package p05.lecture;

public class A03ReferenceType {
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		
		
		String s =new String("java");
		String t =new String("java");
		
		System.out.println( i == j); //같다
		System.out.println( s == t); //서로 다른 참조값을 가지고 있으니
		                             // s 와 t 는 다르다
	}

}
