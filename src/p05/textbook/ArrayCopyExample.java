package p05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array" , "copy"}; //각원소가 복사되는게 아닌 참조값이 복사되는것
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0 , newStrArray,0,oldStrArray.length);
		
		for(int i = 0; i <newStrArray.length; i++) {
			System.out.println(newStrArray[i]+",");
		}
	}

}
