package Chapter03;

public class Ex03_06 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		//System.out.printf("%d + %d = %d%n", a, b, a+b);
		//System.out.printf("%d - %d = %d%n", a, b, a-b);
		//System.out.printf("%d * %d = %d%n", a, b, a*b);
		//System.out.printf("%d / %d = %d%n", a, b, a/b);
	
		//System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);
		
		
		System.out.printf("%f / %d = %f%n", (float)a, b, (float)a/b);
		System.out.printf("%f / %f = %f%n", (float)a, (float)b, (float)a/(float)b);
	}
}