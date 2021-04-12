package p07.lecture.p4access_modifier_protect.packange1;

public class NotChild {
  public void notChildMethod() {
	  Parent p = new Parent();
	  p.publicMethod();
	  p.protectedMethod();
	  p.defaultMethod();
	  p.dMethod();
  }
}
