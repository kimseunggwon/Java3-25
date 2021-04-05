package p05.lecture;

import java.util.Arrays; //컨트롤+쉬프트+영문자 O


public class A21ArrayCopyAPI {
	public static void main(String[] args) {
		//System.arry.copy(p1,p2,p3,p4,p5);
		//p1 : 원본 배열
		//p2 : 원본 배열의 시작 index
		//p3 : 복사본 배열
		//p4 : 복사본 배열의 시작 index
		//p3 : 길이
		
		int[] arr1 = {9,7,5,3,1};
		int[] arr2 = new int[10];
		
		//복사전
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//복사
		System.arraycopy(arr1, 0 , arr2, 0 ,5);
		
		//복사후
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}

}
