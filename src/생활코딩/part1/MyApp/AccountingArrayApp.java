package 생활코딩.part1.MyApp;

public class AccountingArrayApp {
	public static void main(String[] args) {
		
		//각각의 변수들이 어떤 데이터를 갖는지
		//변수로 통해 우리는 이름을 붙여줬다.

		double ValueOfSupply =Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueOfSupply * vatRate;
		double total = ValueOfSupply + vat;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - expense;
		double dividend1 = income *0.5;
		double dividend2 = income *0.3;
		double dividend3 = income *0.2;
		
		System.out.println("Value of supply :" + ValueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Votal : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1: " + dividend1);
		System.out.println("Dividend 2: " + dividend2);
		System.out.println("Dividend 3: " + dividend3);
		

	}
}
