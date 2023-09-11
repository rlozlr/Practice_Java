package 기초;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		/* 콘솔 입력 : 콘솔에서 값을 입력 받는 것을 의미
		 * Scanner 클래스 => 콘솔에서 값을 입력 받을 수 있게 해주는 클래스
		 * */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자(정수)를 입력해주세요.");
//		int num = scan.nextInt();
//		System.out.println("내가 입력한 수 : "+num);
//		
//		//콘솔에서 숫자를 하나 입력받아 수가 짝수인지 홀수인지 출력
//		if(num%2==0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
//		
//		scan.close();
		
		// 숫자를 입력받아 양수인지, 음수인지, 0인지 판별하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num2 = sc.nextInt();
		if(num2>0) {
			System.out.println("양수");
		}else if(num2<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		System.out.println("--------------");
		System.out.println("실수 입력 > ");
		double num3 = sc.nextDouble();
		System.out.println("실수입력 > " +num3);
		
		System.out.println("한글자 입력 > ");
		// next() : 문자열 / charAt(index) : 문자열 중 index 번지 한글자 추출
		// index 번지는 0부터 시작
		char ch = sc.next().charAt(0); // 문자열 입력받는 형태
		System.out.println("한글자 > "+ ch);
		
		// 문자열 입력 : next() 공백 포함 안됨.
		System.out.println("문자열 > ");
		String s = sc.next();
		System.out.println("문자열 > " +s);
		
		sc.nextLine(); //enter 처리용

		// 여러 문자 입력 : nextLine() 공백 포함
		System.out.println("여러 문자 > ");
		String str = sc.nextLine();
		System.out.println("여러문자 > " + str);
		
		
		sc.close();

	}

}