package Lv2.퀘스트;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택
		 * (0=가위, 1=바위, 2=보)
		 * 나도 가위, 바위, 보 중 선택해서 입력 (숫자, 문자 상관 없음.)
		 * 결과 =>
		 * 컴퓨터 > 가위, 나 > 가위 => 결과 무승부입니다.
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("-----가위바위보 게임-----");
		System.out.println("0. 가위 | 1. 바위 | 2. 보");
		System.out.println("*** 숫자를 선택해주세요 ***");
		game(com(),me(scan));	// 게임
		
	}
	public static int com () {
		return (int)(Math.random()*2);
	}
	// me는 직접 입력하므로 Scanner scan을 매개변수로 준다
	public static int me (Scanner scan) {
		System.out.print("입력> ");
		int meNum = scan.nextInt();
		return meNum;
	}
	// 컴퓨터의 선택과 나의 선택을 매개변수로 준다
	public static void game (int com, int me) {	
		System.out.println("----------");
		if(com == me) {
			System.out.println("비겼습니다.");
		} else {
			if(com == 0) {
				// me가 1이라면 이겼습니다/ 아니라면 졌습니다
				System.out.println((me == 1)?"이겼습니다.":"졌습니다.");
			} else if (com == 1) {
				System.out.println((me == 2)?"이겼습니다.":"졌습니다.");
			} else if (com ==2) {
				System.out.println((me == 0)?"이겼습니다.":"졌습니다.");
			}
		}
		System.out.println("----------");
	}

}
