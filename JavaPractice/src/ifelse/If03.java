package ifelse;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/* 수를 입력 받아서 2의 배수가 맞으면 2의 배수입니다.
		 * 3의 배수가 맞으면 3의 배수입니다.
		 * */
		//선생님 코드
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		 
		int num = scan.nextInt();
		  
		if(num%2 ==0 && num%3 ==0) {
		  	System.out.println(num+"는 2와 3의 배수입니다.");
		}else if(num % 2 ==0) {
		  	System.out.println(num+"는 2의 배수입니다.");
		}else if(num % 3 ==0) {
		  	System.out.println(num+"는 3의 배수입니다.");
		}else {
		  	System.out.println(num+"는 2/3의 배수가 아닙니다.");
		}	 
	}
}
