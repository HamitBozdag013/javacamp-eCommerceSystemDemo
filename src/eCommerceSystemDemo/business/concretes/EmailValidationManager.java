package eCommerceSystemDemo.business.concretes;

import eCommerceSystemDemo.business.abstracts.EmailValidationService;
import eCommerceSystemDemo.entities.concretes.User;

public class EmailValidationManager implements EmailValidationService {

	@Override
	public boolean checkIfRealMail(User user) {
		System.out.println("Email verified : " + user.getEmail());
		return true;
	}

}
