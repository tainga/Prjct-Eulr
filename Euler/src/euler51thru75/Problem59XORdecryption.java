package euler51thru75;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem59XORdecryption {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("C:\\Users\\Kevin\\Desktop\\cipher.txt"));
		
		String[] temp = in.next().split(",");
		int[] numbers = new int[temp.length];
		for (int i = 0; i < temp.length; i++) {
			numbers[i] = Integer.parseInt(temp[i]);
		}
		in.close();
		
		System.out.println(Arrays.toString(temp));
		
		for (int i = 97; i <= 122; i++) {
			for (int j = 97; j <= 122; j++) {
				for (int k = 97; k <= 122; k++) {
					int[] testkey = {i, j, k};
					decrypt(numbers, testkey);
				}
			}
		}
		
		
	}
	
	public static void decrypt(int[] message, int[] key) {
		String m = "";
		int[] fullKey = new int[message.length];
		for (int i = 0; i < message.length; i++) {
			if (i % 3 == 1) fullKey[i] = key[0];
			else if(i % 3 == 2) fullKey[i] = key[1];
			else fullKey[i] = key[2];
		}
		
		int sum = 0;
		
		for (int i = 0; i < message.length; i++) {
			char x = (char) (message[i] ^ fullKey[i]);
			if (x > 122 || x < 32 || x == 91 || x == 92 || x == 93 || x == 94 || x == 95) return;
			m += x;
			sum += x;
		}
		
		
		System.out.println(m + " " + Arrays.toString(key) + " " + sum);
	}

}
