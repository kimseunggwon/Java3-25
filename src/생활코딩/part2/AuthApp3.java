package 생활코딩.part2;

public class AuthApp3 {
       public static void main(String[] args) {
		
   // 	  String[] users = {"egoing","kim","gwom"}; 
    	  String[] [] users = {
    			  {"egoing","1111"}, //각각의 원소가 배열
    			  {"kim","2222"},   //그배열의 값이 스트링인 데이터
    			  {"go","3333"}		  
    	  };
    	  String inputId =args[0];
    	  String inputPass =args[1];
    	  
    	  
    	  boolean isLogined = false;
    	  for(int i=0; i<users.length; i++) {
    		  String [] current = users[i];    
    		  if(                                   //입력된 아이디값과
    				  current[0].equals(inputId) && //각각의 아이디 첫번째 자리인 아이디를 비교하는 코드이다
    		          current[1].equals(inputPass)  
    	       ) { 
    			  isLogined = true;
    			  break;
    		    }
    		  }
    		  System.out.println("Hi");
    		  if(isLogined) {
    			  System.out.println("Master!!");
    		  }else {
    			  System.out.println("Who are you");
    		  }
    	  }
	}

