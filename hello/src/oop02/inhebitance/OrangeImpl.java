package oop02.inhebitance;

public class OrangeImpl implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s +"오렌지입니다.");
		
	}
	/*
	 아래 메소드는 개발자가 임의로 작성한 것이므로
	 이 예제를 둔 이유는 아무리 개발자가 임의로 메소드를 추가하여도
	 main()(메인메소드) 에서는 사용할 수 없으므로
	 시키지않은 것은 하지 않도록 제어하는 사례
	 */
	public int getCount(){
		return 100;
	}

}
