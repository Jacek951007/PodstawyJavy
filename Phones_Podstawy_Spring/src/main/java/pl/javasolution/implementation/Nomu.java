package pl.javasolution.implementation;

import pl.javasolution.Api.*;
public class Nomu implements IPhone {
	private String name;
	private int price;
	
	public Nomu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	

}
