package quest02;

import java.util.Scanner;

public class 계산기02 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * (+ - * / %) 각각 메서드 만들기 => 메서드에서 바로 출력
		 * ex) 3 5 => 메뉴 
		 * - 원하는 계산을 선택해주세요>
		 * - 1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지
		 * 각 기능 메서드 => 바로 출력 (3 + 5 = 8) 
		 * 
		 * 1. 숫자를 입력받는 메서드 => 숫자를 배열에 담아 리턴
		 * 2. 메뉴 메서드 => 메뉴를 출력하고, 메뉴의 번호를 입력받아 리턴
		 * 3. 각 기능 메서드들
		 * 
		 * main에서 할 일
		 * 1) 1번 메서드 호출 => 숫자의 배열을 받기
		 * 2) 2번 메서드 호출 => 내 선택 번호 가져오기
		 * 3) switch(번호)
		 * 4) 기능 메서드 호출
		 * */
		Scanner scan = new Scanner(System.in);
		int num[] = num(scan);
		int menu = menu(scan);
		
		switch (menu) {
		case 1: sum(num); break;
		case 2: sub(num); break;
		case 3: mul(num); break;
		case 4: div(num); break;
		case 5: rem(num); break;
		default:
			System.out.println("올바른 메뉴가 아닙니다.");
			break;
		}

	}
	public static int[] num(Scanner scan) {
		int arr[] = new int[2];
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번째 정수> ");
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	public static int menu(Scanner scan) {
		System.out.println("1:덧셈 | 2:뺄셈 | 3:곱셈 | 4:나눗셈 | 5:나머지");
		int menu = scan.nextInt();
		return menu;
	}
	public static void sum(int nums[]) {
		System.out.println(nums[0]+"+"+nums[1]+"="+(nums[0]+nums[1]));
	}
	public static void sub(int nums[]) {
		System.out.println(nums[0]+"-"+nums[1]+"="+(nums[0]-nums[1]));
	}
	public static void mul(int nums[]) {
		System.out.println(nums[0]+"*"+nums[1]+"="+(nums[0]*nums[1]));
	}
	public static void div(int nums[]) {
		System.out.println(nums[0]+"/"+nums[1]+"="+(nums[0]/nums[1]));
	}
	public static void rem(int nums[]) {
		System.out.println(nums[0]+"%"+nums[1]+"="+(nums[0]%nums[1]));
	}

}
