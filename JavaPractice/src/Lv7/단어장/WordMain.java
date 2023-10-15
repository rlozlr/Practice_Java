package Lv7.단어장;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* Word package에서 생성한 Word 클래스를 사용하여 
		 * 단어장 프로그램작성
		 * 1.단어등록|2.단어검색|3.단어수정
		 * 4.단어출력|5.단어삭제|6.단어파일출력|7.종료
		 * Word class ArrayList로 구성
		 * */
		
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		int menu = -1;
		
		do {
			wm.printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: wm.insertWord(scan);  break;
			case 2: wm.searchWord(scan);  break;
			case 3: wm.modifyWord(scan);  break;
			case 4: wm.printWord();  break;
			case 5: wm.deleteWord(scan);  break;
			case 6: wm.fileWord();  break;
			case 7:   break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}while(menu != 7);
		System.out.println("프로그램을 종료합니다.");

		scan.close();

	}

}
