package p09.textbook.exercise.ex5;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous(); //인스턴스
		anony.field.run(); //필드
		anony.method1();   //메소드
		anony.method2(
				new Vehicle () {

					@Override
					public void run () {
						System.out.println("트럭이 달리는중입니다");
						
					

		);
	}
}
