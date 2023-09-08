package method;

public class Method02 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - / %
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		 * + 일 때 호출 => 메인에서 출력
		 * - 일 때 호출 => 메인에서 출력
		 * * 일 떄 호출 => 메서드에서 출력
		 * / 일 때 호출 => 메서드에서 출력 => 리턴을 double로
		 * % 일 떄 호출 => 메서드에서 출력
		 * */
		
		int sum = add(14,5);
		System.out.println(sum);
		
		int sub = sub(14,5);
		System.out.println(sub);
		
		mul(14,5);
		
		double div = div(14,5);
		System.out.println(div);
		
		rem(14,5);
		
		int method01 = Method01.sum(10, 30); // Method01클래스에서 정의한 sum 메서드 호출
		System.out.println(method01);
		
		// 다른 클래스에 있는 메서드를 사용 (static이 있는 경우)
		// 클래스.메서드명
		// 클래스 => 정의서 => 객체를 생성해서 메서드를 사용
		// 현재 시점에서 객체 생성없이 메서드를 사용할 수 있는 이유 = static
		// (static이 없는 경우) - 선언만 해놓고 생성이 안되어 있다는 것을 의미
		// 객체를 생성 => 클래스가 필요
		Method02 me = new Method02(); //메소드가 있는 클래스명
		int s = me.add(20, 30); // 메소드의 호출
		System.out.println("me 객체 생성 후 add 호출 : "+s);
	}
	
	//Method 정의
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public static int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	public static double div(int num1, int num2) {
		return (double) num1 / num2;
	}
	public static void rem (int num1, int num2) {
		System.out.println(num1 % num2);
	}
	

}