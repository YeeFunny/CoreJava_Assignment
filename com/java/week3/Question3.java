package com.java.week3;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.junit.Test;

public class Question3 {

	public static int solution(String s, int k) {
		Stream<String> stream = Stream.of(s.split(" "));

		Spliterator<String> spliterator = new MessageSpliterator(0, s, true);
		StreamSupport.stream(spliterator, false);

		return 0;
	}

	@Test
	public void test() {
		String str = "Java JavaEE Yifang Liu dsafd safeqfe afqerw dsafqeqefdsa dsafas";
		solution(str, 15);
	}
}

class MessageSpliterator implements Spliterator<String> {

	private String str;
	private int currString = 0;
	private boolean canSplit = true;
	private int limit = 0;

	public MessageSpliterator(int currString, String str, boolean canSplit, int limit) {
		super();
		this.str = str;
		this.currString = currString;
		this.canSplit = canSplit;
		this.limit = limit;
	}

	@Override
	public void forEachRemaining(Consumer<? super String> action) {
		do {
		} while (tryAdvance(action));
	}

	@Override
	public boolean tryAdvance(Consumer<? super String> action) {
		if(str.equals("")){
            return false;
        }
        return true;
	}

	@Override
	public Spliterator<String> trySplit() {
		int i = currString;
        for(;canSplit && i < str.length(); ++i){

            if(!Character.isDigit(str.charAt(i))){
                String str1 = str;
                this.str = str1.substring(currentChar, i);
                canSplit = false;
                if(i + 1 < str1.length()){
                    return new MessageSpliterator(0,str1.substring(i+1, str1.length()),true);
                }else{
                    return null;
                }
            }
        }
        canSplit = false;
        return null;
	}

	@Override
	public long estimateSize() {

		return 0;
	}

	@Override
	public int characteristics() {
		return 0;
	}

}