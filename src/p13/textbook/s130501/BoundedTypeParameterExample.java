package p13.textbook.s130501;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
		//String str = Util.compare("a","b"); xx
    	                       //string은 number타입이 아님
    	
    	
    	int result1 = Util.compar(10, 20);
    	System.out.println(result1);     //int -> Integer 자동boxing
    	
    	int result2 = Util.compar(4.5, 3);
    	System.out.println(result2);   //double ->Double 자동boxing
	}
} 
