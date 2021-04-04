package p05.lecture;

public class A07ReferenceValue {

	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java";
		//참조 값이 궁금할때 sHashcode를 이용해 값을 알수있다
		
	int sHashcode =	System.identityHashCode(s);
	System.out.println(sHashcode);
	
	int tHashcode =	System.identityHashCode(t);
	System.out.println(tHashcode);
	
	int uHashcode =	System.identityHashCode(u);
	System.out.println(uHashcode);
	

	}

}
