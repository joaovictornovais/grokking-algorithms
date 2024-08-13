package grokkingAlgorithms;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(fatorial(5));
		System.out.println(fibonacci(5));
	}
	
	/* In recursion we need 2 cases
	 * 1 recursive-case: responsible to call itself
	 * 1 case-base: responsible to stop the recursion
	 */
	public static int fatorial(int num) {
		if (num <= 0) return 1;
		return num * fatorial(num - 1);
	}
	
	public static int fibonacci(int n) {
		if (n < 2) return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
}
