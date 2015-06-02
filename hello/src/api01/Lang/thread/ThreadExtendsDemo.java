package api01.Lang.thread;

public class ThreadExtendsDemo {
	public static void main(String[] args) {
		//객체인 thr 참조변수 생성한 것.
		ThreadExtends thr = new ThreadExtends();
		/*지금까지 배운바로는
		  클래스 객체를 생성하면 그 참조변수, 메소드 명으로
		  호출했지만 스레드는 thr.run() 하는게아니라
		  thr.start() 라고 해야한다.
		*/
		thr.start();//최초호출 start만 하면된다
	}
}
class ThreadExtends extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++){
			/*
			 클래스 생성자에서 this() 또는 this. 은
			 자기 클래스 내부의 생성자 및 인스턴스 변수를
			 뜻하는 것처럼, super() 또는 super. 은
			 상속받은 부모클래스의 생성자 및 인스턴스 변수를 뜻한다.
			 */
			System.out.println(super.getName());
		}
	}
}