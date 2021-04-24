package ua.lviv;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubMapper {

	public static Subscribers map(ResultSet result) throws SQLException {
		int id = result.getInt("id");
		String firstName = result.getString("first_name");
		String lastName = result.getString("last_name");
		
		return new Subscribers(id, firstName, lastName);
	}
}
