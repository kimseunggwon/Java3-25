package p05.lecture;

public class A23ForEach {
	public static void main(String[] args) {
		// for each
		// 향상된 for문
		
		int[] arr1 = {9 , 8, 7 ,6};
		
		// for
		for (int i =0; i <arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	   // for each
		for (int n : arr1) { //arr1은 4개 아이템을 가지고있어서, int n: 은 4개 아이템이 실행된다 
			System.out.println(n);
		}
	}

}
