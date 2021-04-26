package 생활코딩.part1.MyApp;

public class AccountingApp {
	public static double ValueOfSupply ;
	public static void main(String[] args) {
		
		//각각의 변수들이 어떤 데이터를 갖는지
		//변수로 통해 우리는 이름을 붙여줬다.

		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = getVAT();//여기서 get은 클래스가 사용되도록 하는것
		double total = ValueOfSupply + vat;
		double expense = getVAT(ValueOfSupply, expenseRate);
		double income = ValueOfSupply - expense;
		
		
		double[] dividendRates = new double[3];
		dividendRates[0] =0.5;
		dividendRates[1] =0.3;
		dividendRates[2] =0.2;
		
		double dividend1 = income *dividendRates[0];
		double dividend2 = income *dividendRates[1];
		double dividend3 = income *dividendRates[2];
		
		System.out.println("Value of supply :" + ValueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Votal : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1: " + dividend1);
		System.out.println("Dividend 2: " + dividend2);
		System.out.println("Dividend 3: " + dividend3);
	}

	public static double getVAT() {
		return ValueOfSupply * vatRate;
	}
	
	
	
}
