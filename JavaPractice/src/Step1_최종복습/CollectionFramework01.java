package Step1_최종복습;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크
		 * 
		 * List, Set, Map
		 * - List : 순서를 보장, 중복저장 가능, 배열과 동일 (보통 List를 많이 사용함)
		 * - Set : 순서를 보장하지 않음, 중복저장 안됨
		 * - Map : 2가지 데이터를 쌍으로 저장, 순서보장 X
		 * 	- key(중복 불가능), value(중복가능)
		 * */
		
		// 리스트를 생성하고 1부터 10까지 저장한 후 출력
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		for(Integer tmp : list) {
			System.out.print(tmp+" ");
		}

	}

}
