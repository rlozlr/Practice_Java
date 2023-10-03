package Lv4.학생관리프로그램;

public class Student {
	/* 학생클래스 : 한 학생의 정보를 나타내는 클래스
	 * - 학번, 이름, 주민번호, 학부, 학과, 과목s(과목클래스를 배열로 생성[5])
	 * - 멤버변수 선언, 생성자, getter/setter
	 * - 학생정보만 출력 메서드, 수강과목을 출력 메서드, 수강과목 추가(신청) 메서드, 수강과목 삭제(철회) 메서드
	 * */
	private int stdCode;
	private String stdName;
	private int stdResisterNum; 
	private String stdDept;
	private String stdMajor;
	private Subject[] subList = new Subject[5]; //subject 클래스를 배열로
	private int subCnt; //배열의 index처리를 위한 변수
	
	public Student() {}
	public Student(String stdName, String stdMajor) {
		this.stdName = stdName;
		this.stdMajor = stdMajor;
	}
	public Student(String stdName, String stdMajor, Subject[] subList) {
		this.stdName = stdName;
		this.stdMajor = stdMajor;
		this.subList = subList;
	}
	public Student(int stdCode, String stdName, int stdResisterNum, String stdDept, String stdMajor,
			Subject[] subList, int subCnt) {
		this.stdCode = stdCode;
		this.stdName = stdName;
		this.stdResisterNum = stdResisterNum;
		this.stdDept = stdDept;
		this.stdMajor = stdMajor;
		this.subList = subList;
		this.subCnt = subCnt;
	}
	
	//학생정보만 출력하는 메서드
	public void printInfoStd() {
		System.out.println(stdName + "(" + stdMajor + ")");
	}
	
	//수강과목을 출력하는 메서드 (배열 출력)
	public void printStdSub() {
		if(subCnt == 0) {
			System.out.println("수강중인 과목이 없습니다.");
		}
		for(int i = 0; i < subCnt; i++) {
			System.out.println(""+(i+1) + ". "+ subList[i]);
		}
	}
	
	//수강과목 추가(신청) => subjectList 배열에 값이 들어가는 것
	//배열이 다 찼다면 늘려주기
	public void insertSub(Subject sub) {
		if(subCnt == subList.length) {
			Subject[] tmp = new Subject[subList.length+5];
			System.arraycopy(subList, 0, tmp, 0, subList.length);
			subList = tmp;
		}
		subList[subCnt] = sub;
		subCnt++;
	}
	
	//수강과목 삭제(철회)
	//찾았을 경우 삭제
	//뒷번지의 과목을 앞번지로 옮기는 작업
	//마지막 번지는 null로 채우기
	public void deleteSub(String subName) {
		int index = -1;
		if(subName == null) {
			return;
		}
		for(int i = 0; i < subList.length; i++) {
			if(subList[i].getSubNmae().equals(subName)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("과목이 존재하지 않습니다.");
			return;
		}
		for(int i = index; i < subList.length-1; i++) {
			subList[i] = subList[i+1];
		}
		subList[subCnt-1] = null;
		subCnt--;
	}
	
	public int getStdCode() {
		return stdCode;
	}
	public void setStdCode(int stdCode) {
		this.stdCode = stdCode;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdResisterNum() {
		return stdResisterNum;
	}
	public void setStdResisterNum(int stdResisterNum) {
		this.stdResisterNum = stdResisterNum;
	}
	public String getStdDept() {
		return stdDept;
	}
	public void setStdDept(String stdDept) {
		this.stdDept = stdDept;
	}
	public String getStdMajor() {
		return stdMajor;
	}
	public void setStdMajor(String stdMajor) {
		this.stdMajor = stdMajor;
	}
	public Subject[] getSubList() {
		return subList;
	}
	public void setSubList(Subject[] subList) {
		this.subList = subList;
	}
	public int getSubCnt() {
		return subCnt;
	}
	public void setSubCnt(int subCnt) {
		this.subCnt = subCnt;
	}
	
}
