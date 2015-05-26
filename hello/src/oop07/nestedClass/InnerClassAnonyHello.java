package oop07.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService{
		public void greet(String name);
	}
	public void SayHello(){
		/*
		 내부클래스 인터페이스 구현 방법 1번째
		 */
		class EnglishGreetServiceImpl implements GreetingService(){
	

		@Override
		public void greet(String name) {
				System.out.println("Hello" +name);
			}
		}
		GreetingService eng = new EnglishGreetServiceImpl();
		
		/*
		 내부클래스 인터페이스 구현 방법 2번째
		 */
		GreetingService kor = new GreetingService() {
			
			@Override
			public void greet(String name) {
		
					System.out.println("안녕하세요." +name);
				
			}
		};
		eng.greet("TOM");
		kor.greet("톰");
	}
	public static void main(String[] arg){
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.SayHello();
	}
		
}
