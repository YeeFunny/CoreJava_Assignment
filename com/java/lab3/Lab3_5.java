package com.java.lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lab3_5 {
	
	public static String expiryDate(Date date, int year, int month){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, year * 12 + month);
        calendar.add(Calendar.DATE, 1);
        date = calendar.getTime();
        String enddate = format.format(date);
	    return enddate;
	}
	
	public static void main(String[] args) {
		String dateStr = "2010-12-12";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = dateFormat.parse(dateStr);
			System.out.println("The expiry date is: " + expiryDate(date, 1, 1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
