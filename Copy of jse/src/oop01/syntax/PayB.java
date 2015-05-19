package oop01.syntax;

public class PayB {
	public static void main(String[] args) {
		
		String hulk = "헐크";
		int hulkSalary = 200;
		//double hulkTax = hulkSalary*0.1;
		//int hulkIncome = (int) (hulkSalary - (hulkSalary*0.1));
				
		
		String iron = "아이언";
		int ironSalary = 300;
		//double ironTax = ironSalary*0.1;
		//int ironIncome = (int) (ironSalary - (ironSalary*0.1));
				
		String tor = "토르";
		int torSalary = 500;
		//double torTax = torSalary*0.1;
		//int torIncome = (int) (torSalary - (torSalary*0.1));
				
		
		PayA hulkPay = new PayA();
		hulkPay.setTaxVal(hulkSalary);
		hulkPay.setIncome(hulkSalary);
		
		PayA ironPay = new PayA();
		ironPay.setTaxVal(ironSalary);
		ironPay.setIncome(ironSalary);
		
		PayA torPay = new PayA();
		torPay.setTaxVal(torSalary);
		torPay.setIncome(torSalary);
		
		System.out.println("=== "+hulk+"의 5월 급여내역===");
		System.out.println("급여 : "+hulkSalary);
		System.out.println("세금 : "+hulkPay.getTaxVal());
		System.out.println("실수령액 : "+hulkPay.getIncome());
		
		System.out.println("=== "+iron+"의 5월 급여내역===");
		System.out.println("급여 : "+ironSalary);
		System.out.println("세금 : "+ironPay.getTaxVal());
		System.out.println("실수령액 : "+ironPay.getIncome());
		
		System.out.println("=== "+tor+"의 5월 급여내역===");
		System.out.println("급여 : "+torSalary);
		System.out.println("세금 : "+torPay.getTaxVal());
		System.out.println("실수령액 : "+torPay.getIncome());
	}
}
