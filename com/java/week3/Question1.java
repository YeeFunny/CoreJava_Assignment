package com.java.week3;

import java.util.Random;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.*;

public class Question1 {

	public static int solution(int n) {
		Random random = new Random();
		return random.ints(n + 1, (int) Math.pow(10, 9) + 1).asLongStream().map(i -> i*10/10)
				.mapToInt(i -> (int)i).findFirst().getAsInt();
	}

	@RepeatedTest(100)
	public void test() {
		int result = Question1.solution(2);
		assertTrue(result > 2 && result <= 1000000000);
	}
}
