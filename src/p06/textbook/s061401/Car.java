package p06.textbook.s061401;

public class Car {
    //필드 //프라이빗 으로 밖에서 접근못하게 설정
	private int speed;
	private boolean stop;
	
	//생성자
	
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speeed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
	
	
}
