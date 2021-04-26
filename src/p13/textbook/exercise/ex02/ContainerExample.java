package p13.textbook.exercise.ex02;

public class ContainerExample {
 public static void main(String[] args) {
	Container<String> container1 = new Container<String>();
	container1.set("홍길동"); //set메소드 넣어보고
	String str = container1.get(); //     꺼내보고
	
	Container<Integer> container2 = new Container<Integer> ();
	container2.set(6);
	int value  = container2.get();
 }
}
