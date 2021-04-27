package p15.textbook.s;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
  public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	
	list.add("java"); //0
	list.add("jdbc"); //1
	list.add("servlet/jsp"); // 2 --> 3 
	list.add(2,"database"); // 2 인덱스에 넣으라는표시
	list.add("ibatis");//4
	
	int size=list.size();
	System.out.println("총 객체수:" +size);
	System.out.println();
	
	String skill= list.get(2);
	System.out.println("2:"+skill);
	System.out.println();
	
	
	for(int i=0; i<list.size(); i++) {
		String str = list.get(i);
		System.out.println(i+":"+str);
	}
	System.out.println();
	
	list.remove(2); //2번 지우고
	list.remove(2); //지워진 2번자리에 채워진 그걸또 지운다는 의미
	list.remove("ibatis");
	
	for(int i=0; i<list.size(); i++) {
		String str =list.get(i);
		System.out.println(i+":"+str);
		
	}
 }
}
