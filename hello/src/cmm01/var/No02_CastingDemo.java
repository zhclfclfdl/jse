package cmm01.var;
/*
 Data : 2015.05.11 
 Author : ������
 Description : ĳ���� ���� ���� �н��ڷ�
 */
class No02_CastingDemo{
	public static void main(String[] args) {
		
/*
 Up-Casting
 ��ȯ(Conversion)
 promotion
 ������(Implict) �ڵ���ȯ
 �ڵ��� ��ȯ�� ������ Ÿ���� ǥ�������� �����ʿ���
 ���� ������ ��ȯ�� �ɶ��� �����ϴ�
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
	 ĳ����(Casting)
	���� ��ȯ
	���α׷����� ��������� �����ϴ� Ÿ�Ժ�ȯ
	��Һ�ȯ�� �Ǵ� ��쿡�� �ݵ�� ��������� ĳ�����Ͽ��� �Ѵ�.
	��, ������ �ս��� �߻� �� �� �ִ�
	 */
	
	double varDou = 123.456;
	int varInt2 = 1;
	//int downByte = (int).varDou;
	byte var02 = (byte) varInt2;
	
	
	

		

}
	
