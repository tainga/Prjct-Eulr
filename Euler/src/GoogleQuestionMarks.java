import java.util.ArrayList;


public class GoogleQuestionMarks {
	
	public static void main(String[] args) {
		
		String test = "?1111?0";
		ArrayList<String> t = new ArrayList<>();
		t.add(test);
		System.out.println(replace(t, 0));

	}
	
	
	public static ArrayList<String> replace (ArrayList<String> strings, int i) {
		
		ArrayList<String> result = new ArrayList<>();
		
		for (String x : strings) {
			
			if (i >= x.length()) return strings;
			
			if (x.charAt(i) != '?') {
				return replace(strings, i + 1);
			}
			//if (x.charAt(i) == '?') 
				String a = x.substring(0, i) + 0 + x.substring(i + 1);
				String b = x.substring(0, i) + 1 + x.substring(i + 1);
				ArrayList<String> newArr = new ArrayList<>();
				newArr.add(a);
				newArr.add(b);
				result.addAll(replace(newArr, i+1));
		}
		
		return result;
	}

}
