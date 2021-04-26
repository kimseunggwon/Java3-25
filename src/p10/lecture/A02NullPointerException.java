package p10.lecture;

public class A02NullPointerException {
       public static void main(String[] args) {
		System.out.println("프로그램 실행중..");
		
		String str ="java";
		showLength(str);
		
		str = null; // null은 참조하는 객체가 없다
		showLength(str);
		
		System.out.println("프로그램 종료..");
	}
       private static void showLength(String s) {
    	   System.out.println("길이는"+s.length());
       }
}