package Step1_최종복습;

import java.util.HashMap;
import java.util.Scanner;

public class SimpleWord01 {

	public static void main(String[] args) {
		/* 입력할 단어 개수를 정하여 단어와 의미를 직접 입력하고
		 * map으로 간단한 단어장 만들기
		 */
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
		
		System.out.println(map);
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp+" : "+map.get(tmp));
		}
	}

}
