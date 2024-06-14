package Suma;

public class CalculadoraFactorial {
	private int edadActual;
	
	public CalculadoraFactorial(int edadActual) {
		this.edadActual = edadActual;
	}
	public void calcularAñosHastaJubilacion() {
		int añosParaJubilacion = 67 - edadActual;
		if (añosParaJubilacion <10) {
			System.out.println("Solo te quedan" + añosParaJubilacion +"años!");
		}else if (añosParaJubilacion >20) {
			System.out.println("Te quedan"+añosParaJubilacion+"años!");
		}else {
			System.out.println("Te quedan"+añosParaJubilacion+"años!");
		}
	}

}
