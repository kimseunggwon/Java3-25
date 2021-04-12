package p07.lecture.p4access_modifier_protect.packange1;

public class Parent {
	
	public void publicMethod() {
		System.out.println("public method");
	}
	
	protected void protectedMethod(){
		System.out.println("protected method");
	}
	void defaultMethod() {
		System.out.println("defaul method");
	}
	
	
	private void provateMethod() {
		System.out.println("private method");
	}

}
