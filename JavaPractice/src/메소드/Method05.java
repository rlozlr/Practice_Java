package 메소드;

public class Method05 {

	public static void main(String[] args) {
		// 두 정수의 사칙연산(+ - * / %)을 처리

		Method05 op = new Method05();

		System.out.println(op.add(10, 20));
		System.out.println(op.sub(10, 20));
		System.out.println(op.mul(10, 20));
		System.out.println(op.div(10, 20));
		System.out.println(op.rem(10, 20));
	}

	// 사칙 연산의 메서드 생성 static 없이 생성
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public double div(double num1, double num2) {
		return (double)(num1 / num2);
	}

	public int rem(int num1, int num2) {
		return num1 % num2;
	}
}

