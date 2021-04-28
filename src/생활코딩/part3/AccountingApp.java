package 생활코딩.part3;

public class AccountingApp {
         public static void main(String[] args) {
			
        	 double valueOfSupply = 1000.0;
        	 
        	 double vatRate = 0.1;
        	 double vat = valueOfSupply * vatRate;
        	 double total = valueOfSupply * vat;
        	 
        	 System.out.println("Value of supply :"+valueOfSupply);
        	 System.out.println("VAT:"+vat);
        	 System.out.println("Total:"+total);
		}
}
