package ua.lviv;

import java.util.Set; 
import java.util.TreeSet;

public class Schedule {

	 static Set<Seance> seances = new TreeSet<>();

	 public static void addSeance(Seance seance){
		 seances.add(seance);
		 
	 }
	

    public static void removeSeance(Seance seance){
    	seances.remove(seance);
    }


	@Override
	public String toString() {
		
		//return "Schedule [getClass()=" + getClass() + ", hashCode()="
			//	+ hashCode() + ", toString()=" + super.toString() + "]";
		return "" + seances;
	}
    
}

//методи: addSeance (Seance), removeSeance (Seance); 

