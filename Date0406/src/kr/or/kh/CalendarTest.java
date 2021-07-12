package kr.or.kh;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		
		
		Calendar myCalendar= Calendar.getInstance();
		myCalendar.set(Calendar.YEAR, 2021);
		myCalendar.set(Calendar.MONTH, 9);
		myCalendar.set(Calendar.DAY_OF_MONTH, 30);
		myCalendar.set(Calendar.HOUR_OF_DAY, 12);
		myCalendar.set(Calendar.MINUTE, 13);
		myCalendar.set(Calendar.SECOND, 3);
		
		//출력형식의 생성
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:mm:dd HH:mm:ss");
		Date date= myCalendar.getTime();
		
		System.out.println(sdf.format(date));
		
	}

}
