package oop07.nestedClass;
/*
내부클래스 의 세번째 형태.
- Local 내부 클래스에서는 외부 클래스의 멤버를 접근하는데 있어서
- 제한이 따른다. 우선 외부 클래스의 멤버변수는 접근을 할 수 있다.
- 하지만 메서드 내에 있는 지역변수는 접근할 수 없다.
*/
public class InnerClassLocal {
	int a = 100;
	public void InnerTest(int k){
		int b = 200;
		final int c = k;
		class Inner{
			public void getData(){
				System.out.println("멤버변수 a :" +a);
				System.out.println("상수 c  :" +c);
				/*
				*System.out.println("지역변수 b" +b);
				*이렇게 코딩하면 b  에서 접근할 수 없다는
				*에러메세지가 뜬다.
				 */
				
			}
		}
		Inner inn = new Inner();
		inn.getData();
		
	}
}
