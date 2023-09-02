package quest1;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		/* 단을 입력받아서 입력받은 단을 출력
		 * ex) 2 =>
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * ...
		 * 2*9=18
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단?> ");
		int dan = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			int result = dan*i;
			System.out.println(dan+"*"+i+"="+result);
		}
		sc.close();
		
	}

}
