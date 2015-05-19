package cmm03.flow;

import java.util.Scanner;
//객체지향 - 타인이 짜둔 코드를 특별한 출력을 통해 끌고오는것
public class No02_IfelseDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요..");
		/*int i;
		i = 0;*/
		int i = 0;
		i = scanner.nextInt();
		System.out.println("입력 값은 "+i+" 입니다.");
	}

}
