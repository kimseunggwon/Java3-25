package p06.lecture.p4method;
public class MyClass4 {
	//return :1.메소드 종료
	//          2. 오른쪽에 있는 값 반환
	          
	// 오른쪽에 명시된 값은 메소드명 앞의 타입과 일치해야함
	//return 타입을 void로명시하면 return 안해줘도된다
   void method1() {
	   System.out.println("method1 호출...");
   }
   
	//void 아닌경우 return 코드있어야한다.
	int method2() {
		System.out.println("method2 호출...");
		
		return 5;
	}
	
	String method3() {
		System.out.println("method3 호출...");
		
		return"";
	}
	
	int[] method4() {
		System.out.println("method4 호출...");
		return new int[] {};
		
	}
	
	int[] method5() {
		System.out.println("method5 호출...");
		int[] res = {};
		
		return res; //return 코드는 메소드를 종료한다
//		System.out.println(); //그러므로 리턴 다음에는 실행불가능
	}
	
	String method6() {
		System.out.println("method6 호출...");
		
		boolean b = 3< 5;
		
		if (b) {
		  return "hello";
	}
		
		if(!b) {
			return "hello";
		}else {
			return "hello";
		}
		String method7() {
			System.out.println("method7 호출...");
			
			boolean c = 3 < 5;
			
			if(c) {
				return "world";
			}
			
			System.out.println("method7 호출2...");
			return "world";
			
			
   }
}
