package eCommerceSystemDemo.dataAccess.abstracts;

import java.util.List;

import eCommerceSystemDemo.entities.concretes.User;

public interface UserDao {
	
	public void signUp(User user);
	public List<User> getAll();

}
