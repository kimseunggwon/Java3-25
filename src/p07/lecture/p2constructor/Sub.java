package p07.lecture.p2constructor;

public class Sub extends Super {
     
	 public Sub(int i) {
		 // 상위 클래스 생성자 호출
		 //super 여기 생성자에서만 사용가능
//		 this.i = i;
		 super(i); // 
	 }
}
