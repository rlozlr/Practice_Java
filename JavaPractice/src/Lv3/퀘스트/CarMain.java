package Lv3.퀘스트;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car("자동차", 2023, "white");
		// car 출력
		System.out.println(car);
		
		// 시동 on 확인
		car.power();
		// speed up 확인
		car.speed("up");
		// speed down 확인
		car.speed("down");
		// speed 최저 속도일 때 확인
		car.speed("down");
		car.speed("down");
		// 시동 off 확인
		car.power();
		// 시동 off일때 speed up 확인
		car.speed("up");

	}

}
/* 자동차 클래스 생성
 * 멤버변수 : name, year, color, power, speed
 * 메서드 : 전원, 스피드 up, 스피드 down
 * getter /setter 필요
 * 생성자
 * */
class Car {
	private String name;
	private int year;
	private String color;
	private boolean power;
	private int speed;
	private int maxSpeed = 200;
	private int minSpeed;
	
	// 생성자
	public Car() {}
	public Car(String name, int year, String color) {
		this.name = name;
		this.year = year;
		this.color = color;
	}
	
	// 전원 on/off 메서드
	public void power() {
		if(!power) {
			power = true;
			System.out.println("시동 ON");
		} else {
			power =false;
			System.out.println("시동 OFF");
		}
	}
	
	// 스피드 메서드
	public void speed(String str) {
		if(power) {
			if(str == "up") {
				if(speed == maxSpeed) {
					System.out.println("최고속도 입니다.");
				}else {
					speed+=10;
					System.out.println("현재 속도> "+speed);
				}
			}else if(str == "down") {
				if(speed == minSpeed) {
					System.out.println("속도가 0 입니다.");
				}else {
					speed-=10;
					System.out.println("현재 속도> "+speed);
				}
			} 
		} else {
			System.out.println("전원을 켜주세요.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMinSpeed() {
		return minSpeed;
	}
	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
	@Override
	public String toString() {
		return name + "(" + year + "): " + color;
	}
			
	
	
	
}
