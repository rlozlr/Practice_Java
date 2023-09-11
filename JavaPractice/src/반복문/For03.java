package 반복문;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/* 단을 입력받아서 입력받은 단을 출력
		 * ex) 2 =>
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * ...
		 * 2*9=18
		 * */
		int dan;
		int result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 몇 단? > ");
		dan = sc.nextInt();
		System.out.println(dan+"단");
		
		for(int i=1; i<=9; i++) {
			result = dan*i;
			System.out.println(dan+" x "+i+" = "+result); // 선생님 코드 >> dan+" x "+i+" = "+(dan*i)
		}

		
		
		
	}

}