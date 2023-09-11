package Lv1.퀘스트;

//import 단축키 : ctrl + Shift + o
//Scanner 클래스를 사용하기 위해 
import java.util.Scanner;

public class ScanIf01 {

	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 점수를 입력받아서 합계, 평균, 평가를 출력 
		 * 평가 : 평균이 90이상이면 A 
		 *       평균이 80이상이면 B 
		 *       평균이 70 이상이면 C 
		 *       나머지는 D
		 * 
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 점수를 입습니다 출력
		 */
		// 콘솔에 직접 입력하기 위해
		Scanner sc = new Scanner(System.in);	
		// 점수 입력 및 잘못된 점수
		System.out.print("국어 점수를 입력해 주세요> ");
		int kor = sc.nextInt();
		if (kor < 0 || kor > 100) {
			System.out.println("잘못된 점수를 입니다.");
		}
		System.out.print("영어 점수를 입력해 주세요> ");
		int eng = sc.nextInt();
		if (eng < 0 || eng > 100) {
			System.out.println("잘못된 점수입니다.");
		}
		System.out.print("수학 점수를 입력해 주세요> ");
		int math = sc.nextInt();
		if (math < 0 || math > 100) {
			System.out.println("잘못된 점수입니다.");
		}
		//합계,평균
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		
		System.out.println("합계> "+sum+"점, 평균> "+avg+"점");
		//평가
		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		sc.close();

	}

}