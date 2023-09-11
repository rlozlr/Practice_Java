package Lv1.퀘스트;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		/*
		 * 정수 2개와 연산자 하나를 입력 받아 
		 * 두 정수의 연산을 출력 
		 * 연산자는 + - * / % 
		 * ex) 3 2 + => 3+2=5 
		 * 6 6 3 / => 6/3=2 
		 * 만약 연산자의 종류가 다른 연산자가 들어오면 잘못된 입력 출력
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수> ");
		int num2 = sc.nextInt();
		System.out.print("연산자> ");
//		String op = sc.next();
		char op1 = sc.next().charAt(0);

		// swtich문
//		switch (op) {
//		case "+":
//			int sum = num1 + num2;
//			System.out.println(num1 + op + num2 + "=" + sum);
//			break;
//		case "-":
//			int sub = num1 - num2;
//			System.out.println(num1 + op + num2 + "=" + sub);
//			break;
//		case "*":
//			int mul = num1 * num2;
//			System.out.println(num1 + op + num2 + "=" + mul);
//			break;
//		case "/":
//			double div = (double) num1 / num2;
//			System.out.println(num1 + op + num2 + "=" + div);
//			break;
//		case "%":
//			int rem = num1 % num2;
//			System.out.println(num1 + op + num2 + "=" + rem);
//			break;
//		default:
//			System.out.println("잘못된 연산자 입니다.");
//		}

		// if문
		if (op1 == '+') {
			int sum = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + sum);
		} else if (op1 == '-') {
			int sub = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + sub);
		} else if (op1 == '*') {
			int mul = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + mul);
		} else if (op1 == '/') {
			double div = (double) num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + div);
		} else if (op1 == '%') {
			int rem = num1 % num2;
			System.out.println(num1 + "%" + num2 + "=" + rem);
		} else {
			System.out.println("잘못된 연산자 입니다.");
		}
		
		sc.close();

	}

}
