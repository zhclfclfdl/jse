package cmm01.var;
/*
 Data : 2015.05.11 
 Author : 이현석
 Description : 캐스팅 문법에 대한 학습자료
 */
class CastingDemo{
	public static void main(String[] args) {
		
/*
 Up-Casting
 변환(Conversion)
 promotion
 묵시적(Implict) 자동변환
 자동형 변환은 데이터 타입의 표현범위가 작은쪽에서
 많은 쪽으로 변환이 될때만 가능하다
 byte -> short -> int -> long -> float -> double
 char -> int		
*/		
		byte varByte = 1;
		int varInt = 123;
		double varDouble = 123.456;
		
		int upByte = varByte;
		double upByte2 = varByte;
		double upInt = varInt;

	}
	/*
	 Down Casting
	 캐스팅(Casting)
	강제 형변환
	프로그램에서 명시적으로 지정하는 타입변환
	축소변환이 되는 경우에는 반드시 명시적으로 캐스팅하여야 한다.
	단, 데이터 손실이 발생 할 수 있다
	 */
	
	double varDou = 123.456;
	int varInt2 = 1;
	//int downByte = (int).varDou;
	byte var02 = (byte) varInt2;
	
	
	

		

}
	
