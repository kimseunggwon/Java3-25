package p02.textbook;

public class FloatDoubleExample {

	public static void main(String[] args) {
	 //실수값 저장
	 double var1 = 3.14;
	 //float var2 =3.14; //컴파일 에러(type mismatch)
	 float var3 = 3.14F;
	 
	 //정밀도 테스트
	 double var4 =0.1234567890123456789;
	 float var5 =0.1234567890123456789F;
	 
	 
	 System.out.println("var1:"+var1);
	 System.out.println("var3:"+var3);
	 System.out.println("var4:"+var4);
	 System.out.println("var5:"+var5);
	 
	}

}
