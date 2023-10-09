package 컬렉션프레임워크;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * 	- 값을 2개 저장, key / value 값으로 저장
		 * 	- key는 중복불가, value 중복가능
		 * 	- HashMap을 가장 많이 사용
		 * 
		 * HashMap<String, Integer> map = new HashMap<String, Integer>();
		 * Map은 값이 2개여서 Iterator를 map 자체로는 사용불가.
		 * 향상된 For / Iterator => set으로 key값 추출 후 사용
		 * 
		 * list, set => .add()
		 * map => .put() / Keyset(), Values() => 추출
		 * */
		HashMap<String, Integer> map = new HashMap<>(); // 일반적으로 이렇게 씀
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료", 2000);
		
		System.out.println(map);
		System.out.println(map.keySet());	// set
		System.out.println(map.values());	// collection
		
		// key가 햄버거인 가격을 출력
		System.out.println(map.get("햄버거"));
		
		System.out.println("--향상된 for문 출력--");
		// 향상된 for문으로 출력
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println("--iterator 출력--");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println(map.entrySet());
		
		System.out.println("--entrySet 이용한 출력--");
		// entrySet 구성시 : getKey, getValue로 출력
		for(Map.Entry<String, Integer> tmp : map.entrySet() ) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
	
		
	}

}
