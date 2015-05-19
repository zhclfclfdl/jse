package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요 : ");
		String ssn = scanner.nextLine();
		
		char ch = ssn.charAt(7);

		switch (ch) {
		case '1': case '3': System.out.println("남자"); break;
		case '2': case '4': System.out.println("여자"); break;
		case '5': case '6': System.out.println("외국인"); break;

		default:System.out.println("잘못입력하셨습니다");
			break;
		}
	}
}
