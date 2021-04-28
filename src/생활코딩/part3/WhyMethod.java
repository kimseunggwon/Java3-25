package 생활코딩.part3;

public class WhyMethod {
	 
	                              //args 는 main이라는 메소드를 자바가 실행할때 입력하는 입력값
	                              //args 통해서 사용자가 실행할대 주입해준 변수를 메소드 안에서 사용할수 있는것이다
     public static void main(String[] args) {
                            //string[] 대가로가 있으면 배열이라는것 서로 연관된 문자열을 그룹핑하는 문자열 배열 
    	 
    	 // 1000000 //refactor 기능을통해서도 한번에 메소드 가능
    	 printTwoTimes("a", "_");
    	 // 1000000
    	             //함수안으로 주입한 입력한 값 "a"를 인자 Argument 
    	 printTwoTimes("a", "*");
         // 1000000
    	 printTwoTimes("a", "^");
    	 printTwoTimes("b", "#");
     }
     public static String twoTimes ()
     
  
    	                              //text,delimiter같은 변수를 매개변수 =parameter 입력값이다
      public static void printTwoTimes(String text,String delimiter) {
    		 System.out.println(delimiter);
             System.out.println(text);
             System.out.println(text);
    	}
    	 
 
}
