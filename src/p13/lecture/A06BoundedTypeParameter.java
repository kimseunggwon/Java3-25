package p13.lecture;

public class A06BoundedTypeParameter {
	//제한된 타입 파라미터
     public static void main(String[] args) {
		Generic6<String> g1 = new Generic6<>();
		Generic6<StringBuffer> g2 =new Generic6<>();		
		Generic6<StringBuilder> g3 =new Generic6<>();
		
//		Generic6<Object> g4 = new Generic6<>();
	}
}

class Generic6 <T extends CharSequence> {
	 private T field;
	 
	 public void method() {
		 char c =field.charAt(3);
	 }
}