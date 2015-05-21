package oop01.syntax;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		double height = 0;
		double weight = 0;
		int idx = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키를 입력해 주세요. : ");
		double height1 = scanner.nextDouble();
		
		System.out.print("몸무게를 입력해 주세요 : ");
		double weight1 = scanner.nextDouble();
		KaupVO vo = new KaupVO(height, weight);
		vo.setHeight(height1);
		vo.setWeight(weight1);
		vo.setIdx(height1, weight1);
		
		System.out.println("");
		
	
		vo.getMsg();
		
		
		
		System.out.println(vo.toString());
		System.out.println("완료");
	}
}
