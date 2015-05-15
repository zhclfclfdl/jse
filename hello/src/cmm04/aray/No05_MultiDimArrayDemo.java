package cmm04.aray;

public class No05_MultiDimArrayDemo {
	public static void main(String[] args) {
		String[][] names = {
				{"Mr.","Ms.","Mrs."},
				{"Smith","Johns","Alex"}};
		System.out.print("출력 : "+names[0][0]+names[1][0]+"\n");
		System.out.print("출력 : "+names[0][1]+names[1][2]);
	}
}
