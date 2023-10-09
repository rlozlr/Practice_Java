package Lv5.퀘스트;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 과목:점수, 합계, 평균 출력
		 * 종료 키워드가 나올 때까지 반복(종료키워드 = 0)
		 * 과목> 국어 점수 > 89
		 * 다시입력? 종료(0) >
		 * 종료 후 과목:점수, 합계, 평균 출력
		 * */
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		do {
			System.out.print("과목> ");
			String obj = sc.next();
			System.out.print("점수> ");
			int score = sc.nextInt();
			map.put(obj, score);
			sum += score;
			
			System.out.print("추가입력(1)/종료(0)>");
			num = sc.nextInt();
			System.out.println();
		} while (num !=0);
		double avg = sum/map.size();
		System.out.println("============ 성적표 ============");
		for(String key : map.keySet()) {
			System.out.println(key+": "+map.get(key)+"점");
		}
		System.out.println("합계: "+sum+"점, 평균: "+avg+"점");
		System.out.println("================================");
	}

}
