package oop01.syntax;

public class PayC {
	private String name;
	private int salary;
	public static final double Tax = 0.1; //세율 0.1%
	private int  income; //실급여 = 급여 - 급여*세율
	private int taxVal;
	
	
	public void setTaxVal(int salary) {
		this.taxVal = (int) (salary*Tax);
	}
	
	public void setIncome(int salary) {
		this.income = salary - taxVal;
	}
	
	public int getTaxVal() {
		return (int)taxVal;
	}

	public int getIncome() {
		return income;
	}
	
}
