package p04.lecture;
public class A18WhileSystemin{
	public static void main(String[] args) throws Exception {
		//너무 어려우면 복습 X
		//System.in : 키보드
		
		//System.in.read(): 키보드 키를 int로 리턴
		
		while (true) {
			int key = System.in.read();
			
			System.out.println(key);
		}
		
	}

}
