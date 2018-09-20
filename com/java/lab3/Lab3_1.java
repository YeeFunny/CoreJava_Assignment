package com.java.lab3;

public class Lab3_1 {

	public static String strOperation(String str, Option option) {
		StringBuilder sb = null;
		if (str != null) {
			if (option == Option.Add) {
				str += str;
			}
			if (option == Option.Replace) {
				sb = new StringBuilder();
				for (int i = 0; i < str.length(); i++) {
					char curChar = str.charAt(i);
					if (i % 2 != 0) {
						curChar = '#';
			        }
					sb.append(curChar);
				}
				str = sb.toString();
			}
			if (option == Option.Remove) {
				char[] charArr = str.toCharArray();
		        String target = "";
		        for (char value : charArr) {
		            if (target.indexOf(value) == -1) {
		                target += value;
		            }
		        }
		        str = target;
			}
			if (option == Option.Change) {
				sb = new StringBuilder();
				for (int i = 0; i < str.length(); i++) {
					char curChar = str.charAt(i);
					if (i % 2 != 0) {
						curChar = Character.toUpperCase(curChar);
			        }
					sb.append(curChar);
				}
				str = sb.toString();
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Lab3_1.strOperation("1", Option.Add));
		System.out.println(Lab3_1.strOperation("2fdafd  ", Option.Remove));
	}

}

enum Option{
	Add, Replace, Remove, Change
}
