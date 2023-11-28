package Step2_word;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		//Word class
		//	- 단어장 프로그램 작성
		//	- 단어 등록 클래스
		//	- word, mean
		//
		//- WordManager class
		//	ArrayList<Word>
		//
		//WordMain class
		//	menu
		//	1. 단어 등록
		//	2. 단어 검색
		//	3. 단어 수정
		//	4. 단어장 출력
		//	5. 단어장 txt 파일로 출력
		//	6. 종료
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		
		int menu = -1;
		
		do {
			System.out.println("1.단어등록 | 2. 단어검색 | 3. 단어수정 |"
					+ "4. 단어출력 | 5.파일로 출력 | 6. 종료");
			System.out.print("menu >> ");
			menu = scan.nextInt();
				switch(menu) {
				case 1 : wm.insert(scan);
					break;
				case 2 : wm.search(scan);
					break;
				case 3 : wm.modify(scan);
					break;
				case 4 : wm.print(scan);
					break;
				case 5 : wm.textFile();
					break;
				case 6 : System.out.println("단어장 종료");
					break;
				default : System.out.println("잘못된 입력입니다.");
					break;
				}
			
		} while (menu != 6);
		
	}

}
