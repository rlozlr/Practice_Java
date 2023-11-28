package Step2_board;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Board {
	//	번호, 제목, 내용, 작성자, 작성일
	//	번호, 작성일 자동작성
	//  번호만 같은 객체가 들어오면 같은 객체로 인정 equals
	
	private static int count;	//	count 공유
	private int num;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	
	public Board() {
		count++;
		num = count;
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.regdate = dayTime.format(new Date());
	}

	public Board(String title, String content, String writer) {
		this();	// 기본 생성자 호출
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public Board(int num) {
		this.num = num;
	}
	
	public void print() {
		System.out.println("------------------------------");
		System.out.println("번호 : " + num);
		System.out.println("제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("작성일 : " + regdate);
		System.out.println("내용 :");
		System.out.println(content);
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Board.count = count;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, num, regdate, title, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		return Objects.equals(num, other.num);
	}

	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + "]";
	}
	
}
