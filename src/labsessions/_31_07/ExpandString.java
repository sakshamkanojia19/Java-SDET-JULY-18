package labsessions._31_07;

public class ExpandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input ="a3b4c5";
		StringBuilder output = new StringBuilder();
		
		for(int i=0;i<input.length();i+=2) {
			char ch = input.charAt(i);
			 int count = Character.getNumericValue(input.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                output.append(ch);
            }
        }

        System.out.println("Expanded string: " + output);
	}

}
