package com.java.lab2;

import java.util.Scanner;

public class Lab2_2 {
	
	public static void main(String[] args) {
		System.out.println("Please input a number:");
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			try	{
				int num = Integer.parseInt(scan.next());
				if (num > 0) 
					System.out.println("Input number is positive!");
				else if (num < 0)
					System.out.println("Input number is negative!");
				else
					System.out.println("Input number is zero!");
			} catch(NumberFormatException ex) {
				System.out.println("Invalid input!");
			}
			
		}
	}
	
}
