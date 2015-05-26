package oop07.nestedClass;

public class InnerClassAnonyServiceImpl {
	String data = "Hello Anonymous World !!";
	public void print(){
		new InnerClassAnonyService(){

			public void printData() {
				System.out.println("익명 내부 클래스 출력 :" + data);
			}
			
		}.printData();
		/*
		 Inner inn = new Inner();
		 inn.get Data();
		 
		 
		 new Inner(){}.getData();    //메모리를 아낄수있음, 내부클래스기법
		 */
	}
	
}
