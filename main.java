package dao;

import model.User;

public class main {

	public static void main(String[] args) {
	
		UserDAO Ingrid = new UserDAO();
		Ingrid.create(new User("xxx", "Ingrid", "ingrid@yahoo.fr", "xoxo"));
	}

}
