package quest1;

import java.util.Scanner;

public class 파일찾기 {

	public static void main(String[] args) {
		/* 파일명 5개가 주어졌을 때, 
		 * 원하는 단어를 입력하면 
		 * 입력한 단어가 있는 파일들을 출력하도록 코드를 작성
		 * */
		//주어진 파일명 5개
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg"
				,"String메서드.txt","String함수.jpg","java의 함수.png"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색> ");
		String str = sc.next();
		System.out.println("----------------");
		
		int cnt = 0;
		for(String tmp : fileName) {	// fileName을 tmp에 하나씩 대입하는데
			if(tmp.contains(str)) {	// tmp가 입력한 str을 포함하고 있으면
				System.out.println(tmp);	// tmp를 출력하고
				cnt++;	// cnt를 센다.
			}
		}
		if(cnt == 0) {	// cnt가 0이라면 입력한 str을 포함하고 있는 문자가 없으므로
			System.out.println("검색결과가 없습니다.");
		}
		
	}

}
