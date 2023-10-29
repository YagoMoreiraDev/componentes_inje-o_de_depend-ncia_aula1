package br.com.yagodev.aula1.services;

import org.springframework.stereotype.Service;

import br.com.yagodev.aula1.etities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double shipment;
		if(order.getBasic() < 100) {
			shipment = 20;
		} else if(order.getBasic() >= 100 && order.getBasic() < 200) {
			shipment = 12;
		}else {
			shipment = 0;
		}
		return shipment;	
	}
}
