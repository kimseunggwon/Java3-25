package p07.lecture.p4access_modifier_protect.packange2;

import p07.lecture.p4access_modifier_protected.package2.Parent;
public class Child extends parent{

	public void childMethod() {
		publicMethod(); // ok
		protectedMethod(); // ok
//		defaultMethod(); // not ok
//		privateMethod(); // not ok
		
		
	}
}

