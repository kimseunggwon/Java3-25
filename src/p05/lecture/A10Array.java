package p05.lecture;

public class A10Array {
	// 그림 : 06.배열.png
	public static void main(String[] args) {
		//array (배열) :여러개의 값을 갖는 자료형
		
		int i;
		i = 5;
		
		int[] arr;  //배열도 참조타입
		arr = new int[3]; //int 3개를 담을수있는 저장공간이 생김
		
		arr[0] = 5;
		arr[1] = 7;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//한번에 출력
	//	System.out.println(Array.toString(arr));
		
		
	}

}
