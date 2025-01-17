package Chapter03;

public class Ex03_10 {
	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000;
		long c = (long)1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}