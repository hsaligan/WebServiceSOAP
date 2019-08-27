package com.ws;

public class CalculadoraCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraImplService calculaService = new CalculadoraImplService();
		Calculadora consumer = calculaService.getCalculadoraImplPort();
		System.out.println("Suma ");
		System.out.println(consumer.operacion(1, 6, 4));
		
		System.out.println("Resta ");
		System.out.println(consumer.operacion(2, 6, 4));
		
		System.out.println("multiplica ");
		System.out.println(consumer.operacion(3, 6, 4));
		
		System.out.println("Divide ");
		System.out.println(consumer.operacion(4, 6, 4));
	}

}
