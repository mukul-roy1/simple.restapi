package com.learnspring.simple.restapi;

public class Phones {
	private String name;
	private int price;
	private String Company;
	
	
	
	public Phones(String name, int price, String company) {
		super();
		this.name = name;
		this.price = price;
		Company = company;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public String getCompany() {
		return Company;
	}


	@Override
	public String toString() {
		return "Phones [name=" + name + ", price=" + price + ", Company=" + Company + "]";
	}
	
	

}
