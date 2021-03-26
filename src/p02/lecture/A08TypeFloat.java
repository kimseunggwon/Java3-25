package p02.lecture;

public class A08TypeFloat {
	public static void main(String[] args) {
		//float : 4byte (32bit) 실수 저장
		
		long longVar = 2200000000L; //L를 붙여준다
		
		float var;
		var = 3.14F;    //실수 literal은 double //F를 붙여준다
		
		// 양수 최대값
		System.out.println(Float.MAX_VALUE);
		
        // 양수 최소값
		System.out.println(Float.MIN_VALUE);
		
		//음주 최소값
        System.out.println(-Float.MAX_VALUE);
        
        //양의 무한대
        System.out.println(Float.POSITIVE_INFINITY);

	}

}
