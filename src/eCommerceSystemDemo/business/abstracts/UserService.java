package eCommerceSystemDemo.business.abstracts;


import java.util.List;

import eCommerceSystemDemo.entities.concretes.User;

public interface UserService {
	
	void signUp(User user);
	void logIn(User user);
	List<User> getAll();
	

}
