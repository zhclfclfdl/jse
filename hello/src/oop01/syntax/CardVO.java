package oop01.syntax;

public class CardVO {
	String kind; //카드 무늬
	int number; //카드 숫자
	static int width = 150; //카드의 너비
	static int height = 150; //카드의 높이
	
	CardVO(String kind, int number){
		System.out.println("카드의 무늬 : "+kind);
		System.out.println("카드의 숫자 : "+number);
	}

	
	CardVO(int width, int height){
		//System.out.println("카드의 넓이: "+width);
		//System.out.println("카드의 높이: "+height);
	}
	
	

}
