package euler26thru50;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class DistinctsPowers {

	public static void main(String[] args) {
		
		ArrayList<BigInteger> powers = new ArrayList<>();
		
		for (int a = 2; a <= 100; a++) {
			for (int b = 2; b <= 100; b++) {
				BigInteger x = BigInteger.valueOf(a);
				x = x.pow(b);
				if (!powers.contains(x)) powers.add(x);
			}
		}
		
		Collections.sort(powers);
		//System.out.println(powers);
		System.out.println(powers.size());

	}

}
