package quest01;

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
		int num = sc.nextInt();
		
		int sum = 0;	// 합계 초기화
		int i = 0;	// 배열 번지수 초기화 
		while(num > 0) {	// num이 0이 아닐 때까지
			arr[i] = num % 10;	// num에서 10으로 나눈 나머지가 0번지부터 순서들어간다
			sum += arr[i];	// 배열의 i번지의 수를 누적해서 더해준다
			num = num / 10;	// 사용한 num는 10으로 나누어주어 몫만 재사용
			System.out.print(arr[i]+" ");	// 배열이 거꾸로 출력된다
			i++;	// 배열의 다음 번지에 값을 넣어주기 위해서 
		}
		System.out.println();
		System.out.println("sum> "+sum);
		
		sc.close();
	}

}
