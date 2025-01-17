package Chapter03;

public class Ex03_13 {
	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000)/1000.0;
		System.out.println(shortPi);
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000);
		System.out.println(Math.round(pi*1000)/1000.0);
		
		
		System.out.println(Math.round(pi*10000)/10000.0);
		
	}
}