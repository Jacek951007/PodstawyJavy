package pl.javasolution.implementation;

import pl.javasolution.Api.*;
public class Order implements IOrder{

	private IPhone phone;
	
	
	public Order(IPhone phone) {
		super();
		this.phone = phone;
	}


	@Override
	public void printOrder() {
		System.out.println("Telefon: "+phone.getName()+" kosztuje: "+phone.getPrice());
		
	}
	

}
