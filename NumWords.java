public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		int hundreds = number/100;
		int tens = (number/10) - (hundreds * 10);
		int ones = number - ((tens*10) + (hundreds * 100)) ;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
