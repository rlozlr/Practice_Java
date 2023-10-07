package 클래스;

public class 익명클래스 {

	public static void main(String[] args) {
		/* 익명클래스 : 이름이 없는 클래스
		 * 인터페이스를 이용하여 객체를 만들때 클래스 없이 바로 구현
		 * 익명 클래스를 사용하는 이유
		 * 인터페이스의 기능 적고, 해당 객체가 한번만 사용할 경우
		 * 메서드에서 매개변수로 인터페이스를 구현한 클래스가 필요
		 * */
//		TV t = new TV();
//		product(t);
		
		// 익명 클래스로 작업한 경우
		product(new Power() {

			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
				
			}
			
		});
		
		
	}
	public static void  product(Power p) {
		p.turnOn();
		System.out.println("제품이 작동중 입니다.");
		p.turnOff();
	}
}

interface Power {
	void turnOn();
	void turnOff();
}

//class TV implements Power {
//
//	@Override
//	public void turnOn() {
//		System.out.println("전원이 켜졌습니다.");
//		
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("전원이 꺼졌습니다.");
//		
//	}
//	
//}
