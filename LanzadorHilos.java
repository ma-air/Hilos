package hilos;

public class LanzadorHilos {

	public static int contador = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread[] hilos; // Array con los hilos
		hilos = new Thread[50];
		for (int i = 0; i < 50; i++) {

			// creo los hilos, les pongo nombre y los lanzo
			NumerosAleatorios na = new NumerosAleatorios();
			hilos[i] = new Thread(na);
			hilos[i].start();
			hilos[i].join();
			hilos[i].setName("Thread " + i);
			System.out.print(" --> " + hilos[i].getName() + "\n");
		}

	}

}

