package com.smartprocess.projComponentes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smartprocess.projComponentes.entities.Order;
import com.smartprocess.projComponentes.services.OrderService;

@SpringBootApplication
public class ProjComponentesApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjComponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("\n----------------------------------------");
		Order order1 = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código: " + order1.getCode());
		System.out.printf("Valor total: " + "R$ " + "%.2f%n",orderService.total(order1));
		System.out.println("------------------------------------------");
		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código: " + order2.getCode());
		System.out.printf("Valor total: " + "R$ " + "%.2f%n",orderService.total(order2));
		System.out.println("------------------------------------------");
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código: " + order3.getCode());
		System.out.printf("Valor total: " + "R$ " + "%.2f%n",orderService.total(order3));
		System.out.println("------------------------------------------");
	}

}
