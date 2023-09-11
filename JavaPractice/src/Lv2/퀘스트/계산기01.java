package Lv2.퀘스트;

import java.util.Scanner;

public class 계산기01 {

	public static void main(String[] args) {
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 + - * / % 만 허용
		 * 두 수와 연산자를 입력 받아서 메서드를 활용하여 연산 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("===계산기=== ");
		System.out.print("첫번째 정수를 입력 > ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력 > ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 > ");
		String op = sc.next();

		switch (op) {
		case "+": add(num1, num2, op); break; // 리턴이 없는 메소드
		case "-": sub(num1, num2, op); break;
		case "*": // 리턴이 있는 메소드
			int mul = mul(num1, num2); 
			System.out.println(mul);
			break;
		case "/":  //몫
			double[] div = rem(num1,num2); //몫 나머지가 들어있는 배열 호출
			System.out.println(div[0]);
			break;
		case "%": //나머지  
			// rem2를 호출하여 몫과 나머지를 출력
			double[] rem = rem(num1,num2); //몫 나머지가 들어있는 배열 호출
			System.out.println(rem[1]);
			break;

		default:
			System.out.println("연산자를 잘못 입력하였습니다.");
		}
		
		System.out.println("---계산종료---");
		
		sc.close();

	}
	// 값을 연산자까지 매개변수로 받아 리턴 없이 출력한 메서드
	public static void add(int num1, int num2, String op) {
		System.out.println(num1+op+num2+"="+(num1+num2));
	}
	public static void sub (int num1, int num2, String op) {
		System.out.println(num1+op+num2+"="+(num1+num2));
	}
	// 두 정수를 매개변수로 받아 결과를 리턴 받는 형태의 메서드
	public static int mul (int num1, int num2) {
		return num1 * num2;
	}
	
	/* 기능 : 두 정수를 입력받아 두 정수의 몫과 나머지를 double[]로 리턴
	 * 리턴 타입 : double 타입의 배열
	 * 매개변수 : 두 정수
	 * 변수명 : rem2
	 * */
	public static double[] rem (int num1, int num2) {
		double[] rem = new double[2];
		rem[0] = num1 / num2;
		rem[1] = num1 % num2;
		return rem;
	}
}
