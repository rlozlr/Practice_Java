package Lv3.퀘스트;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구 게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성 (1~9까지만) => 중복 X
		 * user가 3자리 숫자를 맞추는 게임.
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball
		 * 모두 아니면 out
		 * => 3 5 7
		 * 	  3 6 7 => 2strike
		 *    3 5 7
		 * 	  3 7 6 => 1strike 1ball
		 *    3 5 7
		 * 	  7 3 5 => 3ball
		 *    3 5 7
		 * 	  1 2 6 => out
		 * 
		 * 	  -- 야구 게임 시작
		 * 	  컴퓨터가 숫자를 정했습니다.
		 *    슷자 입력(1~9, 3자리) :
		 *    3 4 5
		 *    결과
		 *    3s 다 맞으면 종료 (몇 번 만에 맞췄는지 출력)  
		 * */
		int com[] = new int[3];
		int me[] = new int[3];
		
		int lastNum = 9;	//random 범위의 마지막
		int startNum = 1;	//random 범위의 시작
		int s = 0, b = 0; // Strike, ball
		int cnt = 0;	// 게임 횟수
		
		Scanner scan = new Scanner(System.in);
		
		comArray(com, lastNum, startNum);
		System.out.println("=====야구게임=====");
		System.out.println("컴퓨터가 수를 결정하였습니다.");
//		printArray(com); // 컴퓨터 배열 확인용
		
		while(s!=3) {
			System.out.println("슷자 입력(1~9, 3자리)> ");
			for(int i = 0; i < me.length; i++) {
				me[i] = scan.nextInt();
			}
			cnt++;	// 게임 횟수 카운트
			
			s = strike(com,me);
			b = ball(com, me);
			
			if(s!=0) {
				System.out.print(s+"s ");
			}
			if(b!=0) {
				System.out.print(b+"b ");
			}
			System.out.println();
			System.out.println("게임횟수 : "+cnt);
			if(s==0 && b ==0) {
				System.out.println("out~!!");
			}
			if(s==3) {
				System.out.println("정답~!!");
			}
		}
		scan.close();

	}
	
	// 랜덤번호 생성 : 매개변수로 범위를 설정
	public static int random(int lastNum, int startNum) {
		return (int)(Math.random()*lastNum)+startNum;
	}
	
	// 중복 확인
	public static boolean isConstain(int arr[], int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	// 배열 생성
	public static void comArray(int arr[], int lastNum, int startNum) {
		int i = 0;
		while(i < arr.length) {
			int r = random(lastNum, startNum);
			if(!isConstain(arr,	r)) {
				arr[i] = r;
				i++;
			}
		}
	}
	
	//배열 출력
	public static void printArray(int arr[]) {
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();// 줄바꿈
	}
	
	//strike
	public static int strike (int com[], int me[]) {
		int cnt = 0;
		for(int i = 0; i < com.length; i++) {
			if(com[i] == me[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	// ball
	public static int ball(int com[], int me[]) {
		int cnt = 0;
		for(int i = 0; i < com.length; i++) {
			if(isConstain(me, com[i])) {
				cnt++;
			}
		}
		return cnt-strike(com,me);
	}

}
	
