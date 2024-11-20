package com.smartprocess.projComponentes.services;

import com.smartprocess.projComponentes.entities.Order;

public class ShippingService {

	public double shipment(Order order) {
		
		if (order.getBasic() < 100) {
			return 20;
			
		} else if (order.getBasic() > 100 && order.getBasic() < 200) {
			return 12;
			
		} else {
			return 0;
		}
	}
}
