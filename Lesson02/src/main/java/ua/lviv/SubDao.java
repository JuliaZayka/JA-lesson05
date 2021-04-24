package ua.lviv;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubDao {

	private static String READ_ALL = "select * from subscribers";
	private static String CREATE = "insert into subscribers(`first_name`, `last_name`) values (?,?)";
	private static String READ_BY_ID = "select * from subscribers where id =?";
	private static String UPDATE_BY_ID = "update subscribers set first_name=?, last_name = ? where id = ?";
	private static String DELETE_BY_ID = "delete from subscribers where id=?";

	private Connection connection;
	private PreparedStatement preparedStatement;

	public SubDao(Connection connection) {
		this.connection = connection;
	}
	
	public void insert(Subscribers subscribers) throws SQLException {
		preparedStatement = connection.prepareStatement(CREATE);
		preparedStatement.setString(1, subscribers.getFirstName());
		preparedStatement.setString(2, subscribers.getLastName());
		preparedStatement.executeUpdate();
	}

	public Subscribers read(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(READ_BY_ID);
		preparedStatement.setInt(1, id);
		ResultSet result = preparedStatement.executeQuery();
		result.next();
		return SubMapper.map(result);
	}

	public void update(Subscribers subscribers) throws SQLException {
		preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
		preparedStatement.setString(1, subscribers.getFirstName());
		preparedStatement.setString(2, subscribers.getLastName());
		preparedStatement.setInt(3, subscribers.getId());
		preparedStatement.executeUpdate();
	}

	public void delete(int id) throws SQLException {
		preparedStatement = connection.prepareStatement(DELETE_BY_ID);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
	}

	public List<Subscribers> readAll() throws SQLException {
		List<Subscribers> listOfSubscribers = new ArrayList<>();
		preparedStatement = connection.prepareStatement(READ_ALL);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			listOfSubscribers.add(SubMapper.map(result));
		}
		return listOfSubscribers;
	}

}
