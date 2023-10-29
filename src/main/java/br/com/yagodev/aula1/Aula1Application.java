package br.com.yagodev.aula1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.yagodev.aula1.etities.Order;
import br.com.yagodev.aula1.services.OrderService;

@SpringBootApplication
@ComponentScan({"br.com.yagodev"})
public class Aula1Application implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Aula1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(2282, 150.00, 20.00);
		System.out.println("Pedido código: "+order.getCode()+"\nValor total: R$ "+orderService.total(order));
	}

}
