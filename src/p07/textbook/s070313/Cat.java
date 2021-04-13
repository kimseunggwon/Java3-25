package p07.textbook.s070313;

public class Cat extends Animal{
	public Cat() {
		this.kind = "표유류";
	}
	
	@Override                   //추상 메소드 재정의
	public void sound() {
		System.out.println("야옹");
	}

}
