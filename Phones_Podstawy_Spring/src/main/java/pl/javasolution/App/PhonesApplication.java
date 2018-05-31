package pl.javasolution.App;

import pl.javasolution.Api.IOrder;
import pl.javasolution.config.*;
import pl.javasolution.implementation.Order;

import org.springframework.context.annotation.*;

public class PhonesApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		IOrder order = (IOrder)context.getBean(Order.class);
		order.printOrder();
		
	}
}
