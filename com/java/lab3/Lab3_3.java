package com.java.lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lab3_3 {

	public static void printDuration(Date date) {
		Date now = new Date();
		Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        
		if (date.after(now)) {
			start.setTime(now);
			end.setTime(date);
		} else {
			start.setTime(date);
			end.setTime(now);
		}
		
        int increment = 0;
        int year, month, day;
        if (start.get(Calendar.DAY_OF_MONTH) > end.get(Calendar.DAY_OF_MONTH)) {
            increment = start.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        if (increment != 0) {
            day = end.get(Calendar.DAY_OF_MONTH) + (increment - start.get(Calendar.DAY_OF_MONTH));
            increment = 1;
        } else {
            day = end.get(Calendar.DAY_OF_MONTH) - start.get(Calendar.DAY_OF_MONTH);
        }

        if ((start.get(Calendar.MONTH) + increment) > end.get(Calendar.MONTH)) {
            month = end.get(Calendar.MONTH) + 12 - (start.get(Calendar.MONTH) + increment);
            increment = 1;
        } else {
            month = (end.get(Calendar.MONTH)) - (start.get(Calendar.MONTH) + increment);
            increment = 0;
        }

        year = end.get(Calendar.YEAR) - (start.get(Calendar.YEAR) + increment);
        System.out.println("Difference is " + year+" Years "+month+" Months "+day+" Days");
	}
	
	public static void main(String[] args) {
		String dateStr = "2017-8-1";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = dateFormat.parse(dateStr);
			printDuration(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
