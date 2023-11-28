package Step2_board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardManager bm = new BoardManager();
		
		int menu = -1;
		do {
			bm.printMenu();
			menu = scan.nextInt();
			
			// 1. 글쓰기 | 2. 조회 | 3. 수정 | 4. 삭제 | 5. 전체목록 | 6. 종료
			switch(menu) {
			case 1: bm.addBoard(scan);
				break;
			case 2:	bm.searchBoard(scan);
				break;
			case 3: bm.modifyBoard(scan);
				break;
			case 4:	bm.removeBoard(scan);
				break;
			case 5:	bm.printBoard();
				break;
			case 6:	System.out.println("시스템 종료");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		} while ( menu != 6 );
	}

}
