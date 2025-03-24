package com.examples;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestSimpleStreams {
	public static void main(String[] args) {
		//List.of method to add some String values
		List<String> fruits = 
				List.of("apple", "mangoe", "grape", "orange","gauva", "apple", "grape");
		/*
		 * forEach(Consumer : accept(T t) )
		 */
		fruits.stream().
			forEach(t -> System.out.println(t+" thread name = "+Thread.currentThread().getName()));
		System.out.println("_______________________________");
		//distinct() to have only unique elements
		fruits.stream().distinct().forEach(t -> System.out.println(t));
		// you can have a new line using collect(Collectors.toList()) or collect(Collectors.toSet())
		// converting List to Set in a single line
		Set<String> fruitSet = fruits.stream().collect(Collectors.toSet());
		System.out.println(fruitSet);
		// applying filters on a Set or List: filter(Predicate)
		fruitSet.stream().filter(t -> t.length() == 5).forEach(t -> System.out.println(t));
		System.out.println("__________________________________");
		fruits.parallelStream().filter(t -> t.contains("o")).forEach(t -> System.out.println(t));
		// parallel stream is to get the leverage of parallel processing, but you need to 
		// process the data parallelly but iterate/sort sequentially
	}
	
}
