package p05.textbook;

public class ArrayCopyForExanmple {

	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};    //3저장장소
		int[] newIntArray = new int[5]; //5저장장소
		
		for(int i =0; i<oldIntArray.length; i ++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i <newIntArray.length; i ++) {
			System.out.println(newIntArray[i]+ ",");
		}

	}

}
