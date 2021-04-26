package 생활코딩.part2;

public class LogicalOperator {
     public static void main(String[] args) {
		
    	 
    	 // AND 연산자 (둘다 true 이여야만 true)
    	 System.out.println(1 == 1);
    	 System.out.println(true && true); //양쪽이true 이여야만 true
    	 System.out.println(true && false); //한쪽이 false false 이다
    	 
    	 
    	 // OR 연산자 (둘중 하나라도 ture 이면 true)
    	 System.out.println(1 || 1); //true
    	 System.out.println(true || true); //true
    	 System.out.println(true || false); //true
    	 
    	 // not 연산자 ( ! 느낌표)
    	 System.out.println(!true); //false
    	 System.out.println(!false); //true
    	 
    	 
	}
}
