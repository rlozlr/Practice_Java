package 콜렉션;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, set, Map
		 * 데이터를 묶어서 관리할 때 사용 (배열 대신으로 List)
		 * 주로 배열 대신에 사용
		 * 
		 * List
		 * - 배열과 동일
		 * - 값을 하나씩 저장
		 * - 중복을 허용
		 * - index를 가짐
		 * - 배열 대신에 가장 많이 사용
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 중복을 허용X
		 * - index가 없음.
		 * - 순서를 보장 X
		 * 
		 * Map
		 * - 값을 두개씩 저장, key/value 쌍으로 저장
		 * - key 중복불가, value는 중복가능
		 * - key가 중복되면 덮어쓰기 됨.
		 * - 아이디/패스워드처럼 같이 묶어서 하나의 자료로 저장해야할 때 사용됨.
		 * - 순서보장X
		 * 
		 * int arr[] = new int[5];	// 기본자료형으로 사용가능
		 * collection에서는 클래스로 데이터를 관리
		 * int -> Integer, String을 제외한 나머지 자료형은
		 * 첫글자만 대문자로 변환하면 클래스가 됨. 
		 * long -> Long, byte -> Byte, double -> Double 등.
		 * 클래스를 지정하지 않으면 Object가 자동으로 들어간다.
		 * */
		
		List list3 = new ArrayList();	// Object가 자동 들어간 케이스
		List<Integer> list = new ArrayList<Integer>();	// 일반적인 선언
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		// add() : 리스트에 요소를 추가
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		// size() : list의 개수 리턴
		System.out.println(list.size());
		
		// 문자열만 가능한 ArrayList 생성 3개 추가 후 출력
		List<String> strList = new ArrayList<>();
		
		strList.add("가");
		strList.add("나");
		strList.add("다");
		System.out.println(strList);
		System.out.println(strList.size());
		
		// list2에 1부터 10까지 입력하고, 출력
		for(int i = 1; i <= 10; i++) {
			list2.add(i);
		}
		System.out.println(list2);
		for(int i = 1; i <= 10; i++) {
			list2.add(i);	// 중복가능
		}
		System.out.println(list2);
		
		// get(index) : index번의 값을 가져오는 것
		System.out.println(list2.get(0));
		
		// set(index, 값) : index 번지의 값을 변경하는 것
		list2.set(0, 3);
		System.out.println(list2);
		
		// list2의 모든 요소를 출력
		for(int i = 0; i < list2.size(); i++) {
//			System.out.print(list2.get(i)+" ");
			
			if(list2.get(i) % 2 == 0) {
				System.out.print(list2.get(i)+" ");
			}
		}
		System.out.println();
		// remove(index): index번지값 삭제, remove(object): object 객체삭제
		list2.remove(0);	// 0번지의 값 삭제
		System.out.println(list2);
		Integer a = 10;
		list2.remove(a);
		System.out.println(list2);

		// contains(Object) : list에 값이 있는지 검사 true/false
		System.out.println("-------------------");
		System.err.println(list2.contains(a));
		
		// clear() : 리스트 비움
		list2.clear();
		System.out.println(list2);
		
		// isEmpty() : list가 비었는지 체크 true/false
		System.out.println(list2.isEmpty());
		
		// list2에 1부터 5까지 값을 추가하고 각 요소를 출력
		for(int i = 1; i <=5; i++) {
			list2.add(i);
		}
		System.out.println(list2);
		
		// 향상된 for문
		for(int tmp : list2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// index를 사용할 수 없는 컬렉션을 출력하기 위해 사용하는 객체
		// Iterator : index가 없는 컬렉션을 출력하기 위해 사용
		
		/* list는 index가 있기 때문에 get(i)를 사용가능.
		 * set, map은 순서를 보장하지 않기 때문에 for 사용불가
		 * 향상된 for문, Iterator처럼 순서와 상관없이 값을 가져올 수 있는 구문에서 출력 가능
		 * */
		
		System.out.println("> Iterator 출력");
		Iterator<Integer> it = list2.iterator();
		
		while(it.hasNext()) {	// 요소가 있는지 체크
			Integer tmp = it.next();	//  다음요소 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// indexOf(값) : 값의 index 번지를 리턴 / 없으면 -1리턴
		Integer b = 5;
		System.out.println(list2.indexOf(b));
		
		// sort(객체)
		// - 객체 : comparator 인터페이스를 구현한 객체를 넣어야 함.(내부(익명)클래스)
		list2.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1-o2 : 오름차순	o2-o1 : 내림차순
				return o2 - o1;	// 오름차순
			}
		});
		
		System.out.println(list2);
		
		
		
		
	}
	

}
