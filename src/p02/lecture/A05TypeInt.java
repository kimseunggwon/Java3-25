package p02.lecture;

public class A05TypeInt {

	public static void main(String[] args) {
		// int :4byte(32bit)
		
		//십진법 0 : 0000 0000 0000 0000 0000 0000 0000 0000
		//십진법 1 : 0000 0000 0000 0000 0000 0000 0000 0001
		//십진법 2 : 0000 0000 0000 0000 0000 0000 0000 0010
		//         :
	//   2147483647: 0111 1111 1111 1111 1111 1111 1111 1111
		//최대값   :  2147483647
	    //최소값   : -2147483648
		
		//16진법 :  0 ~ F
		// 2진법 : 0000~1111
		//10진법 :  0 ~ 15
		
		//css color : rgb(255,255,255)
		//            #ffffff
		
		
		int intVar;
		intVar = 0;
		intVar =   2147483647;
		intVar =  -2147483648;
		
		intVar =255;
		System.out.println(intVar);
		intVar =0xFF;
		System.out.println(intVar);
		intVar =0377;
		System.out.println(intVar);

	}

}
