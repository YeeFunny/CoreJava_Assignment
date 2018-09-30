package com.java.week3;

import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class Question3 {

	static int numOfChar = 0;
	
	public static int solution(String s, int k) {
		
		int count = 0;
		long left = 0;
		String[] arr = s.split(" ");
		
		Supplier<IntStream> supp = () -> Stream.of(arr).mapToInt(x -> x.length());
		
		if (supp.get().anyMatch(x -> x > k)) return -1;
		
		while (left < arr.length) {
			IntStream temp = supp.get();
			left += temp.skip(left).map(x -> {
				numOfChar += x + 1;
				return numOfChar;
			}).filter(x -> x-1 <= k).count();
			
			count++;
			numOfChar = 0;
			temp.close();
		}
		return count;
	}

	@Test
	public void test() {
		String str = "sms messages are really short";
		System.out.println(solution(str, 2));
	}
}
