package 컬렉션프레임워크;

import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {
		// Set 생성후
		// 1~45까지 랜덤수 6개 생성 후 출력
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		while(set.size() <6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
	}

}
