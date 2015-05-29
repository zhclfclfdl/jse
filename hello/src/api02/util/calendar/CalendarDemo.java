package api02.util.calendar;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar date = new Calendar(); 
		date.add(Calendar.HOUR, - 7);
		System.out.println(toString(date));
		
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 45);
		System.out.println("수정용 시간표");
		System.out.println(date.get(Calendar.HOUR)+"시");
		System.out.println(date.get(Calendar.MINUTE)+"분");
		System.out.println(date.get(Calendar.SECOND)+"초");

		
	}
	
}
public static String toString(Calendar date){
	return date.get(Calendar.YEAR)+"년"
			+ date.get(Calendar.MONTH)+"월"
			+ date.get(Calendar.DATE)+"일";
}