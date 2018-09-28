package com.java.week3;

import java.util.stream.Stream;

import org.junit.Test;
import static org.junit.Assert.*;

public class Question2 {
	public static String solution(String s) {
		Stream<Character> stream = Stream.of(s.charAt(0));
		return stream.map(i -> {
			if (Character.isDigit(i) ) {
				return "digit";
			} else if (Character.isUpperCase(i)) {
				return "upper";
			} else if (Character.isLowerCase(i)) {
				return "lower";
			} else {
				return "other";
			}
		}).findFirst().get();
	}
	
	@Test
	public void test() {
		String result = solution("$df");
		assertEquals("other", result);
	}
}
