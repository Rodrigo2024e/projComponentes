package com.smartprocess.projComponentes.services;

import org.springframework.stereotype.Service;

import com.smartprocess.projComponentes.entities.Order;

@Service
public class OrderService {

	private ShippingService shippingService;
	
	public double total(Order order) {
		double discount = order.getBasic() * order.getDiscount()/100;
		return order.getBasic() - discount + shippingService.shipment(order);
	}
}
