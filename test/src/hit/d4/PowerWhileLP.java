package hit.d4;

public class PowerWhileLP {

	public static void main(String[] args) {
		int base = 2, exponent = 8;
		long result = 1;
		while (exponent != 0) {
		result *= base;
		--exponent;
		}
		System.out.println("Answer is " + result);
	}

}
