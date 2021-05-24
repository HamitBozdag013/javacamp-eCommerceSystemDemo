package eCommerceSystemDemo;


import eCommerceSystemDemo.business.abstracts.UserService;
import eCommerceSystemDemo.business.concretes.EmailValidationManager;
import eCommerceSystemDemo.business.concretes.UserManager;
import eCommerceSystemDemo.core.JGoogleAccountManagerAdapter;
import eCommerceSystemDemo.dataAccess.concretes.BasicUserSignUpDao;
import eCommerceSystemDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Hamit","Bozdað","bozdag.013@gmail.com","HB1234");
		User user2 = new User(2,"Merve","Bozdað","mervebozdag.013@gmail.com","MB12");
		User user3 = new User(3,"Erva","Bozdað","bozdag.013@gmail.com","EB1234");
		User user4 = new User(4,"Fahrettin","Bozdað","fbozdag.013gmail.com","FB1234");
		User user5 = new User(5,"Ali","T","Ali_80@gmail.com","AT1234");
		User user6 = new User(6,"G","Koçak","Gurkan.35@gmail.com","GK1234");
		User user7 = new User(7,"Orhan","Bozdað","orhanbozdag.013@gmail.com","ZB1234");
		User user8 = new User(8,"Zeyep","Bozdað","orhanbozdag.013@gmail.com","ZB1234");
		User user9 = new User(9,"Mehmet","Bozdað",null,"MB1234");
		
		
		
		UserService userService = new UserManager(new BasicUserSignUpDao(), new EmailValidationManager());
		UserService userService1 = new UserManager(new JGoogleAccountManagerAdapter(), new EmailValidationManager());
		
			
			userService.signUp(user1);
			userService.signUp(user2);
			userService.signUp(user3);
			userService.signUp(user4);
			userService.signUp(user5);
			userService.signUp(user6);
			
			userService1.signUp(user7);
			userService1.signUp(user8);
			
			userService.logIn(user1);
			userService.logIn(user9);

	}

}
