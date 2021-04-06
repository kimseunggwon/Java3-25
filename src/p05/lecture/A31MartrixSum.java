package p05.lecture;

import java.util.Arrays;

public class A31MartrixSum {
	public static void main(String[] args) {
		int[][] mat1 = { //4행3열
				{1,2,3},
				{5,6,7},
				{9,8,7},
				{2,3,4},
		};
		
       int[][] mat2 = { //4행3열
    		   {2,3,4},
    		   {77,88,99},
    		   {3,2,1},
    		   {0,1,2},
       };

       //두개 행렬 더하는 메소드 완성하기
       int[][] mat3 = sum2(mat1,mat2);
       
       for(int[] row :mat3) {
    	   System.out.println(Arrays.toString(row));
       }
	}

	private static int[][] sum2(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];  //a b는 같으니 a,b둘중 아무거나 넣어도 됨
		for(int i=0;  i<c.length;i++) {  //i는 행을 나타냄 
			for(int j =0; j<c.length; j++) { //j는 열을 나타냄
			  c[i][j]= a[i][j]+b[i][j];
		} 
    }
		return c;
	}
 }
   
	
	
	
 

