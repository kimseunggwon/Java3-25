package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
      void method1 (int i) {
    	  System.out.println("method1!!!!");
      }
      
      void method2 (int i,int k) {
    	  System.out.println("method2@@@@");
      }
      
      void method3(int...i) { //int....은 인티져여러개 받겠다라고 명시
    	  System.out.println("method3###");
    	  System.out.println(i.length);
    	  System.out.println(Arrays.toString(i));
      }
      
      void method4(double d,int...i) {//int...은다른 파라미터와 쓰면 왼쪽에 있어야 한다
    	  System.out.println("method4$$$");
      }
      
}
