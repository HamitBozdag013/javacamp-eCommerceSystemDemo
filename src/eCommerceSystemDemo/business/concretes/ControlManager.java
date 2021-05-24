package eCommerceSystemDemo.business.concretes;

import java.util.ArrayList;
import java.util.regex.*;

import eCommerceSystemDemo.business.abstracts.ControlService;
import eCommerceSystemDemo.entities.concretes.User;

public class ControlManager implements ControlService{
	
	private static final String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9]+[.]+(com|org|net|edu|gov|mil)";
	
	ArrayList<String> emailList = new ArrayList<String>();
	int flag=0;
	boolean control=true;

	@Override
	public boolean usageControl(User user) {
				
		if(flag==0) {
			emailList.add(user.getEmail());
			flag++;
			return control;
		}
		else {
					if(emailList.contains(user.getEmail())) {
					System.out.println("This email has already usaging ! \n");
					control=false;
				}
				else {
					emailList.add(user.getEmail());
					control=true;
					}
				
			return control;
							
			}
		}
		

	@Override
	public boolean userNameControl(User user) {
		if(user.getFirsName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}
		else {
			if(user.getFirsName().length()<2) {
				System.out.println("First Name less than two characters ! \n");
			}
			else {
				System.out.println("Last Name less than two characters ! \n");
			}
			return false;
		}
	}

	
	
	@Override
	public boolean passwordControl(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}
		else {
			System.out.println("This password is less than 6 characters ! \n");
			return false;
		}
	}

	
	
	@Override
	public boolean emailControl(User user) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if(matcher.matches()) {
			return true;
		}
		else {
			System.out.println("Incorrect email format ! \n");
			return false;
		}
		
		
	}


	@Override
	public boolean isValidLogin(User user) {
		// TODO Auto-generated method stub
		return false;
	}





}
