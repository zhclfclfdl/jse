package oop01.syntax;

class CoffeeA(){ 

		CoffeeA() {
		System.out.println("돈을 넣다.");
		}
		CoffeeA(int money){
			System.out.println(money + "원");
		}
		CoffeeA(int money, boolean exist){
			System.out.println("구매 가능 여부 :" +(exist == true ? "커피종류선택" : "커피없음"));
		}
}

public class CoffeeAMain {
	public static void main(String[] args) {
		CoffeeA coffeeA = new CoffeeA();
		CoffeeA coffeeAA = new CoffeeA(500);
		CoffeeA coffeeAAA = new CoffeeA(500, true); 
	}
}


