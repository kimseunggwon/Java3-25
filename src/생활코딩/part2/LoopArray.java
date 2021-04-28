package 생활코딩.part2;

public class LoopArray {
      public static void main(String[] args) {
    	  /*
    	      *  <li>kim</li>
    	      *  <li>gwon</li>
    	      *  <li>kang</li>
    	      * 
    	      */
    	String [] users = new String[3];
      	users[0] = "kim"; 
      	users[1] = "gwon"; 
      	users[2] = "kang";
      	//users.length라고 정의해놓으면 users를 얼마든지 수정해도 반복문이 기능할수있다
      	
       for(int i =0; i<users.length; i++) {
    	  System.out.println("<li>"+users[i]+"</li>");
      }
      	
	}
      
}
