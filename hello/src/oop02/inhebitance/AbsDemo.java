package oop02.inhebitance;

public abstract class AbsDemo {
		public static void main(String[] args) {
			Sum01 sum01 = new Sum01();
			System.out.println(sum01.sum(10, 20));
			System.out.println(sum01.toString());
			Sum02 sum02 = new Sum02();
			System.out.println(sum02.sum(10, 20));
			System.out.println(sum02.toString());
		}
}
abstract class AbsSum{
	//필수적으로 강제성이 있는 메소드
	public abstract String toString();
	public String sum(int i, int k){
		int sum = i+k;
		return ""+sum; //int 리턴을 string 반환값으로 주는 방법
	}
		
}
class Sum01 extends AbsSum{

	//@Override 우선으로 해야할일
	public String toString() {
		// 해야할일=TODO Auto-generated method stub   
		return "class Sum01 extends AbsSum";
	}
	
}
class Sum02 extends AbsSum{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class Sum02 extends AbsSum";
	}
	
}