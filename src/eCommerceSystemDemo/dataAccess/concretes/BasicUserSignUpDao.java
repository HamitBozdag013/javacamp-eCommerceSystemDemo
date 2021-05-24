package eCommerceSystemDemo.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import eCommerceSystemDemo.dataAccess.abstracts.UserDao;
import eCommerceSystemDemo.entities.concretes.User;

public class BasicUserSignUpDao implements UserDao{
	
	public ArrayList<User> users = new ArrayList<User>();

	@Override
	public void signUp(User user) {
		System.out.println("With Basic User Sign up, User is sign up : " + user.getFirsName() + " " + user.getLastName());
		users.add(user);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}



}
