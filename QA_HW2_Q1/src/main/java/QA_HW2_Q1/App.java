package QA_HW2_Q1;

/**
 * Submitted by:
 * Linoy Elhadif - 313536815
 * Carolina Erlih - 314776741
 */
public class App 
{
	public static String checkRoots(int a, int b, int c) {
        //1. Check if it's not a quadratic equation (a cannot be 0)
        if (a == 0) {
            return "Not a quadratic equation";
        }
        //Check ranges
        //Is a in range
        if (a < 5 || a > 200) {
        	return "a not in range.";
        }
        //Is b in range
        if (b < 5 || b > 200) {
        	return "a not in range.";
        }
        //Is c in range
        if (c < 5 || c > 200) {
        	return "a not in range.";
        }
        //Calculate delta
        int delta = b * b - 4 * a * c;
        
        //Check based on delta:
        //2. Check - Real roots
        if (delta > 0) {
            return "Real roots";
        //3. Check - Equal roots
        } else if (delta == 0) {
            return "Equal roots";
        //4. Check - Imaginary roots

        } else {
            return "Imaginary roots";
        }
    }
}
