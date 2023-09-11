package Lv3.퀘스트;

public class Lotto {

	public static void main(String[] args) {
		/* 로또번호 생성 (1~45까지 랜덤으로 생성)
		 * 로또번호 = 1~45까지 6개 => 사용자번호 << 랜덤
		 * 당첨번호 = 1~45까지 7개 => 보너스번호 << 랜덤
		 * 
		 * 로또번호 (6자리) 1 2 3 4 5 6
		 * 당첨번호 (6자리+1자리) 1 2 3 4 5 6 [7]
		 * 로또번호는 중복되면 안됨
		 * 로또 등수 확인
		 * 1등 => 6자리 일치
		 * 2등 => 5자리 일치 + 보너스번호
		 * 3등 => 5자리 일치
		 * 4등 => 4자리 일치
		 * 5등 => 3자리 일치
		 * 꽝
		 * */ 
		int winLotto[] = new int[7];
		int userLotto[] = new int[6];
		
		// 로또번호 생성
		arrayLotto(winLotto);
		arrayLotto(userLotto);
		
		//로또번호 출력
		printLotto(userLotto);
		printLotto(winLotto);
		
		//로또등수 확인
		int rank = rank(winLotto, userLotto);
		if(rank == -1) {
			System.out.println("꽝~!!");
		}else {
			System.out.println("*축* "+rank+"등!!");
		}

	}
	//로또 번호 생성
	public static int random() {
		return (int)(Math.random()*45)+1;
	}
	
	//중복확인
	public static boolean isContain(int arr[], int random) {
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}
	
	// 로또 당첨번호 배열
	public static void arrayLotto (int arr[]) {
		int i = 0;
		while(i < arr.length) {
			int check = random();
			if(!isContain(arr, check)) {
				arr[i] = check;
				i++;
			}
		}
	}
	
	// 로또번호 출력
	public static void printLotto(int arr[]) {
		if(arr.length == 7) {
			for(int i = 0; i < arr.length-1; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("["+arr[arr.length-1]+"]");
		}else {
			for(int tmp : arr) {
				System.out.print(tmp+" ");
			}
			System.out.println();
		}
	}
	
	// 로또 등수
	public static int rank(int win[], int user[]) {
		if(win.length <= user.length) {
			return -1;
		}
		
		int cnt =0;
		for(int i = 0; i < user.length; i++) {
			if(isContain(win, user[i])) {
				cnt++;
			}
		}
		switch (cnt) {
		case 6: // 1등은 보너스번호 제외 6개 / 2등은 5개 +보너스번호
			return (isContain(user,	win[win.length-1]) ? 2 : 1);
		case 5: 
			return 3;
		case 4: return 4;
		case 3: return 5;
		default:
			return -1;
		}
	}

}

