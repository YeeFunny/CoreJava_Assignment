package com.java.lab3;

import java.time.LocalDate;
import java.time.Period;

public class Lab3_4 {
	public static void printDuration(LocalDate date1, LocalDate date2) {
		Period diff = Period.between(date1, date2);
		System.out.printf("Difference is %d years, %d months and %d days\n",
                diff.getYears(), diff.getMonths(), diff.getDays());
	}
	
	public static void main(String[] args) {
		printDuration(LocalDate.of(2013, 10, 31), LocalDate.of(2014, 11, 3));
	}
}
