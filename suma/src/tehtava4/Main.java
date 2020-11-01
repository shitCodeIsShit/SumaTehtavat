package tehtava4;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		ClockTimer timer = new ClockTimer();
		DigitalClock digiClock = new DigitalClock(timer);
		// Here could be a analog clock also
		
		// Loop tick indefenately
		while(true) {
			TimeUnit.SECONDS.sleep(1);
			timer.tick();
		}

	}

}
