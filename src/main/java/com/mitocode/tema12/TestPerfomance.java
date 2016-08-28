package com.mitocode.tema12;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class TestPerfomance {

	public static void main(String[] args) {
		long begin = System.nanoTime();

		ArrayList<String[]> list = new ArrayList<String[]>(1000000);
		for (int i = 0; i < 1000000; i++) {
			String[] split = "Hello World".split(" ");
			//list.add(split);
		}

		long end = System.nanoTime();		

		System.out.println(TimeUnit.MILLISECONDS.convert(end - begin, TimeUnit.NANOSECONDS));
		
		
		Pattern pattern = Pattern.compile(" ");
		long begin2 = System.nanoTime();

		ArrayList<String[]> list2 = new ArrayList<String[]>(1000000);
		for (int i = 0; i < 1000000; i++) {
			String[] split = pattern.split("Hello World", 0);
			list2.add(split);
		}

		long end2 = System.nanoTime();		

		System.out.println(TimeUnit.MILLISECONDS.convert(end2 - begin2, TimeUnit.NANOSECONDS));
	}

}
