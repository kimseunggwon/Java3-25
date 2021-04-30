package p15.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class A07Set {
     //Set: 순서없고, 중복 불가
	public static void main(String[] args) {
		Set<Integer> set =new HashSet<>();
		
		set.add(9);        //추가 메소드
		set.add(8);        
		set.add(2);    
		
		System.out.println(set.size());
		
		set.add(9);  //중복안되서 set 사이즈는 여전히 3
		
		System.out.println(set.size());
		
		boolean c = set.contains(9);    //어떤값이 있는지 확인하는 메소드
		System.out.println(c);
		
		System.out.println(set.contains(3));
		
		set.remove(9);
		System.out.println(set.size());
		
//		set.get(2); //x
		
		set.add(9);
		set.add(3);
		set.add(2);
		
		System.out.println(set.size()); //4
		Iterator<Integer>iter=set.iterator();  //저장된 객체를 한번씩 가져오는 반복자 리턴
		
		
		System.out.println(iter.hasNext());   //hasnext로 가져올 객체가 있으면 true
		Integer i1 = iter.next();             // 없으면 false 리턴한다  
		System.out.println(iter.hasNext());
		Integer i2 = iter.next();
		System.out.println(iter.hasNext());
		Integer i3 = iter.next();
		System.out.println(iter.hasNext());
		Integer i4 = iter.next();      //size 4니까 4번까지 사용가능
		System.out.println(iter.hasNext());      
		
		while (iter.hasNext()) {
			Integer n =iter.next();	
			System.out.println(n);
			}
	}
}
	
	
