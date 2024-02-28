package application;

import java.util.Locale;
import java.util.Scanner;

import entities.cotacao;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Qual a cotaçao do dolar atual ? ");
		double valorDoDolar = sc.nextDouble();

		System.out.println("Quantos dolar quer converter em reais ? ");
		double dolar = sc.nextDouble();

		double resultado = cotacao.convercao(valorDoDolar, dolar);
		System.out.printf("o valor total e de : %.2f%n", resultado);

		sc.close();
	}

}
