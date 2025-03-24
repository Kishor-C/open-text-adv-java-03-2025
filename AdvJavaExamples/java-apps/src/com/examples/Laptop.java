package com.examples;

import java.util.ArrayList;
import java.util.List;

public class Laptop {
	private String brand;
	private double price;
	private int RAM;
	public Laptop(String brand, double price, int rAM) {
		super();
		this.brand = brand;
		this.price = price;
		RAM = rAM;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// return list of mock laptop objects
	public static List<Laptop> getLaptops() {
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(new Laptop("Acer", 90000, 16));
		list.add(new Laptop("Acer", 50000, 8));
		list.add(new Laptop("Acer", 80000, 8));
		list.add(new Laptop("Dell", 190000, 32));
		list.add(new Laptop("Dell", 100000, 16));
		list.add(new Laptop("Lenovo", 190000, 32));
		list.add(new Laptop("Lenovo", 90000, 16));
		list.add(new Laptop("Lenovo", 80000, 8));
		list.add(new Laptop("HP", 100000, 16));
		list.add(new Laptop("HP", 90000, 8));
		
		return list;
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", RAM=" + RAM + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	
}
