package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		
		CardVO yourCard = new CardVO("heart", 7);
		CardVO myCard = new CardVO("heart", 3);
		myCard.kind = "heart";
		myCard.number = 3;
		yourCard.number = 7;
		//myCard.width = 10;
		//myCard.height = 10;
		
		/*yourCard 인스턴스를 생성하시고
		 *무늬 heaert, 숫자는 7이 나왔다고
		 *가정할 때
		 *게임 룰은 높은 숫자 카드가 승리하는 게임입니다. 
		 */
		
		System.out.println("당신의 카드의 숫자는 " +yourCard.number+" 이고"
						+ "\n"+"나의 카드의 숫자는 " +myCard.number+ " 이므로"
						+ "\n"+"당신이 이겼습니다.");
		System.out.println("나의 카드의 넓이 : "+myCard.width
						 + "\n"+ "나의 카드의 높이 : "+myCard.height);
	}
}
