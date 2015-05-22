package oop02.inhebitance;

/*
 Date : 2015.05.22
 Author : 이현석
 Desc : 멤버변수 상속에 관한 예제
 */
/*
 부모클래스 ◁ㅡ 자식클래스
 		    화살표를 가리키는 방향을 사용한다
 */
class Car{
	String name = "자동차";
}
class Hcar extends Car{
	String brand = "현대";
}
class Dcar extends Car{
	String brand = "대우";
}
public class MemberVarExtendsDemo {
	public static void main(String[] args) {
		Hcar h = new Hcar();
		System.out.print(h.brand + "\t");
		System.out.println(h.name + "\t");
		Dcar d = new Dcar();
		
		System.out.print(d.brand + "\t");
		System.out.println(d.name);
	}
}	
