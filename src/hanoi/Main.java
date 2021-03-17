package hanoi;

public class Main {

	public static void main(String[] args) {
		int discos = 15;
		Hanoi hanoi = new Hanoi(discos);
		try {
			hanoi.resolver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
