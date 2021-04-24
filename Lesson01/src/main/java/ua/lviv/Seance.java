package ua.lviv;

public class Seance implements Comparable<Seance> {

	 Movie movie;
	 Time startTime;
	 Time endTime;

	//в конструктор має надходити параметрами значення для перших двох полів, 
	//третє поле повинне обчислюватись (startTime + movie.duration);
	 
	public Seance(Movie movie, Time startTime) throws MyException {
		super();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = startTime.plusTime(movie.getDuration());
	}
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		//return "Seance [movie=" + movie + ", startTime=" + startTime
			//	+ ", endTime=" + endTime + "]";
	   return  movie + ", Початок: " + startTime + ", кінець:" + endTime ;
	}

	@Override
	public int compareTo(Seance o) {
		// TODO Auto-generated method stub
		if (this.startTime.compareTo(startTime) == o.startTime.compareTo(startTime)) {
			return 0;
		} else if (this.startTime.compareTo(startTime) < o.startTime.compareTo(startTime)) {
			return -1;
		} else {
			return 1;
		}

	}
		

}
