package Ejercicio1;

	import java.util.List;

	public class Calculadora {

	    private static final double DESCUENTO_VIP = 0.10;

		public void procesarFactura(List<Double> precios, String n, double imp, boolean vip) {
	        double total = 0;

	        total = calcularSumaBase(precios, total);

	        aplicarDescuentoOImpuesto(n, imp, vip, total);
	    }

		private void aplicarDescuentoOImpuesto(String n, double imp, boolean vip, double total) {
			if (vip) {
	            total = total - (total * DESCUENTO_VIP);
	            System.out.println("Cliente VIP: " + n);
	            System.out.println("Total con descuento: " + total);
	        } else {
	            total = total + (total * imp);
	            System.out.println("Cliente Normal: " + n);
	            System.out.println("Total con impuestos: " + total);
	        }
		}

		private double calcularSumaBase(List<Double> precios, double total) {
			for (Double d : precios) {
	            total += d;
	        }
			return total;
		}
	}