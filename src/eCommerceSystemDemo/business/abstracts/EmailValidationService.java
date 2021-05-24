package eCommerceSystemDemo.business.abstracts;

import eCommerceSystemDemo.entities.concretes.User;

public interface EmailValidationService {
	public boolean checkIfRealMail(User user);
}
