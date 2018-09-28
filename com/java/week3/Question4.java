package com.java.week3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

public class Question4 {
	
	public static String solution(int digit, int start, int end) {
		
		String result = IntStream.range(start, end + 1).filter(i -> {
			while (i > 0) {
				if (i % 10 == digit) return true;
				i /= 10;
			}
			return false;
		}).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining(" "));
		return result;
	}
	
	@Test
	public void test() {
		String result = Question4.solution(3, 1, 2);
		Assert.assertEquals("", result);
	}
}
