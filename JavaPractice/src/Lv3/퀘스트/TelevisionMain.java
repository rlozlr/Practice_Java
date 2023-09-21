package Lv3.퀘스트;

public class TelevisionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		
		// tv 전원 on 확인
		tv.isPower();
		
		// tv 채널 확인
		tv.channelUp();
		tv.channeDown();
		tv.channeDown();
		tv.channeDown();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		
		// tv 볼륨 확인
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		
		// tv 전원 off 확인
		tv.isPower();

	}

}

class Television {
	/* 멤버변수 : name, power, channel, vol
	 * 메서드 : 전원, 채널up/down, vol up/down
	 * */
	private String name;
	private boolean power;
	private int channel;
	private int vol;
	
	// 생성자
	public Television() { }
	
	// 전원 ON/OFF 메서드
	public void isPower() {
		if(!power) {
			power = true;
			System.out.println("TV ON!");
		}else {
			power = false;
			System.out.println("TV OFF!");
		}
	}
	
	// 채널 UP 메서드
	public void channelUp() {
		if( channel == 100) {
			channel = 0;
		} else {
			channel++;
		}
		System.out.println("채널 "+ channel);
	}
	
	// 채널 Down 메서드
	public void channeDown() {
		if( channel == 0) {
			channel = 100;
		} else {
			channel--;
		}
		System.out.println("채널 "+ channel);
	}
	
	// vol up 메서드
	public void volUp() {
		if(vol == 100) {
			System.out.println("최대 볼륨 입니다.");
		} else {
			vol++;
			System.out.println("볼륨 " + vol);
		}
	}
	
	// vol down 메서드
	public void volDown() {
		if(vol == 0) {
			System.out.println("음소거 상태입니다.");
		} else {
			vol--;
			System.out.println("볼륨 " + vol);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
}
