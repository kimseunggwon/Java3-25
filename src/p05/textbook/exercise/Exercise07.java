package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
    
      int max =Integer.MIN_VALUE;
      int min =Integer.MAX_VALUE;  //배열에어떤값이 있든지 가장 작은값 구할수있음
    		  
      int[] array = {-11, -15, -13, -18, -12};
      //최대값
      for(int i =0; i<array.length;i++) {
    	  if(array[i] >max) {
    	  max = array [i];
    	  }
      }
      
      //최소값
      for(int i =0; i<array.length;i++) {
    	  if(array[i] <min) {
    	  min = array [i];
    	  }
      } 
  
    	// 합계
  		int sum = 0;
  		for (int i = 0; i < array.length; i++) {
  			sum += array[i];
  		}
  		
  		// 평균
  		double avg = sum / (double) array.length;
    	
      
      System.out.println("max:"+max);
      System.out.println("min:"+min);
      System.out.println("sum:"+sum);
      System.out.println("avg:"+avg);

	}
}
