package p09.textbook.s090302;

public class A {
       int field1;
       void method1() { }
       
       static int field2;
       static void method2() { }
       
       class B {               //calss b
    	   void method() {     //모든 필드와 메소드에
    		   field1 = 10;    // 접글할 수 있다
    		   method1();
    		   
    		   field2 = 10;
    		   method2();
    	   }
       }
       
       
       static class C {
    	   void method() {
    		   //field1 = 10;     //인스턴스 필드와 메소드는
    		   //method1();       //접근할 수 없다.
    		   
    		   field2 = 10;
    		   method2();
    	   }
       }
}
