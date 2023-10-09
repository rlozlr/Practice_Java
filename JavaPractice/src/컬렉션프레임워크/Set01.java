package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set : 순서보장X (index가 없음) 중복X
		 * HashSet 
		 * */
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");
		
		System.out.println(set);
		for(String tmp : set) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("--iterator 출력");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("--list변환--");
		
		//set을 list로 변환 후 정렬
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// compareTo
				return o2.compareTo(o1);
			}
		});
	}

}
