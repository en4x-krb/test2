
public class ExistingTaxCalc implements IncomeTax{

	@Override
	public void calcTax(int i) {
		System.out.println("Salary : "+i+" Tax : "+i*10/100);
	}
}
