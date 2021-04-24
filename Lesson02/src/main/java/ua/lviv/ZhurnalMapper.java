package ua.lviv;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ZhurnalMapper {

	public static Zhurnal map(ResultSet result) throws SQLException{
		int id = result.getInt("id");
		String name = result.getString("name_of_zhurnal");
		double price = result.getDouble("price_of_Zhurnal");
		
		return new Zhurnal(id, name, price);
	}
	
}
