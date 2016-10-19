package euler1thru25;
import java.util.ArrayList;


public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		
		int a, b, c, x, y;
		long product = 0;
		ArrayList<Integer> squares = new ArrayList<>();
		
		for (int i = 1; i < 500; i++) {
			squares.add(i * i);
		}
		
		for (int i = 0; i < squares.size(); i++) {
			x = squares.get(i);
			for (int j = 0; j < squares.size(); j++) {
				y = squares.get(j);
				if (squares.contains(x + y)) {
					if (Math.sqrt(x) + Math.sqrt(y) + Math.sqrt(x + y) == 1000) {
						c = (int) Math.sqrt(x + y);
						a = (int) Math.sqrt(x);
						b = (int) Math.sqrt(y);
						product = a * b * c;
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
		
		System.out.println(product);
		


	}

}
