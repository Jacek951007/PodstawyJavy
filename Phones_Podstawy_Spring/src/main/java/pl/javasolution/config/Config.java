package pl.javasolution.config;

import pl.javasolution.Api.*;
import pl.javasolution.implementation.*;
import org.springframework.context.annotation.*;

@Configuration
public class Config {
	
	@Bean 
	public IPhone phone() {
		return new Nomu("Nomu S30",999);
	}
	
	@Bean(name = "nomu")
	public IOrder order(IPhone phone) {
		return new Order(phone);
	}
	
	
}
