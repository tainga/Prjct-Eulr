package euler26thru50;

public class CoinSums {

	public static void main(String[] args) {
		
		int solutions = 0;
		
		//1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
		
		for (int a = 200; a >= 0; a -= 200) {
			for (int b = a; b >= 0; b -= 100) {
				for (int c = b; c >= 0; c -= 50) {
					for (int d = c; d >= 0; d -= 20) {
						for (int e = d; e >= 0; e -=10) {
							for (int f = e; f >= 0; f -= 5) {
								for (int g = f; g >= 0; g -=2) {
										solutions++;
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println(solutions);

	}
	


}
