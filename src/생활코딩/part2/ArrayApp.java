package 생활코딩.part2;

public class ArrayApp {
    public static void main(String[] args) {
//		String users = "kim","gwon","kang";
    	String [] users = new String[3];
    	users[0] = "kim"; 
    	users[1] = "gwon"; 
    	users[2] = "kang";
    	
    	System.out.println(users[1]); //gwon
    	System.out.println(users.length); //3 -->3칸짜리 배열이다
    	
    	int[] scores = {10,100,100};
    	System.out.println(scores[1]); //100
    	System.out.println(scores.length); //3
    	
	}
}
