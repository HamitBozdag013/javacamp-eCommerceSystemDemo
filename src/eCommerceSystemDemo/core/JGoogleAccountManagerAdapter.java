package eCommerceSystemDemo.core;

import java.util.List;

import eCommerceSystemDemo.dataAccess.abstracts.UserDao;
import eCommerceSystemDemo.entities.concretes.User;
import eCommerceSystemDemo.jGoogleAccount.JGoogleAccountManager;


public class JGoogleAccountManagerAdapter implements UserDao{

	
	
	@Override
	public void signUp(User user) {
		JGoogleAccountManager manager= new JGoogleAccountManager();
		manager.singUp(user);
		
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
