package p07.textbook.s070313;

public class Dog extends Animal{
   public Dog() {
	   this.kind = "표유류";
   }
   
   @Override                         //추상 메소드 재정의
   public void sound() {
	   System.out.println("멍멍");      
   }
}
