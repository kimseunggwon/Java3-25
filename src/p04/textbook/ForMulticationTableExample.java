package p04.textbook;

public class ForMulticationTableExample {

	public static void main(String[] args)
	{       //2단~9단
		for (int m = 2; m <= 9; m++) {
		System.out.println("***" + m + "단 ***");
		for (int n = 1; n <= 9; n++) {
		System.out.println(m + "x" + n + "=" + (m * n));
			}
		}
		System.out.println("2단~9단 짝수단");
		//2단~9단 짝수단
		for (int m = 2; m <= 9; m+=2) {
			System.out.println("***" + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
			System.out.println(m + "x" + n + "=" + (m * n));
				}
			}
		System.out.println("2단~9단 *곱하기짝수만");
		//2단~9단 *곱하기짝수만
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
			System.out.println(m + "x" + n + "=" + (m * n));
				}
			}
		System.out.println("9단~2단 (9*1 부터 시작)");
		//9단~2단 (9*1 부터 시작)
		for (int m = 9; m >= 1; m--) {
			System.out.println("***" + m + "단 ***");
			for (int n = 9; n >= 2; n--) {
			System.out.println(m + "x" + n + "=" + (m * n));
				}
			}
		System.out.println("9단~2단 (9*9 부터 시작)");
		//9단~2단 (9*9 부터 시작)
		for (int m = 9; m >= 1; m--) {
			System.out.println("***" + m + "단 ***");
			for (int n = 9; n >=2; n--) {
			System.out.println(m + "x" + n + "=" + (m * n));
			}
		}
	}
}
