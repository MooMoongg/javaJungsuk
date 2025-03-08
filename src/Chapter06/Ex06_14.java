package Chapter06;

class Ex6_14 {
	static {
		System.out.println("static {}");
	}

	{
		System.out.println("{}");
	} // 중괄호 {}만 단독으로 있는 코드 블록은 "인스턴스 초기화 블록"이라고 부름

	public Ex6_14() {
		System.out.println("생성자");
	}
}

public class Ex06_14 {
	public static void main(String[] args) {
		System.out.println("Ex6_14 bt = new Ex6_14();");
		Ex6_14 bt = new Ex6_14();

		System.out.println("Ex6_14 bt2 = new Ex6_14();");
		Ex6_14 bt2 = new Ex6_14();

	}
}
