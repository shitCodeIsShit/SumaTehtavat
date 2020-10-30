package tehtava4;

public class ClockTimer extends SubjectPublisher {

	int second;
	int minute;
	int hour;

	public ClockTimer() {
		second = 0;
		minute = 0;
		hour = 0;
	}

	public int getSecond() {
		return second;
	}

	public int getMinute() {
		return minute;
	}

	public int getHour() {
		return hour;
	}

	public void tick() throws InterruptedException {

		// Haluan että yksi tikki on 1 sekunnin
		if (second < 59) {
			second++;
			ilmoita();
		} else {
			second = 0;
			if (minute < 59) {
				minute++;
			} else {
				minute = 0;
				if (hour < 23) {
					hour++;
				} else {
					hour = 0;
				}
			}

		}

	}

}
