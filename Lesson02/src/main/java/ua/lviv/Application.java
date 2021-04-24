package ua.lviv;

import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		List<Subscribers> listOfSubscribers = new ArrayList<>();
		listOfSubscribers.add(new Subscribers("Andrew", "Teron"));
		listOfSubscribers.add(new Subscribers("Bruce", "Willis"));
		listOfSubscribers.add(new Subscribers("Canibal", "King"));
		listOfSubscribers.add(new Subscribers("Daniel", "Rossi"));
		listOfSubscribers.add(new Subscribers("Enga", "Still"));

		List<Zhurnal> zhurnals = new ArrayList<>();
		zhurnals.add(new Zhurnal("Мурзілка", 35.50));
		zhurnals.add(new Zhurnal("NEW-USS", 50.70));
		
		SubDao subdao = new SubDao(ConnectionUtils.openConnection());
		ZhurnalDao zhurnaldao = new ZhurnalDao(ConnectionUtils.openConnection());
		listOfSubscribers.forEach(reader->{
			try {
				subdao.insert(reader);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}); 
		
		
		// READ-ALL
		subdao.readAll().forEach(System.out::println);
		System.out.println("************************************************\n");

		// READ-ById
		Subscribers subscribersFromBD = subdao.read(2);
		System.out.println(subscribersFromBD);

		// UPDATE - ById
		subscribersFromBD.setLastName(subscribersFromBD.getLastName() + "-DeLordRossi");
		subdao.update(subscribersFromBD);

		// READ-ALL
		subdao.readAll().forEach(System.out::println);
		System.out.println("************************************************\n");

		subdao.delete(6);

		// READ-ALL
		subdao.readAll().forEach(System.out::println);
		System.out.println("************************************************\n");

		zhurnals.forEach(zhurnal->{
			try {
				zhurnaldao.insert(zhurnal);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
		
		
		zhurnaldao.readAll().forEach(System.out::println);
		System.out.println("=============================================================\n");
		System.out.println(zhurnaldao.read(2).toString());
		System.out.println("=============================================================\n");
		zhurnaldao.update(new Zhurnal(2,"Lesia",20.80));
		System.out.println(zhurnaldao.read(2).toString());
		System.out.println("=============================================================\n");
		zhurnaldao.delete(2);
		zhurnaldao.readAll().forEach(System.out::println);
		System.out.println("=============================================================\n");

	}


	}



