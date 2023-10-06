package Temp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendarapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar= Calendar.getInstance();
		
		Date date=calendar.getTime();
		
		SimpleDateFormat sm=new SimpleDateFormat("YYYY-MM-DD");
		
		String date1=sm.format(date);
				System.out.println("current date and time is"+date1);
		calendar.add(calendar.DATE, -15);
		System.out.println("15 days ago"+calendar.getTime());
	System.out.println(System.currentTimeMillis());	
		
		

	}

}
