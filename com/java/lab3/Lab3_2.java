package com.java.lab3;

public class Lab3_2 {
	public static boolean isStrPositive(String str) {
		if (str.length() < 2 || str == null)
			return true;
		else {
			char[] charArr = str.toCharArray();
			char prev = charArr[0];
			for (int i = 1; i < charArr.length; i++) {
				if (charArr[i] - prev < 0)
					return false;
				prev = charArr[i];
	 		}
		}
  		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(Lab3_2.isStrPositive("ANT"));
	}
}
