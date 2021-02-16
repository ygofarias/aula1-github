package entities;

public class CurrencyConverter {
	
	//métodos estáticos
	public static double IOF = 0.06;
	
	public static double dollarConverter(double boughtDollar, double dollarPrice) {
		return boughtDollar * dollarPrice * (1.0 + IOF);
	}
}
