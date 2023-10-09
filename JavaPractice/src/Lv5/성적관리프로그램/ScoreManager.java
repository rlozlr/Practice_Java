package Lv5.성적관리프로그램;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreManager {
	/* map을 이용한 성적 관리 프로그램을 생성
	 * --menu--
	 * 1.성적추가
	 * 2.성적조회(전체출력) : 합계/평균 같이 출력
	 * 3.성적조회(과목별 조회) 국어 =>98점 서치 후 일력하는 과목 출력
	 * 4.성적수정 : 서치 후 수정
	 * 5.성적삭제
	 * 6.종료
	 * CRUD
	 * C(create) 생성
	 * R(read) 읽기(조회)
	 * U(update) 수정
	 * D(delete 삭제
	 * */
	
	private HashMap<String, Integer> gradeCard = new HashMap<>();
	private List<String> menu = new ArrayList<>();
	private String subject;
	private int score;
	
	
	public ScoreManager() {
		setMenu();
	}

	// 메뉴 만들기
	public void setMenu() {
		menu.add("성적추가");
		menu.add("전체성적");
		menu.add("과목성적");
		menu.add("성적수정");
		menu.add("성적삭제");
		menu.add("종료");			
	}
	
	//메뉴 출력
	public void printMenu() {
		System.out.println("--menu--");
		int cnt = 1;
		for(String tmp : menu) {
			System.out.println(cnt+". "+tmp);
			cnt++;
		}
	}
	
	// 6.종료
	public void exit() {
		System.out.println("시스템을 종료합니다.");
	}
	
	// 5.성적삭제
	public void delScore(Scanner scan) {
		System.out.println("--성적삭제--");
		System.out.print("성적삭제 과목명> ");
		String name = scan.next();
		if(gradeCard.get(name) == null) {
			System.out.println("존재하지 않는 과목입니다.");
			System.out.println();
			return;
		} else {
			gradeCard.remove(name);
			System.out.println("["+name+"] 과목이 삭제되었습니다.");
			System.out.println();
		}
	}
	
	// 4.성적수정
	public void editScore(Scanner scan) {
		System.out.print("성적수정 과목명> ");
		String name = scan.next();
		Integer subject = gradeCard.get(name);
		if (subject == null) {
			System.out.println("존재하지 않는 과목입니다.");
			System.out.println();
			return;
		} else {
			System.out.print("수정점수> ");
			int reScore = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("성적 점수가 잘못되었습니다.");
				System.out.println();
				return;
			}
			gradeCard.replace(name, reScore);
			System.out.println("["+name+"]의 점수 : "+reScore+"점으로 수정되었습니다.");
			System.out.println();
		}
	}
	
	// 3.과목성적
	public void subjectScore(Scanner scan) {
		System.out.println("--과목성적--");
		System.out.print("과목명> ");
		String name = scan.next();
		Integer subject = gradeCard.get(name);
		if(subject == null) {
			System.out.println("존재하지 않는 과목입니다.");
			System.out.println();
			return;
		} else {
			System.out.println("["+name+"]의 점수 : "+subject+"점");
			System.out.println();
		}
	}
	
	// 2.전체성적
	public void totalScore() {
		System.out.println("--전체성적--");
		Iterator<String> it = gradeCard.keySet().iterator();
		int sum = 0;
		while(it.hasNext()) {
			String subject = it.next();
			sum += gradeCard.get(subject);
			System.out.println(subject+":"+gradeCard.get(subject));
		}
		double avg = sum/gradeCard.size();
		System.out.println("합계: "+sum+"점, 평균: "+avg+"점");
		System.out.println();
	}
	
	// 1.성적추가
	public void add(Scanner scan) {
		int exit = -1;
		System.out.println("--성적추가--");
		while (exit != 0) {
			System.out.print("과목> ");
			subject = scan.next();
			System.out.print("점수> ");
			score = scan.nextInt();
			
			if(score < 0 || score > 100) {
				System.out.println("성적 점수가 잘못되었습니다.");
				System.out.println();
				return;
			}
			if(gradeCard.get(subject) == null) {
				gradeCard.put(subject, score);
			}else {
				System.out.println("["+subject +"] 이미 존재하는 과목입니다.");
				return;
			}

			System.out.print(">>> 계속(1) / 종료(0)> ");
			exit = scan.nextInt();
			System.out.println();
		}
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public HashMap<String, Integer> getGradeCard() {
		return gradeCard;
	}

	public void setGradeCard(HashMap<String, Integer> gradeCard) {
		this.gradeCard = gradeCard;
	}
	
	
}
