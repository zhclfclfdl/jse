package oop01.syntax;

public class AverageC {
	//필드 선언
		String name;
		int kor; //국어
		int eng; //수학
		int tot; //합계
		double avg;
		
		//이름 저장기능
		public void setName(String name){//() 이 괄호안에 있는것을 파라미터(parameter)라 한다
			//this. 를 치면 뒤에 인변이 나옴
			this.name = name; //
		}
		//국어점수 구하는기능
		public void setKor(int kor) {
			this.kor = kor;
		}
		//영어점수 구하는 기능
		public void setEng(int eng) {
			this.eng = eng;
		}
		//합계점수 구하는 기능
		public void setTot(int kor, int eng) {
			this.tot = kor + eng;
		}
		//평균점수를 구하는 기능
		public void setAvg(int tot) {
			this.avg = tot/2;
		}
		//평균 점수를 구하는 기능 (2) 국어,영어점수2개만으로 구하기
		//Overloading 오버로딩
		public void setavg(int kor, int eng) {
			
			this.avg = (kor + eng)/2;
		}
}
