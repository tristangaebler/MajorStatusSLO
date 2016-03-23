package controller;

import model.MajorStatus;
import view.PopUpDisplay;

public class MajorController
{
	private PopUpDisplay myPopUp;
	private MajorStatus myMajor;
	private String userYear;
	private String userMajor;
	private String userFullMajor;
	private String userFullYear;
	

	public MajorController()
	{
		myPopUp = new PopUpDisplay();
	}
	
	public void start()
	{
		String userInput = myPopUp.grabAnswer("Please type in the first letter of your major, and the number corresponding with your year. (C2) or (I4)");
		userMajor = Character.toString(userInput.charAt(0));
		userYear = Character.toString(userInput.charAt(1));
		
		showUserMajor();
		showUserStatus();
		myPopUp.showResponse("Your major is " + userMajor + " and your are a " + userFullYear);
		
	}
	
	private void showUserMajor()
	{
		if(userMajor.equals('C') || userMajor.equals('c'))
		{
			userMajor = "Computer Science";
		}
		else if(userMajor.equals('M') || userMajor.equals('m'))
		{
			userMajor = "Mathematics";
		}
		else if(userMajor.equals('I') || userMajor.equals('i'))
		{
			userMajor = "Information Technology";
		}
		else
		{
			userMajor = "Error: Major Not Found";
		}
	}
	
	private void showUserStatus()
	{
		if(userYear.equals('1'))
		{
			userYear = "Freshmen";
		}
		else if(userYear.equals('2'))
		{
			userYear = "Sophmore";
		}
		else if(userYear.equals('3'))
		{
			userFullYear = "Junoir";
		}
		else if(userYear.equals('4'))
		{
			userYear = "Senoir";
		} 
		else
		{
			userYear = "Error: Year not found";
		}
	}
}
