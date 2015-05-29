package api02.util.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*
 * java.util.Arrays 의 메소드인
 * sort() 는 오름차순 정렬에 특화되었다.
 */
public class SortDemo {
	public static void main(String[] args) {
		ArraysDemo ad = new ArraysDemo();
		ArraysDemo ad2 = new ArraysDemo();
		/*
		 * List 를 코딩하면 이클립스가 import 하라고 제시하는
		 * 패키지가 둘인데 java.awt.List 와 java.util.List 가 보인다
		 * 여기서 java.util.List 를 선택하면됨
		 */
		List<Integer> list = new ArrayList<Integer>();//에러가 생길때 위에 import java.util.Arrays 를 선언
		List<Integer> list2 = new ArrayList<Integer>();
		int[] arr = {8,0,6,4,2};
		list = ad.getAscSort1(arr);
		list2 = ad.getAscSort2(arr);
		System.out.println("스왑알고리즘으로 출력 : " +list.toString());
		System.out.println("Arrays.soft() 로 출력 : " +list2.toString());
	}
}
class ArraysDemo{
	//Integer 는 int 형의 Wrapper Class 다
	//즉 기본형인 int 를 객체화 시킨 것
	//벡터는 기본형을 담을 수 없기 때문에 int 형을
	//담을 경우가 생기면 이처럼 wraper class 를 사용한다
	Vector<Integer> vec = new Vector<Integer>();
	
	public Vector<Integer> getAscSort1(int[] arr){
		/*
		 * 아래 로직은 오름차순 정렬 알고리즘인
		 * 스왑알고리즘이다
		 * 바깥쪽 for 문의 limit 의 arr.length-1 인 것에 주의
		 * 안쪽 for 문에서 begin 시작값이
		 * int j = i 인 것에 주의
		 */
		int temp = 0;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i; j<arr.length; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		/*
		 * 아래 for 문은 확장된 for 문이라고 합니다
		 * 인덱스를 디테일하게 정하지 않고
		 * 전체를 처리하는 경우는 일일이 시작과 limit 인덱스값을
		 * 정하지 않고 아래 처럼 처리합니다.
		 */
		for(int k : arr){
			vec.add(k);
		}
		return vec;
	}
	public Vector<Integer> getAscSort2(int[] arr){
		Arrays.sort(arr);
		/*
		 * 위 쪽 스왑알고리즘을 단 한줄 sort() 로 정리
		 */
		for(int k : arr){
			vec.add(k);
		}
		return vec;
	}
}
