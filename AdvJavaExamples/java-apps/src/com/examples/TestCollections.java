package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(30);
		list.add(20);
		list.add(24);
		System.out.println(list);
		
		Collections.sort(list, (x, y) -> Integer.compare(x, y));
		System.out.println(list);
		System.out.println("------------------------------");
		Collections.sort(list, (x, y) -> Integer.compare(y, x));
		System.out.println(list);
		// Comparator -> compare(x, y)
	}
}
