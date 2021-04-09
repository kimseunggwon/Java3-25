package p06.lecture.p8access_modifier.package1;

public class MyClass1 {
	public int i;
	private int j;
	int k; //default,package private //아무것도 안쓴게 디폴트
	
	void method() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
