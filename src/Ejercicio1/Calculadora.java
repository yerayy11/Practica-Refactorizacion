package Ejercicio1;

	import java.util.List;

	public class Calculadora {

	    public void p(List<Double> l, String n, double imp, boolean vip) {
	        double t = 0;

	        for (Double d : l) {
	            t += d;
	        }

	        if (vip) {
	            t = t - (t * 0.10);
	            System.out.println("Cliente VIP: " + n);
	            System.out.println("Total con descuento: " + t);
	        } else {
	            t = t + (t * imp);
	            System.out.println("Cliente Normal: " + n);
	            System.out.println("Total con impuestos: " + t);
	        }
	    }
	}