package 조건문;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		//선생님 코드
		Scanner scan = new Scanner(System.in);
		//입력 안내문자
		System.out.println("정수 입력(0~100) : 국어, 영어, 수학 순으로 입력.");
		  
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		  
		if(kor <0 || kor >100) {
			System.out.println("국어점수가 입력 범위를 벗어났습니다.");
		}
		if(eng <0 || eng >100) {
		  	System.out.println("국어점수가 입력 범위를 벗어났습니다.");
		}
		if(math <0 || math >100) {
		  	System.out.println("국어점수가 입력 범위를 벗어났습니다.");
		}
		  
		int sum = kor + eng + math;
	 
		double avg = sum / 3.0;
		  
		System.out.println("합계:"+sum+", 평균:"+avg);
		  
		char ch ='D'; // char 형태는 ''
		if(avg>100 || avg <0) {
		  	System.out.println("잘못된 성적");
		}else if(avg >=90) {
			ch='A';
		}else if(avg >=90) {
		  	ch='B';
		}else if(avg >=70) {
		  	ch='C';
		}else {
		  	ch='D';
		 }
		 System.out.println("평가"+ch);
		 

	}

}
