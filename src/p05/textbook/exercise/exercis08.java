package p05.textbook.exercise;

public class exercis08 {
	//전체항목 합과 평균값 구하기
	public static void main(String[] args) {
		int[][] array = {
				{95,86},     //첫번째 배열 2개
				{83,92,96},  //두번째 배열 3개
				{78,83,93,87,88} // 세번째 배열 3개
		};
		
		int sum =0;
		double avg =0.0;
		int cnt =0;  
		/*
		for(int i =0; i <array.length; i ++) {
			for (int j =0; j <array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		*/
		// 위에 이중for문이랑 똑같은거 
		// for each
		for (int[] row : array) { //array 각원소가 int 배열타입
			for (int n : row) {   //위 배열 아이템 전부 row 에 들어가는거
				sum +=n;
				cnt++; //cnt는 총합 //탐색할때 마다 1씩늘려주면 
				                    //결국 위 배열 총 10개 합이된다
			}
		}
		
		avg = (double) sum / cnt; //총합 
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
	}

}
