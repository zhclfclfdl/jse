package api01.Lang.thread;

public class BankSyncDemo {
	public static void main(String[] args) {
		//사용자 정의 타입의 배열을 생성하는 방법은 아래와 같다.
		Customer[]  customers = new Customer[3];
		Account hong = new Account("홍길동");
		Account kim = new Account("김길동");
		Account moon = new Account("문길동");
		customers[0] = new Customer(hong, "강남점", 100);
		customers[0].start();
		customers[1] = new Customer(kim, "종로점", 100);
		customers[1].start();
		customers[2] = new Customer(moon, "마포점", 70000);
		customers[2].start();

	}
}
class Account{
	String name;
	int total;
	/*
	 코딩습관 : 생성자를 생성시킬 때는
	 무조건 필드를 선언 후 바로 Ctrl + Space Enter
	 */
	/*
	 생성자 오버로딩을 하려고 할때는 
	 자동생성 시킨 생정자에다 this("", 0, null) 이런식으로
	 String 이면 "", int 면 0, 객체면 null 을 주면 된다.
	 */
	public Account() {}
	public Account(String name) {
		this.name = name;
	}
	/*
	 파라미터값 int money : 입출금
	 파라미터값 String location : 지점
	 */
	public void deposit(int money, String location){
		total += money;
		try{
			Thread.sleep(1000);
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("["+location+"]"+money+"원 입금함 /" 
					+ "총액 : "+total+" 원");
		}
	}
}
class Customer extends Thread{
	Account account; //사용자 정의 객체를 필드의 인스턴스 변수로 선언한다.
	int money;
	public Customer(Account object, String str, int i) {
		super(str); // super 를 사용하려면 가장 먼저 호출해야 함.
		//this.account = object; 해도 에러는 나지않지만 가독성을 위해
		this.account = object;
		this.money = money;
	}
	@Override
	public void run() {
		//this.getName() 은 스레드가 이미 구현한 메소드를
		//가져다 쓰겠다는 뜻.
		account.deposit(money, this.getName());
	}
}