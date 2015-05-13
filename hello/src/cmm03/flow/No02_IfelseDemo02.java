package cmm03.flow;

import java.util.Scanner;

public class No02_IfelseDemo02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요..");
		int kor, eng , math, sum = 0;
		double avg = 0.0;
		String msg = "message";
		
		System.out.println("국어점수를 입력하세요");
		kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scanner.nextInt();
		
		sum = kor + eng + math;
		avg = sum/3;
		//avg = (int)sum/3; 소수점 제거
		//avg = Math.floor(sum/3); 
		
		if (avg==100) {
			msg = "보너스 지급";
		}
		else if (avg > 70) {
			msg = "시험 합격입니다.";
		}
		else {
			msg = "재시험을 보세요";
		}
		
		System.out.println("국어 = " +kor);
		System.out.println("영어 = " +eng);
		System.out.println("수학 = " +math);
		System.out.println("평균 = " +avg);
		//System.out.println("평균 = " +(int)avg);  소수점 제거
		System.out.println("귀하의 시험결과 "+msg+" 입니다.");
	}
}
