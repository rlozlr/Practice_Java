package Step2_board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardManager  implements BoardInterface {
	
	ArrayList<Board> list = new ArrayList<>();

	public void printMenu() {
		System.out.println("----Menu----");
		System.out.println("1. 글쓰기 | 2. 조회 | 3. 수정 | 4. 삭제 | 5. 전체목록 | 6. 종료");
		System.out.print(">> ");
	}

	// 제목, 작성자, 내용
	@Override
	public void addBoard(Scanner scan) {
		System.out.println("--[게시글 등록]--");
		System.out.print("제목 >> ");
		scan.nextLine();	// 공백처리
		String title = scan.nextLine();
		System.out.print("작성자 >>");
		String writer = scan.nextLine();
		System.out.print("내용 >> ");
		String content = scan.nextLine();
	
		Board b = new Board(title, content, writer);
		list.add(b);
		System.out.println("--[게시글 등록 완료]--");
	}
	
	// 게시글 번호로 검색
	@Override
	public void searchBoard(Scanner scan) {
		System.out.println("--[게시글 찾기]--");
		System.out.print("게시글 번호 >> ");
		int num = scan.nextInt();
		int idx = list.indexOf(new Board(num));	// 없으면 -1
		
		if( idx != -1) {
			System.out.println("--[게시글 찾기 성공]--");
			Board tmp = list.get(idx);
			System.out.println(tmp);
			return;
			
		} else {
			System.out.println("--[게시글 찾기 실패]--");
		}
	}
	
	// 게시글 수정 : 제목, 내용
	@Override
	public void modifyBoard(Scanner scan) {
		System.out.println("--[수정할 게시글 찾기]--");
		System.out.print("수정할 게시글 번호 >> ");
		int num = scan.nextInt();
		int idx = list.indexOf(new Board(num));
		
		if( idx != -1) {
			System.out.println("--[게시글 수정]--");
			System.out.print("제목 >> ");
			scan.nextLine();	// 공백처리
			String title = scan.nextLine();
			System.out.print("내용 >> ");
			String content = scan.nextLine();
			
			Board b = list.get(idx);
			b.setTitle(title);
			b.setContent(content);
			System.out.println("--[게시글 수정 성공]--");
			return;
			
		} else {
			System.out.println("--[게시글 수정 실패]--");
		}
		
	}
	
	// 게시글 삭제
	@Override
	public void removeBoard(Scanner scan) {
		System.out.println("--[삭제할 게시글 찾기]--");
		System.out.print("삭제할 게시글 번호 >> ");
		int num = scan.nextInt();
		int idx = list.indexOf(new Board(num));
		
		if( idx != -1) {
			System.out.println("--[게시글 삭제]--");
			list.remove(idx);
			System.out.println("--[게시글 삭제 성공]--");
			return;
			
		} else {
			System.out.println("--[게시글 삭제 실패]--");
		}
	}
	
	// 전체 목록
	@Override
	public void printBoard() {
		for(Board b : list) {
			System.out.println(b);
		}
	}

}
