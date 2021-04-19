package p10.lecture;

public class A11Polymorphism {
  public static void main(String[] args) {
	  System.out.println("프로그램 실행");
	  
	  try {
		  System.out.println("try 실행");
		  
		  int[] arr1 = {};
		  System.out.println(arr1[0]);
		  Integer.parseInt("abc");
		  String str = "java";
		  Object o =str;
		  StringBuffer sb=(StringBuffer) o;
		  
		  System.out.println("try 종료");
	  }
	  
	  System.out.println("프로그램 종료");
 }
}
