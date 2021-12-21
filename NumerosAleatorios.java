package hilos;


public class NumerosAleatorios implements Runnable {

	public void run() {

		int low = 200;
		int high = 300;
		int numero = (int) Math.floor(Math.random() * (high - low + 1) + low);
		if(LanzadorHilos.contador == 0) {
			LanzadorHilos.contador--;
		} else {
			LanzadorHilos.contador++;
		}
		System.err.print(numero);
		System.out.print(" --> contador: " + LanzadorHilos.contador + "  ");
	}

}
