package p04.lecture;
public class A08Switch {
	public static void main(String[] args) {
         //switch case : 값이 일치하는 case문부터 실행
		//만약 일치하는 case 가 없으면 default 부터 실행
		//사용할 수 있는 type :byte, short ,char ,int ,string ,Enum
		
		 int a =1;
		 
		 switch(a) {
		 case 1 :
			 System.out.println("케이스1");
			 break; //break문 적절히 작성
		 case 2 :
			 System.out.println("케이스2");
			 break;
		 case 3 :
			 System.out.println("케이스3");
		     break;
	   }
	}
}