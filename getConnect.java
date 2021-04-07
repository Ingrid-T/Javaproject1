package dao;

import java.sql.DriverManager;
import java.sql.Connection;


public class getConnect {
	
	  public static Connection getConnection() {
	        Connection connect = null ;
	        String url ="jdbc:mysql://localhost/";
			String database = "afpa";
			String user ="root";
			String password ="";
	        
	        try {
	        Class.forName("com.mysql.jdbc.Driver");
	        connect =DriverManager.getConnection("jdbc:mysql://localhost/afpa","root","");
	        System.out.println("je suis bien connectée");}
	catch (Exception e) {
	        System.out.println("Connexion KO");
	        e.printStackTrace();
	    }

	    return connect;
}
}
