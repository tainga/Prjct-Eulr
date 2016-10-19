package euler26thru50;

public class Problem40 {

	public static void main(String[] args) {
		
		String constant = ".";
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i < 1000000; i++) {
		    sb.append (i);
		}
		constant = sb.toString();

		int answer = 1;
		
		for (int i = 1; i <= 1000000; i *= 10) {
			answer *= Integer.parseInt(constant.substring(i, i+1));
		}
	    
		System.out.println(answer);
	}

}
