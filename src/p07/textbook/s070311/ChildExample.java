package p07.textbook.s070311;

public class ChildExample {
 public static void main(String[] args) {
	Parent parent = new Child();           //강제 타입 변환
	parent.field1 = "data1";
	parent.method1();
	parent.method2();
	
	
	/*       //불가능
	 parent.field2 = "data";
	 parent.method3();     
	 	 */
	
	Child child = (Child) parent;        // 강제 타입 변환
	child.field2 = "yyy"; //가능
	child.method3();      //가능
   }
}


