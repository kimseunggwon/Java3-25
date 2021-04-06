package p05.lecture;

import java.util.Arrays;

public class A30ArraySumMethod {

	public static void main(String[] args) {
		int[] arr1 = {8,7,6,5,4,3,};
		int[] arr2 = {99,88,77,66,55,44,};
		
		int[] arr3 = sum(arr1,arr2);
		
		sum(arr1, arr2);   //참조값이 넘어간다 //참조값 c가 다시 반환된다.
		
		System.out.println("arr3:"+Arrays.toString(arr3));
		
		int[] arr4 = {1,2,3,};
		int[] arr5 = {5,6,7,};
		int[] arr6 = sum(arr4,arr5);
		
		System.out.println("arr6:"+Arrays.toString(arr6));
	}
	                     //타입 정수 //파라미터 변수명 A
	                     //자바스크립 function == 자바 method 
	public static int[] sum(int[]a , int[]b) { //void 대신 int[] 이므로 return 해줘야 한다
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int[] c = new int[a.length];
		
		for (int i =0; i<c.length; i ++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.println(Arrays.toString(c));
		
		return c; //return 키워드가 하는일을은 메소드 종료, 오른쪽 값 반환
		          //c 가 가지고 있는 참조값이 반환이됨 메소드를 호출한 곳으로 
		
	}

}
