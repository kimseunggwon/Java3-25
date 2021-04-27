package p15.lecture;

import java.util.ArrayList;
import java.util.List;

public class A02List {
  //List : 순서가 있고 중복 저장 가능한 인터페이스
  
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// add: 값 추가 //넣은순서대로 0번 인덱스부터 
	   list.add("java");
	   list.add("spring");
	   list.add("python");
//	   list.add(3); //타입을 스트링으로 명시했기에 스트링 배열만 가능
	   
	   //size : 크기
	   int len =list.size();
	   System.out.println(len); //3
	   
	   //get : 꺼내기
	   String e1= list.get(0); //java
	   String e2= list.get(1); //spring
	   String e3= list.get(2); //python
	   System.out.println(e1);
	   System.out.println(e2);
	   System.out.println(e3);
	   
//	   String e4 =list.get(3);
	   
	   // for 탐색 // list는 for문과 조합이 잘맞는다
	   System.out.println("for 탐색");
	   for(int i=0; i <list.size(); i++) {
		   System.out.println(list.get(i));
	   }
	   
	   //향상된 for 탐색
	   System.out.println("향상된 for 탐색");
	   for(String e: list) {
		   System.out.println(e);
	   }
	   
	   //remove : 삭제
	   list.add("servlet"); //3번인덱스
	   list.remove(3);  //삭제
	   System.out.println("지운 후 탐색");
	   for(String e: list) {
		   System.out.println(e);
	   }
	   
	   list.remove("java"); //인덱스 0번이 삭제되면 1번이 0번자리에 온다
	   System.out.println("지운 후 탐색");
	   for(String e: list) {
		   System.out.println(e);
	   }
	   
	   
	}
}
