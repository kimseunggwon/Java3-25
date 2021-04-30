package p15.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A09Map {
     public static void main(String[] args) {
		Map<Integer, Integer> map =new HashMap<>();
		
		map.put(2,99);
		map.put(3,6);
		map.put(8,77);
		
		System.out.println(map.size()); //3 
		
		map.put(8,88); //8, 77 --> 8, 88   변경
		
		System.out.println(map.size()); //3
		
		System.out.println(map.get(2)); //99값 리턴
		System.out.println(map.get(8)); //88값 리턴
		
		Set<Integer> keys = map.keySet();
		
		for (Integer key : keys) {
			System.out.println(key +":"+map.get(key));  //모든값 리턴
		}
		
		map.remove(8); //8해당 삭제
		System.out.println(map.size()); //2
		
	    Set<Map.Entry<Integer, Integer>>entries =map.entrySet(); //맵에모든 엔트리을 꺼내는거   
	    
	    for (Map.Entry<Integer, Integer> entry : entries) { //모든 엔트리를 탐색
	    	System.out.println(entry.getKey()+":"+entry.getValue());
	    }
		
	}
}
