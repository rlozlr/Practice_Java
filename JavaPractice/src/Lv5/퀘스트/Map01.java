package Lv5.퀘스트;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {
		/* map을 이용하여 과목과 점수를 입력하고,
		 * 합계와 평균을 출력
		 * --홍길동 점수
		 * 국어 89
		 * 영어 78
		 * 수학 96
		 * 합계:
		 * 평균:
		 * */
		
		HashMap<String, Integer> map = new HashMap<>();
		int sum =0;
		double avg =0;
		
		map.put("국어", 89);
		map.put("영어", 78);
		map.put("수학", 96);
		
		//평균
		System.out.println("--홍길동 점수");
		for(String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
			sum += map.get(key);
		}
		avg = (double)sum/map.size();
		
		System.out.println("합계: "+sum);
		System.out.printf("평균: %.1f",avg);
	}

}
