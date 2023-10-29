package br.com.yagodev.aula1.services;

import org.springframework.stereotype.Service;

import br.com.yagodev.aula1.etities.Order;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {
	
	private ShippingService shipping;
	
	public double total(Order order) {
		
		double value = order.getBasic() - (order.getBasic() * (order.getDiscout()/100));
		
		return value + this.shipping.shipment(order);
	}
}
