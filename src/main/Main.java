package main;

import java.util.Scanner;

import hanoi.Hanoi;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Hanoi hanoi = null;
		int opcion = 0;
		while(opcion != 3) {
			System.out.println("1. Nuevo juego - 2. Mover - 3. Salir");
			opcion = scanner.nextInt();
			if(opcion == 3) continue;
			switch (opcion) {
			case 1:
				System.out.println("Ingrese la cantidad de discos");
				int discos = scanner.nextInt();
				hanoi = new Hanoi(discos);
				break;
			case 2:
				if(hanoi == null) {
					System.out.println("Primero debe crear un nuevo juego");
					continue;
				}
				System.out.println("Ingrese la columna de partida");
				int colInicial = scanner.nextInt();
				System.out.println("Ingrese la columna de llegada");
				int colFinal = scanner.nextInt();
				try {
					hanoi.mover(colInicial, colFinal);
				} catch(Exception e) {
					System.out.println("Hubo un error");
					System.out.println(e.getMessage());
				}
				break;

			}
			hanoi.print();
			
		}
		
		
	}
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) return 1;
		return n * factorial(n-1);
	}
	
	public static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonacci(n-1, 0, 1);
	}
	
	public static int fibonacci(int n, int a, int b) {
		if(n == 1) return a+b;
		return fibonacci(n-1, b, a+b);
	}
	
	

}
