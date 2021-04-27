package p15.textbook.s1;

import java.util.Arrays;
import java.util.List;

//asList 는 파라미터값이 여러개 들어갈수있다

public class ArraysAsListExample {
  public static void main(String[] args) {
	List<String> list1 = Arrays.asList("홍길동","김승권","권나라");
	for(String name : list1) {
		System.out.println(name);
	}
	
	List<Integer> list2 = Arrays.asList(1,2,3);
	for(int value : list2) {
		System.out.println(value);
	}
	
	
//	List<Integer> list3 =Arrays.asList(new int[] {1,2,3});
  }
}
