
public class AdapterTax implements IncomeTax{

	@Override
	public void calcTax(int i) {
		NewTaxCalc calctax=new NewTaxCalc();
		calctax.TaxCalc(i);
	}

}
