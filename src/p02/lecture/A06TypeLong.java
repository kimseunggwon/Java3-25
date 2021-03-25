package p02.lecture;

public class A06TypeLong {
   public static void main(String[] args) {
		//long : 8byte(64bit)
	    // 0 X64
	   System.out.println("최대값");
	   System.out.println(Long.MAX_VALUE);
	   System.out.println("최대값");
	   System.out.println(Long.MIN_VALUE);
	   
	   long longVar;
	   longVar = 9223372036854775807L;  //L을 끝에 작성해야 Long literal
	   longVar = -9223372036854775808L; //L을 끝에 작성해야 Long literal
	   
	   longVar = 1_000_000;
	   longVar = 1000000;
	 
	}

}
