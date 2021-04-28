package p15.lecture.sample;

import java.util.Arrays;
import java.util.List;

public class Ex01List {
    public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7,9,-100,30,90,700);
		
		System.out.println(list);
		
		
		int sum = sum(list); //합계값
		System.out.println(sum);
		
		int max = max(list); //최대값
		System.out.println(max);
		
		int indexOfMax =indexOfMax(list); //최대값 인덱스값
		System.out.println(list.get(indexOfMax));
	}
    
    //총합 max값
    private static int indexOfMax(List<Integer> list) {
		int index = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i =0; i <list.size(); i++) {
			if(max <list.get(i)) {
				max =list.get(i);
				index = i;
			}
		}
		return index;
	}
    
    //최소값 min값
	private static int max(List<Integer> list) {
		int max =Integer.MIN_VALUE;
		
		for(int n : list) {
			if(n>max) {
				max =n;
			}
		}
		return 0;
	}
    //sum
	public static int sum(List<Integer>list) {
    	int sum = 0;
    	
    	for(int n :list) {
    		sum += n;
    	}
    	
    	return sum;
    	
  
    }
}
