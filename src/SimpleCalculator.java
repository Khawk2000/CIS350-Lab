package kmh_cis350;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	public int pow(int a, int b) {
		int result = 0;
		result = a;
		for(int i = 1; i < b; i++) {
			result = result*a;
		}
		return result;
	}
	public int mod(int a, int b) {
		return a % b;
	}
	public static final void main(String[] args) {
		System.out.println("Hey there CIS350.");
	}
}
