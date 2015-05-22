package oop02.inhebitance;

class Aclass {
	void over(int i){
		System.out.println("Aclass-over 메소드를 실행한 결과 : "+ i*10);
	}
	void noover(int i){
		System.out.println("Aclass-noover 메소드를 실행한 결과 : " +i);
	}
}
class Bclass extends Aclass{
	void over(int i){
		System.out.println("Aclass-over 메소드를 실행한 결과 : "+ i*500);
	}
	void noover(String s){
		System.out.println("Aclass-noover 메소드를 실행한 결과 : " +s);

	}
	void onlyB(){
		System.out.println("Bclass-onlyB 메소드를 실행한 결과");
	}
}

public class ObjectCastingDemo {
	public static void main(String[] args) {
		//일반적인 객체생성
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		
		//부모타입 객체 = new 자식타입
		Aclass a2 = new Bclass();
		//오버라이딩시 자식클래스의 메소드를 우선 호출
		a2.over(3);
		//오버라이딩을 하지 않으면 부모 메소드를 우선 호출
		a2.noover(6);
		//부모클래스 타입을 자식클래스 타입으로 강제 형변환
		Bclass b2 = (Bclass)a2;
		b2.over(1);
		b2.noover("BBB");
		b2.onlyB();
	}
}
