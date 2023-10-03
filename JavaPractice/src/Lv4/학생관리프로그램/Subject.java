package Lv4.학생관리프로그램;

public class Subject {
	/* 과목클래스 : 한 과목의 기본정보를 나타내는 클래스
	 *  - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표
	 *  - 멤버변수 선언, 생성자, getter/setter
	 *  - toString/print메서드
	 * */
	private String subCode;
	private String subName;
	private int subCredite;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subScheduler;
	
	public Subject() {}

	public Subject(String subNmae) {
		this.subName = subNmae;
	}

	public Subject(String subCode, String subNmae, int subCredite, int subTime, String subProfessor, String subSemester,
			String subScheduler) {
		this.subCode = subCode;
		this.subName = subNmae;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subScheduler = subScheduler;
	}

	@Override
	public String toString() {
		return subName;
	}

	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubNmae() {
		return subName;
	}

	public void setSubNmae(String subNmae) {
		this.subName = subNmae;
	}

	public int getSubCredite() {
		return subCredite;
	}

	public void setSubCredite(int subCredite) {
		this.subCredite = subCredite;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubSemester() {
		return subSemester;
	}

	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}

	public String getSubScheduler() {
		return subScheduler;
	}

	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
}
