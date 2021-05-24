package eCommerceSystemDemo.business.concretes;


import java.util.List;

import eCommerceSystemDemo.business.abstracts.ControlService;
import eCommerceSystemDemo.business.abstracts.EmailValidationService;
import eCommerceSystemDemo.business.abstracts.UserService;
import eCommerceSystemDemo.dataAccess.abstracts.UserDao;
import eCommerceSystemDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private EmailValidationService emailValidationService;
	
	

		ControlService controlService = new ControlManager();
		
	
	
	public UserManager(UserDao userDao, EmailValidationService emailValidationService) {
		super();
		this.userDao = userDao;
		this.emailValidationService = emailValidationService;
		
		}
	
	


	@Override
	public void signUp(User user) {
		if(controlService.passwordControl(user) && controlService.emailControl(user) && controlService.usageControl(user) && controlService.userNameControl(user)) {
			this.userDao.signUp(user);
			this.emailValidationService.checkIfRealMail(user);
			System.out.println("User registration process completed \n");
			
		}
			
	}

	@Override
	public void logIn(User user) {
		if(user.getEmail()!=null && user.getPassword()!=null) {
			System.out.println("Logged in user : " + user.getFirsName() + " " + user.getLastName());
			System.out.println("Login successful. \n");
		}
		else {
			System.out.println("User not found. \nLogin failed. \n");
		}
				
		
	}


	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



	
	




	

}
