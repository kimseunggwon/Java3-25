package p11.textbook.s110301;

public class MemberExample {
 public static void main(String[] args) {
	Member obj1 = new Member("blue"); //참조값이 달라도 같은값으로 보겠다고
	Member obj2 = new Member("blue"); //equlas에 명시했다
	Member obj3 = new Member("red");
	
	System.out.println(obj1.equals(obj1)); //당연히 true읻
	
	if(obj1.equals(obj2)) {
		System.out.println("obj1과 obj2는 동등합니다");
	}else {
		System.out.println("obj1과 obj2는 동등하지 않습니다");
	}
	
	
	if(obj1.equals(obj3)) {
		System.out.println("obj1과 obj3은 동등합니다.");
	} else {
		System.out.println("obj1과 obj3은 동등하지 않습니다");
	}
 }
}
