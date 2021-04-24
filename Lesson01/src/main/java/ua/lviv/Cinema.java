package ua.lviv;
import java.util.ArrayList;
import java.util.TreeMap;


public class Cinema {
	TreeMap<Days, Schedule> schedules= new TreeMap<>();
    ArrayList<Movie> moviesLibrary = new ArrayList<>(); 

    Schedule s1 = new Schedule();
	Schedule s2 = new Schedule();
	Schedule s3 = new Schedule();
	Schedule s4 = new Schedule();
	Schedule s5 = new Schedule();
	Schedule s6 = new Schedule();
	Schedule s7 = new Schedule();

	
	public void addMovie(Movie movie){       
		moviesLibrary.add(movie);
	}

	public void addSeance(Seance seans, String day){   //додає сеанс фільму в розклад (schedules), в конкретний день, який задається параметром String 
		switch (day.toLowerCase()) {
		case "monday":
			s1.addSeance(seans);
			schedules.put(Days.Monday, s1);
			break;
		case "tuesday":
			s2.addSeance(seans);
			schedules.put(Days.Tuesday, s2);
			break;
		case "wednesday":
			s3.addSeance(seans);
			schedules.put(Days.Wednesday, s3);
			break;
		case "thursday":
			s4.addSeance(seans);
			schedules.put(Days.Thursday, s4);
			break;
		case "friday":
			s5.addSeance(seans);
			schedules.put(Days.Friday, s5);
			break;
		case "saturday":
			s6.addSeance(seans);
			schedules.put(Days.Saturday, s6);
			break;
		case "sunday":
			s7.addSeance(seans);
			schedules.put(Days.Sunday, s7);
			break;
			
		default:
			System.out.println("Нема такого дня!");
			break;
		
		}

	}
		
	

	public void removeMovie(Movie movie){  //	removeMovie(Movie) - повністю видаляє фільм з фільмотеки і розкладу, якщо був запланований
		moviesLibrary.remove(movie);
	}
	
	public void removeSeance(Seance seans, String day){  //removeSeance (Seance, String)  - видаляє конкретний сеанс фільму в конкретний день, який задається параметром String 
		switch (day.toLowerCase()) {
		case "MONDAY":
			s1.removeSeance(seans);
			schedules.put(Days.Monday, s1);
			break;
		case "TUESDAY":
			s2.removeSeance(seans);
			schedules.put(Days.Tuesday, s2);
			break;
		case "WEDNESDAY":
			s3.removeSeance(seans);
			schedules.put(Days.Wednesday, s3);
			break;
		case "THURSDAY":
			s4.removeSeance(seans);
			schedules.put(Days.Thursday, s4);
			break;
		case "FRIDAY":
			s5.removeSeance(seans);
			schedules.put(Days.Friday, s5);
			break;
		case "SATURDAY":
			s6.removeSeance(seans);
			schedules.put(Days.Saturday, s6);
			break;
		case "SUNDAY":
			s7.removeSeance(seans);
			schedules.put(Days.Sunday, s7);
			break;
	
		}
	}

	}
	


