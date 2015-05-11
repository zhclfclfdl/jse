package cmm01.var;

public class EscapeDemo {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 85;
		int sum = 0;
		
		sum = kor + eng;
		
		System.out.println("성적체크");
		System.out.println("국어\t 영어\t총점");
		System.out.println(kor+ "\t"+ eng +"\t"+ sum);
	}
}
