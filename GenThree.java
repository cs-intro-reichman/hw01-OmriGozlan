/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		int range = end - start;
		int random1 = (int) ((Math.random() * range)+ start);
		int random2 = (int) ((Math.random() * range)+ start);
		int random3 = (int) ((Math.random() * range)+ start);
		int res = Math.min(random1, random2);
		int min = Math.min(res, random3);
		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		System.out.println("The minimal generated number was " + min);
	}
}
