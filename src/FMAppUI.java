
public class FMAppUI extends ExistingTaxCalc {

	public static void main(String[] args) {
		IncomeTax incomeTax;
		incomeTax=new AdapterTax();
		incomeTax.calcTax(134000);
	}
}
