package main;

import ua.lviv.User;
import ua.lviv.service.impl.UserServiceImpl;
import ua.lviv.sevice.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserService userService = new UserServiceImpl();
		userService.create(new User("test@test", "test","test","test"));
	}
	

}
