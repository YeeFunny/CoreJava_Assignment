package com.java.week3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question5 {

	public static List<Integer> solution(List<Integer> list1, List<Integer> list2) {

		List<Integer> result = Stream.concat(list1.stream(), list2.stream())
				.sorted().collect(Collectors.toList());
		return result;
	}

	@Test
	public void test() {
		List<Integer> list1 = new LinkedList<>(Arrays.asList(13, 22, 46, 50));
		List<Integer> list2 = new LinkedList<>(Arrays.asList(3, 14, 16, 48));
		List<Integer> result = Question5.solution(list1, list2);
		Integer[] expected = {3, 13, 14, 16, 22, 46, 48, 50};
		assertArrayEquals(expected, result.toArray());
	}
}
