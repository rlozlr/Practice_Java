package Step1_최종복습;

import java.util.HashMap;

public class CollectionFramework02 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("홍길동", 89);
		map.put("옥순", 78);
		map.put("영철", 48);
		
		System.out.println(map);
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp + ":" + map.get(tmp));
		}
	}

}
