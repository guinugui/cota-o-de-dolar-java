package entities;

public class cotacao {

	public static final Double IOF = 0.06;

	public static Double convercao(Double valorDoDolar, Double dolar) {
		return valorDoDolar * dolar * (1.0 + IOF);
	}

}
