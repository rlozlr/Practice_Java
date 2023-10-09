package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list를 생성 <String>
		 * 
		 * 
		 * */
		List<String> daily = new ArrayList<>();
		
		daily.add("WakeUp");
		daily.add("Shower");
		daily.add("Study");
		daily.add("Work");
		daily.add("Excercise");
		daily.add("Sleep");
		
		System.out.println("--for문--");
		for(int i =0; i <daily.size(); i++) {
			System.out.print(daily.get(i)+" ");
		}
		System.out.println();
		// 향상된 for문으로 출력
		System.out.println("--향상된 for문--");
		for(String tmp : daily) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// Iterator로 출력
		System.out.println("--Iterator로 출력--");
		Iterator<String> it = daily.iterator();
		
		while(it.hasNext()) {	// 다음의 요소값이 있는지 확인
			String tmp = it.next();	// 요소 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// Collection.sort(list); 	// 오름차순만
		System.out.println();
		Collections.sort(daily);
		System.out.println(daily);
		
		// sort(Comparator c)	// 오름차순, 내림차순 가능
		daily.sort(new Test());
	}

}

class Test implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// comparteTo메서드 사용	o2.compareTo(o1) : 내림차순	o1.compareTo(o2); // 오름차순
		return o2.compareTo(o1); // 오름차순
	}
	
}
