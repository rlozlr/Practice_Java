package Lv4.로또;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	// 사용자 번호를 출력하는 로또 클래스 (상속을 해줘야 함.)
	protected int numbers[] = new int[6];
	
	/* 기능 
	 * - random번호 생성 
	 * - 랜덤번호 6개 numbers에 저장(중복x)
	 * - 배열 초기화
	 * - 번호 확인
	 * - 수동번호 생성
	 */
	
	// random 번호 생성
	protected int random() {
		return new Random().nextInt(45)+1;
	}
	
	// 중복체크
	protected boolean isContain(int num) {
		if(num < 0 || num > 45) {
			System.out.println("숫자의 범위는 1 ~ 45 입니다.");
			return false;
		}
		for(int tmp : numbers) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	// 랜덤번호 6개 numbers에 저장
	protected void randomLotto() {
		init();
		
		int cnt = 0;
		while (cnt < 6) {
			int r = random();
			if(!isContain(r)) {
				numbers[cnt] = r;
				cnt++;
			}
		}
	}
	
	// 배열을 초기화 
	protected void init() {
		numbers = new int[6];
	}

	// 번호확인
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
	
	// 수동 번호 생성
	protected void selectNum(int arr[]) {
		if(arr.length < numbers.length) {
			System.out.println("입력된 숫자의 개수가 옳지 않습니다.");
		}
		System.arraycopy(arr, 0, numbers, 0, numbers.length);
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
}
