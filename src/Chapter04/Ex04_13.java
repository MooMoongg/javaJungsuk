package Chapter04;

public class Ex04_13 {

	public static void main(String[] args) {
		int sum=0;
		int i=0;
		
		while(sum<=100) {
			System.out.println(sum);
			sum += ++i;
		}
		

	}

}
