package p05.lecture.enumType;

public class A01EnumType {
  public static void main(String[] args) {
	MyClass o1 = new MyClass();
	
	MyEnum e1 = MyEnum.MT_VALUE;
	MyEnum e2 = MyEnum.VALUE1;
	MyEnum e3 = MyEnum.VALUE2;
	
	MyEnum e4 = MyEnum.MT_VALUE;
	
	System.out.println(e1 == e4); //같은거
	System.out.println(e1.equals(e2)); //true or false
	System.out.println(e3.toString()); // 값호출
	System.out.println(e4.hashCode()); //hash코드번호 호출
   }
}
class MyClass {
	
}
