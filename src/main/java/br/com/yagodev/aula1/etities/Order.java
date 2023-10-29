package br.com.yagodev.aula1.etities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
	private int code;
	private double basic;
	private double discout;
	
}
