package Lv4.로또;

import java.util.Scanner;

public interface LottoProgram {

	void createLotto(Scanner scan); //수동 로또 번호 입력
	void createLottoAuto();
	void insertLottoAuto(); //당첨번호
	void checkLotto(); //최신 당첨번호와 사용자 번호를 체크 등수
	void printLotto(); //리스트 출력
}
