package com.examples;

import java.util.List;

public class LaptopsStream {
	public static void main(String[] args) {
		List<Laptop> list = Laptop.getLaptops();
		// only laptops belonging to Lenovo
		list.parallelStream()
		.filter(x -> x.getBrand().equals("Lenovo")).forEach(x -> System.out.println(x));
		System.out.println("_________________________________________-");
		// range between 50000 to 100000
		list.parallelStream()
		.filter(x -> x.getPrice() <= 100000)
		.filter(x -> x.getPrice() >= 50000)
		.filter(x -> x.getBrand().equals("Dell") || x.getBrand().equals("Lenovo"))
		.forEach(x -> System.out.println(x));
	}
}
