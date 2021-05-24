package eCommerceSystemDemo.business.abstracts;

import eCommerceSystemDemo.entities.concretes.User;

public interface ControlService {
	
	public boolean usageControl(User user);
	public boolean userNameControl(User user);
	public boolean passwordControl(User user);
	public boolean emailControl(User user);
	public boolean isValidLogin(User user);

}
