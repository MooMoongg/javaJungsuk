package Chapter04;

public class Ex04_17 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}
}
