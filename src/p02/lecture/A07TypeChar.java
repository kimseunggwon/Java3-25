package p02.lecture;

public class A07TypeChar {

	public static void main(String[] args) {
		//char : 2byte (8bit) 문자 저장
		
		
		//javascript
		// var a = 'a';
		//     a = "가";
		
		
		//java에서는 문자열을 사용할려면 string 타입을 사용해야 한다
		String s1 = "hello"; // 큰 따음표 string literal
		s1 = "자바";
		s1 = "a";
		s1 = "자";
		s1 = "";
		
		//java 문자
		char charVar;
//		charVar ="a"; //큰 다음표 사용X
		charVar ='a'; //하나의 문자를 저장할려면 작은 따음표 사용 
		charVar ='눈'; 
		System.out.println(charVar);
		charVar = '\uB208'; // 눈 
		System.out.println(charVar);
		charVar = 45576;
		System.out.println(charVar);
		
//		charVar=''; //빈 문자열은 안된다
		
		charVar ='\u10E6';
		System.out.println(charVar);
		
	}

}
