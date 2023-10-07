package 예외처리;

public class Exception02 {

	public static void main(String[] args) {
		// try~catch문으로 예외처리
		try {
			System.out.println(calc(4,0,'+'));
			System.out.println(calc(4,0,'-'));
			System.out.println(calc(4,0,'*'));
			System.out.println(calc(4,0,'&'));
			System.out.println(calc(4,0,'/'));
			System.out.println(calc(4,0,'%'));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("계산기 종료");

	}
	
	// 두 수, 연산자를 입력받아 4칙연산을 수행하고 결과를 리턴하는 메서드 생성
	// throw를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상
	// throw를 발생시키게 되면 메서드 선언부 끝에 throws 발생할 수 있는 예외를 반드시 적어줘야 함.
	// RuntimeException는 생략가능
	public static double calc(int num1, int num2, char op) throws RuntimeException {
		double result = 0; // 리턴 값을 담을 변수
		// 예외가 발생할 수 있는 상황을 미리 앞에서 처리
		if((op=='/' || op=='%') && num2 == 0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		case '+' : result = num1+num2; break;
		case '-' : result = num1-num2; break;
		case '*' : result = num1*num2; break;
		case '/' : result = num1/num2; break;
		case '%' : result = num1%num2; break;
		default:
			throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
		return result;
	}
}
