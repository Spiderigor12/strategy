package igor;

public class MediaGeometrica implements ICalculo {
	 @Override
	    public double calcularMedia(double[] valores) {
	        double produto = 1;
	        for (double valor : valores) {
	            produto *= valor;
	        }
	        return Math.pow(produto, 1.0 / valores.length);
	    }
	}


