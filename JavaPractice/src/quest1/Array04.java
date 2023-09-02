package quest1;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 5자리의 숫자를 입력 받아서 입력받은 숫자를 거꾸로 출력
		 * 각 자리의 합계 출력
		 * ex) 11456 => 65411 => 6+5+4+1+1
		 * ex) 19547 => 74591 = > 7+4+5+9+1 
		 * */
		Scanner sc = new Scanner (System.in);
		
		int arr[] = new int[5];
		
		System.out.print("5자리 숫자입력> ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length; j++) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		
		sc.close();

	}

}
