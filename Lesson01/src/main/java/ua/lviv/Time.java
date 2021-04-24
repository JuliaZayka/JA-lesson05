package ua.lviv;

public class Time implements Comparable<Time>{

	 int min; 
	 int hour;
	 //передбачити межі для їх значень (для min 0..60, для hour 0..24); 
	 public Time(int hour, int min) throws MyException {

			if (min < 0 || min >= 60)
				throw new MyException("Хвилини не можуть бути менші 0 чи більше 60");
			this.min = min;
			if (hour < 0 || hour >= 24)
				throw new MyException("Години не можуть бути менші 0 чи більше 24");
			this.hour = hour;
		}
	
	 public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		//return "Time [min=" + min + ", hour=" + hour + "]";
		return  hour + ":" +min ;
	}

	public Time plusTime(Time time) throws MyException {
			Time plus = new Time(0, 0);
			if ((this.getMin() + time.getMin()) < 60) {
				plus.setMin(this.getMin() + time.getMin());
				plus.setHour(this.getHour() + time.getHour());
			} else {
				plus.setMin((this.getMin() + time.getMin()) - 60);
				plus.setHour(this.getHour() + time.getHour() + 1);
			}
			return plus;

		}
	public int compareTo(Time anouserTime) {
		if (this.hour == anouserTime.hour) {
			return 0;
		} else if (this.hour < anouserTime.hour) {
			return -1;
		} else {
			return 1;
		}

	}

}
