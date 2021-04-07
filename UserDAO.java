package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import model.User;

public class UserDAO implements IDAO <User>{

	Connection connect = getConnect.getConnection();

	@Override
	public void create(User object) {
	try {
			
			PreparedStatement req = connect.prepareStatement("INSERT INTO User"
					+ "(nom, prenom, email, mdp) VALUES (?,?,?,?) ");
			
			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			req.setString(3, object.getEmail());
			req.setString(4, object.getMdp());
			
			req.executeUpdate();
			
			System.out.println("Insertion OK");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Insertion KO");
	}
}

	@Override
	public void delete(User object) {
	try {
			
			PreparedStatement req = connect.prepareStatement("DELETE FROM User WHERE nom =?");
			
			req.setString(1, object.getNom());
		
			
			req.executeUpdate();
			
			System.out.println("Suppression OK");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Suppression KO");
	}
}
		

	@Override
	public void update(User object) {
	try {
			
			PreparedStatement req = connect.prepareStatement("UPDATE User SET nom=?, prenom=?, email=?, mdp=? WHERE nom =?");
			
			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			req.setString(3, object.getEmail());
			req.setString(4, object.getMdp());
		
			
			req.executeUpdate();
			
			System.out.println("Modification OK");
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Modification KO");
	}
}
		

	@Override
	public List<User> read() {
		
		return null;
	} }
