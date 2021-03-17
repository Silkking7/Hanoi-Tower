package hanoi;

import java.util.Arrays;

public class Hanoi {
	
	private int[] inicial; // col 0
	private int[] media; // col 1
	private int[] final1; // col 2
	
	public Hanoi(int n) {
		inicial = new int[n];
		media = new int[n];
		final1 = new int[n];
		for (int i = n; i >= 1; i--) {
			inicial[i-1] = n - i + 1;
		}
//		System.out.println(Arrays.toString(inicial));
//		System.out.println(Arrays.toString(media));
//		System.out.println(Arrays.toString(final1));
	}
	
	public void mover(int colInicial, int colFinal) throws Exception {
		int indiceFichaColInicial = obtenerIndiceFichaDePila(colInicial);
		if(indiceFichaColInicial == -1) throw new Exception("La columna inicial está vacía");
		int indiceFichaColFinal = obtenerIndiceFichaDePila(colFinal);
		int[] columnaInicial = columnaObtener(colInicial);
		int[] columnaFinal = columnaObtener(colFinal);
		if(indiceFichaColFinal != -1 && columnaInicial[indiceFichaColInicial] > columnaFinal[indiceFichaColFinal]) throw new Exception("No se puede mover la ficha");
		columnaFinal[indiceFichaColFinal + 1] = columnaInicial[indiceFichaColInicial]; 
		columnaInicial[indiceFichaColInicial] = 0;
		this.print();
		
	}
	
	private int obtenerIndiceFichaDePila(int columna) throws Exception {
		int[] columnaArray = columnaObtener(columna);		
		for(int i = columnaArray.length; i >= 1; i--) {
			if(columnaArray[i - 1] != 0) return i - 1;
		}
		return -1;
	}
	
	public int[] columnaObtener(int columna) throws Exception {
		switch (columna) {
		case 0:
			return this.inicial;
		case 1:
			return this.media;
		case 2: 
			return this.final1;
		default:
			throw new Exception("No hay columna: " + columna);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Las columnas son: ").append("\n");
		sb.append(Arrays.toString(this.inicial)).append("\n");
		sb.append(Arrays.toString(this.media)).append("\n");
		sb.append(Arrays.toString(this.final1)).append("\n");
		return sb.toString();
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public void resolver() throws Exception {
		this.moverDiscos(inicial.length, 0, 2);
	}
	
	public void moverDiscos(int n, int colInicial, int colFinal) throws Exception {
		if(n == 1) {
			this.mover(colInicial, colFinal);
		} else {
			this.moverDiscos(n - 1, colInicial, 3 - colInicial - colFinal);
			this.mover(colInicial, colFinal);
			this.moverDiscos(n - 1, 3 - colInicial - colFinal, colFinal);
		}		
	}
	
	

}
