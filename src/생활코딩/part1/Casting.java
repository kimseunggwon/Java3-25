package 생활코딩.part1;

public class Casting {

	public static void main(String[] args) {
		
		double a =1.1;
		double b = 1; //정수 1이 실수 1.0으로 변환은 손실이 없다 그래서 자동으로 변환이 된다.
		double b2 =(double) 1;
		
		System.out.println(b);
//실수 b 에 정수1을 입력해 자동으로converting 되서 1.0 출력
		
		
//		int c = 1.1;
		double d = 1.1;
		         
		int e = (int) 1.1; //1.1을 강제로 명시적으로 정수로 바꿈 그러나 손실이 있기때문에 자동으로 변환이 안된다.
		System.out.println(e);
		
		
		
		//  1 to String // 숫자 1 --> 문자열로 바꾸기
		// f는 숫자5가 아닌 문자열 5이다.
        String f =Integer.toString(5);
        System.out.println(f);
	}

}
