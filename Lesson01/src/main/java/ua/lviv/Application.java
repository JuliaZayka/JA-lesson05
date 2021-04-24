package ua.lviv;
import java.util.Scanner;
public class Application {
	
	public static void main(String[] args) throws MyException {
		//  створити об'єкт Cinema; - реалізувати меню, в якому виконується весь функціонал Cinema. 
        // Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно. 
		//Супроводжуючі повідомлення і тому подібне. Там де потрібно, зробити compareTo().
		

		Cinema cinema = new Cinema();
		System.out.println("Введіть 1, щоб додати фільм" + 
	                     "\nВведіть 2, щоб додати фільм в розклад в конкретний день" +
	                     "\nВведіть 3, щоб видалити фільм" +
                         "\nВведіть 4, щоб вивести розклад"+
	                     "\nВведіть 5, щоб вийти з кінотеатру");
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			switch (str) {
			case "1":
				System.out.println("Введіть назву фільму:");
				String name = scan.next();
				System.out.println("Введіть тривалість фільму-год.,хв:");
				int hour = scan.nextInt();
				int min = scan.nextInt();
				
				Time timeDuration = new Time (hour, min);
				Movie mov = new Movie(name, timeDuration);
				cinema.addMovie(mov);
				System.out.println("Фільм додали");
				break;
			case "2":
				System.out.println("Ведіть індекс фільму:");
				int index = scan.nextInt();
				System.out.println("Введіь початок фільму-год,хв");
				int hour2 = scan.nextInt();
				int min2 = scan.nextInt();
				System.out.println("Введіть день(english)");
				String day = scan.next();
				
				Time startTime = new Time (hour2, min2);
				Seance seans = new Seance(cinema.moviesLibrary.get(index),startTime);
				cinema.addSeance(seans, day);
				System.out.println("Фільм додали");
				break;
			case "3":
				System.out.println("Введіть індекс фільму:");
				int index3 = scan.nextInt();
				cinema.removeMovie(cinema.moviesLibrary.get(index3));
				System.out.println("Фільм видалили");
				break;
			
			case "4":
				System.out.println("Понеділок: \n" + cinema.schedules.get(Days.Monday));
				System.out.println("Вівторок: \n" + cinema.schedules.get(Days.Tuesday));
				System.out.println("Середа: \n" + cinema.schedules.get(Days.Wednesday));
				System.out.println("Четвер: \n" + cinema.schedules.get(Days.Thursday));
				System.out.println("П'ятниця: \n" + cinema.schedules.get(Days.Friday));
				System.out.println("Субота: \n" + cinema.schedules.get(Days.Saturday));
				System.out.println("Неділя: \n" + cinema.schedules.get(Days.Sunday));
				break;

			case "5":
				System.exit(0);
			}
		}
	                    
	}

}



