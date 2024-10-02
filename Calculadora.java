package igor;

public class Calculadora implements ICalculo {
	 @Override
	    public double calcularMedia(double[] valores) {
	        double total = 0;
	        for (double valor : valores) {
	            total += valor;
	        }
	        return total / valores.length;
	 }
}
