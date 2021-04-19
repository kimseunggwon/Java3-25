package p10.lecture;

public class A04NumberFormatException {
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		
		String str1 = "100a"; //100a는 정수로 변경이 불가능
		
		int int1 = Integer.parseInt(str1); //스트링을 인티져로 변경
		
		int result = int1 *2;
		
		System.out.println(result);
		
		System.out.println("프로그램 종료");
	}

}
