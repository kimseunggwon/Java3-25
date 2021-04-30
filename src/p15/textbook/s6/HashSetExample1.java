package p15.textbook.s6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
     public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");        
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");       //중복허용x
		set.add("iBATIS");
		
		int size =set.size();
		System.out.println("총 객체수:"+size);  // 4개
		
		
		Iterator<String> iterator = set.iterator();  //반복자 얻기
		 while(iterator.hasNext()) {           //객체수만큼 반복
			 String element = iterator.next(); //한 개의 객체를 반복해서 가져옴 
			 System.out.println("\t"+element);   //결국 4개
		 }
		 
		 set.remove("JDBC");
		 set.remove("iBATIS");
		 
		 System.out.println("총 객체수:"+set.size()); //2개
		 
		 iterator =set.iterator();
		 while(iterator.hasNext()) {
			 String element = iterator.next();
			 System.out.println("\t"+element);
		 }
		 
		 set.clear();   //모든거 비움(삭제)
		 if(set.isEmpty()) {
			 System.out.println("비어 있음");
		 }
	}
}
