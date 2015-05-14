package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		String ssn = scanner.nextLine();
		char ch = ssn.charAt(7); //charAt(7)은 7번째값 01234567 번째값을 선택
		
		if(ch == '1' || ch == '3')
		{
			System.out.println("남자");
		}
		else if(ch == '2' || ch == '4')
		{
			System.out.println("여자");
		}
	
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
