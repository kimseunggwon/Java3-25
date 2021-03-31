package p03.textbook;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민아";
		String strVar2 = "신민아";
		String strVar3 = new String("신민아");
		
		System.out.println(strVar1 ==strVar2);
		System.out.println(strVar1 ==strVar3);
		System.out.println();
	    System.out.println(strVar1.equals(strVar2));
	    System.out.println(strVar1.equals(strVar3));
	    System.out.println(strVar1.equals(strVar3));
	    
	    //자바에서 문자열 같음을 비교할때 equals 를 사용한다
	}
}
