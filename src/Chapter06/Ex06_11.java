package Chapter06;

class Data_1 {
	int value;
}

class Data_2 {
	int value;

	Data_2(int x) {
		value = x;
	}
}

public class Ex06_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(5);

		System.out.println(d1.value);
		System.out.println(d2.value);
	}
}
