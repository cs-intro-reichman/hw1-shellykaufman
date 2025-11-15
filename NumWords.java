// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		System.out.println(number/100 + " hundreds, " + (number/10)%10 + " tens, and " + number%10 + " ones.");
	}
}

// I would have taken the calculations into variables:
// int hundreds = number/100 
// and then System.out.print(hundreds + )....
