package Step1_최종복습;

import java.util.HashMap;
import java.util.Scanner;

public class SimpleWord02 {

	public static void main(String[] args) {
		// SimpleWord01 클래스와 단어장을 method로 분리
		// method에서 리턴한 map을 받아서 출력
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = make();
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp+" : "+map.get(tmp));
		}

	}
	
	// 기능 : 단어:의미를 입력받아 map을 구성
	// map은 매서드 안에서 생성하여 리턴
	// method명 : make()
	
	public static HashMap<String, String> make() {
		HashMap<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어 개수 : ");
		int num = scan.nextInt();
		
		while(map.size() < num) {
			System.out.print("단어> ");
			String word = scan.next();
			System.out.print("의미> ");
			String mean = scan.next();
			map.put(word, mean);
		}
		
		return map;
	}

}
