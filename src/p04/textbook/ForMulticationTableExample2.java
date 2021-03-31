package p04.textbook;

public class ForMulticationTableExample2 {

	public static void main(String[] args) {
		/*
		System.out.println("새로운 줄");
		System.out.println("새로운 줄");
		System.out.print("같은 줄");
		System.out.print("같은 줄");
		System.out.println("새로운 줄");
		 */
	    /*
        *
        **
        ***
        ****
        *****
		 */
		System.out.println("문제1");
		for (int i = 0; i < 5; i++) { //5개의 줄생성
			for (int j = 0; j <= i; j++) {//행의 순서만큼(첫번째 줄이면 1
				System.out.print("*");    //두번째 줄이면2) 반복
			}
			System.out.println();//줄 바꿈
		}
	/*
		 *****
		 ****
		 ***
		 **
		 *
	*/
		System.out.println("문제2");
	
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 *****
		  ****
		   ***
		    **
		     *
      */
		System.out.println("문제3");
		for (int i = 0; i < 5; i++) {
			for (int k= 0; k < i; k++)  {
				System.out.print(" ");
			}
		    for (int j = 0; j < (5-i); j++) { //j는 스페이스를 몇번찍을지 결정
			    System.out.println("*");
			}
			System.out.println();
		}
	/*
		     *
		    **
		   ***
		  ****
		 *****
		 */
		System.out.println("문제4");
		for (int i = 0; i <5; i++) {
			for (int k= 0; k < (4-i); k++)  {
				System.out.print(" ");
			}
		    for(int j=0; j <= i; j++) { //j는 스페이스를 몇번찍을지 결정
			 System.out.println("*");
			}
			System.out.println();
	  }
  }
}
