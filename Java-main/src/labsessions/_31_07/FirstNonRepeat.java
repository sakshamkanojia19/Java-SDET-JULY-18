package labsessions._31_07;

import java.util.LinkedHashMap;

public class FirstNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabccbd";
		
		LinkedHashMap<Character,Integer> countMap = new LinkedHashMap<>();
		
	
		 for (char c : str.toCharArray()) {
	            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
	        }

	        for (char c : countMap.keySet()) {
	            if (countMap.get(c) == 1) {
	                System.out.println("First non-repeating character: " + c);
	                break;
	            }
	        }
	
	}

}
