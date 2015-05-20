package oop01.syntax;
	
public class CoffeeB {
	CoffeeB() {
		System.out.println("돈을 넣다.");
		}
	
		CoffeeB(int money){
			this();
			//this는 위에있는것을 가리키는 표시
			System.out.println(money + "원");
		}
		
		CoffeeB(int money, boolean exist){
			this(money);
			System.out.println("구매 가능 여부 :" +(exist == true ? " 커피종류선택" : "커피없음"));
		}
		
}
