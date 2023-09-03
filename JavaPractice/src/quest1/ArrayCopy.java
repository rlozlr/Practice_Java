package quest1;

public class ArrayCopy {

	public static void main(String[] args) {
		/* 3개의 값을 담을 수 있는 String 배열 생성 후
		 * 국어, 영어, 수학 글자를 담은 후 출력 (향상된 for문으로 출력)
		 * 
		 * 5개의 값을 담을 수 있는 String 배열 생성 후
		 * 사회, 과학을 추가하여 향상된 for문으로 출력
		 * */
		
		String sub[] = new String[] {"국어", "영어", "수학"};
		for(String str : sub) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		String sub2[] = new String[5];	// 새로운 배열 생성
		System.arraycopy(sub, 0, sub2, 0, sub.length);	// sub 배열을 복사해서 sub2배열에 넣기
		sub2[3] = "사회";
		sub2[4] = "과학";
		
		for(String str : sub2) {
			System.out.print(str+" ");
		}

	}

}
