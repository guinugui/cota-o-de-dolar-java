package entities;

public class cotacao {

	public static final Double IOF = 0.06;

	public Double convercao(Double reais, Double dolar) {
		return reais * dolar * (IOF);
	}
	
}
