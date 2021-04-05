package p05.lecture;

import java.util.Arrays;

public class A25ArrayOfArray {
	//그림 :09
	public static void main(String[] args) {
		int[][] arr =new int[2][3];
		arr[1][1] = 9;
		arr[0][2]=  8; //arr 0번째 2번째 -->그림보고 이해
		
		for(int[] elem : arr) {
			System.out.println(Arrays.toString(elem));
		}

	}

}
