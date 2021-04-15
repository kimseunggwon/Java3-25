package p08.lecture.ex5;

public class A02Instanceof {
    public static void main(String[] args) {
		KindaDog d1 = new Malamute();
		
		System.out.println(d1 instanceof KindaDog);  //왼쪽 참조변수 //오른쪽 클래스명
		               //  d1 = KindaDog는 같기에 결과는 true
		System.out.println(d1 instanceof Malamute); //true
		System.out.println(d1 instanceof Pet); //true
		System.out.println(d1 instanceof SledDog); //true
		System.out.println(d1 instanceof Wolf); //false
		
		Malamute m1 = (Malamute) d1;
		Pet p1 = (Pet) d1;
		SledDog s1 = (SledDog) d1;
		Wolf w1 = (Wolf) d1;
		
		System.out.println("프로그램종료");
	}
}
