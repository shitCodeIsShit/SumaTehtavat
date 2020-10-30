package tehtava4;

public class DigitalClock implements Observer{
	
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.attach(this);
	}

	public void update(SubjectPublisher s) {

		if(s == timer) {
			draw();
		}
		
	}
	
	private void draw() {
		int second = timer.getSecond();
		int minute = timer.getMinute();
		int hour = timer.getHour();
		
		System.out.println(second + ":" + minute + ":" + hour);
	}

}
